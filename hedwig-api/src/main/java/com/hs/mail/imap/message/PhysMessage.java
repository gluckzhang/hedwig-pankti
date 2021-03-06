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
package com.hs.mail.imap.message;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import com.hs.mail.container.config.Config;

/**
 * 
 * @author Won Chul Doh
 * @since May 25, 2010
 *
 */
public class PhysMessage {

	private long physMessageID;
	private Date internalDate;

	public PhysMessage() {
		super();
	}

	public long getPhysMessageID() {
		return physMessageID;
	}

	public void setPhysMessageID(long physmessageid) {
		this.physMessageID = physmessageid;
	}

	public Date getInternalDate() {
		return internalDate;
	}

	public void setInternalDate(Date internalDate) {
		this.internalDate = internalDate;
	}

	public void deleteFile() throws IOException {
		File dataFile = Config.getDataFile(internalDate, physMessageID);
		FileUtils.forceDelete(dataFile);
		File descFile = Config.getMimeDescriptorFile(internalDate, physMessageID);
		if (descFile.exists()) {
			FileUtils.forceDelete(descFile);
		}
	}
	
}
