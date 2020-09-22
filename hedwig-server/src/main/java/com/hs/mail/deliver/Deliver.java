/*
 * Copyright 2010 the original author or authors.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.hs.mail.deliver;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.james.mime4j.dom.address.Address;
import org.apache.james.mime4j.dom.address.AddressList;
import org.apache.james.mime4j.dom.address.Mailbox;
import org.apache.james.mime4j.dom.field.FieldName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.hs.mail.container.config.Config;
import com.hs.mail.imap.message.MessageHeader;
import com.hs.mail.smtp.message.MailAddress;
import com.hs.mail.smtp.message.Recipient;
import com.hs.mail.smtp.message.SmtpMessage;

/**
 * 
 * @author Won Chul Doh
 * @since Jun 21, 2010
 * 
 */

@SuppressWarnings("static-access")
public class Deliver {
	
	static Logger logger = LoggerFactory.getLogger(Deliver.class);

	/**
	 * Delivery was successful.
	 */
	private static final int EX_OK = 0;
	/**
	 * Invalid parameter given.
	 */
	private static final int EX_USAGE = 64;
	/**
	 * A temporary failure. This is returned for almost all failures. See the
	 * log file for details.
	 */
	private static final int EX_TEMPFAIL = 75;
	/**
	 * Mail was rejected. Typically this happens when user is over quota.
	 */
	//private static final int EX_NOPERM = 77;
	/**
	 * Failed to read configuration file, a missing configuration setting.
	 */
	private static final int EX_CONFIG = 78;

	private static final String DEFAULT_CONFIG_LOCATION = "../conf/default.properties";
	
	private File spool;

	private static final Options OPTS = new Options();
	static {
		OPTS.addOption(OptionBuilder.withArgName("file")
							.hasArg()
							.withDescription("Configuration file path")
							.create("c"));
		OPTS.addOption(OptionBuilder.withArgName("file")
							.hasArg()
							.isRequired()
							.withDescription("Path to the mail to be delivered")
							.create("p"));
		OPTS.addOption(OptionBuilder.withArgName("address")
							.hasArg()
							.withDescription("Envelope sender address")
							.create("f"));
		OPTS.addOption(OptionBuilder.withArgName("addresses")
							.hasArgs()
							.withDescription("List of destination addresses")
							.create("r"));
	}
	
	private void init(String path) {
		try {
			File configFile = new File(path);
			Properties props = PropertiesLoaderUtils
					.loadProperties(new FileSystemResource(configFile));
			String dir = props.getProperty("queue_directory");
			spool = (dir != null) 
					? new File(dir) 
					: new File(configFile.getParentFile().getParentFile(), "spool");
			if (!spool.isDirectory()) {
				logger.error("Spool directory does not exist: {}",
						spool.getAbsolutePath());
				System.exit(EX_CONFIG);
			}
			Config.setSpoolDirectory(spool);
		} catch (IOException ex) {
			logger.error(ex.getMessage(), ex);
			System.exit(EX_CONFIG);
		}
	}
	
	private void deliver(String from, String[] rcpts, File file) {
		SmtpMessage message = null;
		try {
			MailAddress sender = new MailAddress(from, false);
			message = new SmtpMessage(sender, SmtpMessage.LOCAL);
			for (int i = 0; i < rcpts.length; i++) {
				Recipient rcpt = new Recipient(rcpts[i], false);
				message.addRecipient(rcpt);
			}
			FileUtils.moveFile(file, message.getDataFile());
			message.store();
			message.createTrigger();
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			// If exception caught, remove temporary files
			if (message != null) {
				message.dispose();
			}
			System.exit(EX_TEMPFAIL);
		}
	}
	
	public static void main(String[] args) {
		CommandLine cli = null;
		try {
			cli = new PosixParser().parse(OPTS, args);
		} catch (ParseException e) {
			usage();
			System.exit(EX_USAGE);
		}
		
		// Configuration file path
		String config = cli.getOptionValue("c", DEFAULT_CONFIG_LOCATION);
		// Message file path
		File file = new File(cli.getOptionValue("p"));
		// Envelope sender address
		String from = cli.getOptionValue("f");
		// Destination mailboxes
		String[] rcpts = cli.getOptionValues("r");
		
		if (!file.exists()) {
			// Message file must exist
			logger.error("File not exist: {}", file.getAbsolutePath());
			System.exit(EX_TEMPFAIL);
		}
		
		if (from == null || rcpts == null) {
			// If sender or recipients address was not specified, get the
			// addresses from the message header.
			try {
				MessageHeader header = new MessageHeader(file);
				if (from == null) {
					from = header.getFromAddress();
				}
				if (rcpts == null) {
					rcpts = getRecipients(header);
				}
			} catch (IOException ex) {
				logger.error(ex.getMessage(), ex);
				System.exit(EX_TEMPFAIL);
			}
		}
		
		if (from == null || ArrayUtils.isEmpty(rcpts)) {
			usage();
			System.exit(EX_USAGE);
		}
		
		Deliver deliver = new Deliver();

		deliver.init(config);
		// Spool the incoming message
		deliver.deliver(from, rcpts, file);

		System.exit(EX_OK);
	}

	private static String[] getRecipients(MessageHeader header) {
		Set<String> rcpts = new HashSet<String>();
		getRecipients(header.getAddressList(FieldName.TO), rcpts);
		getRecipients(header.getAddressList(FieldName.CC), rcpts);
		getRecipients(header.getAddressList(FieldName.BCC), rcpts);
		return rcpts.toArray(new String[0]);
	}
	
	private static void getRecipients(AddressList addresses, Set<String> rcpts) {
		if (addresses != null) {
			for (Address address : addresses) {
				if (address instanceof Mailbox) {
					Mailbox mailbox = (Mailbox) address;
					rcpts.add(mailbox.getAddress());
				}
			}
		}
	}
	
	private static void usage() {
		HelpFormatter hf = new HelpFormatter();
		String runProgram = "java " + Deliver.class.getName() + " [options]";
		hf.printHelp(runProgram, OPTS);
	}
	
}