package com.hs.mail.smtp.message;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestSmtpMessagePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetDate1() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.SmtpMessage>" +
        "  <name>1600855714294-0</name>" +
        "  <node>3</node>" +
        "  <from>" +
        "    <address>test-sender@localhost</address>" +
        "  </from>" +
        "  <recipients class=\"sorted-set\">" +
        "    <com.hs.mail.smtp.message.Recipient>" +
        "      <address>test-receiver@localhost</address>" +
        "      <id>-1</id>" +
        "    </com.hs.mail.smtp.message.Recipient>" +
        "  </recipients>" +
        "  <retryCount>0</retryCount>" +
        "  <lastUpdate>2020-09-23 10:08:34.294 UTC</lastUpdate>" +
        "</com.hs.mail.smtp.message.SmtpMessage>";
        com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>Wed, 23 Sep 2020 12:08:34 +0200 (CEST)</string>";
        java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getDate());
    }

    @Test
    public void testGetDate2() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.SmtpMessage>" +
        "  <name>1600855789988-1</name>" +
        "  <node>3</node>" +
        "  <from>" +
        "    <address>test-sender@localhost</address>" +
        "  </from>" +
        "  <recipients class=\"sorted-set\">" +
        "    <com.hs.mail.smtp.message.Recipient>" +
        "      <address>test-receiver@localhost</address>" +
        "      <id>-1</id>" +
        "    </com.hs.mail.smtp.message.Recipient>" +
        "  </recipients>" +
        "  <retryCount>0</retryCount>" +
        "  <lastUpdate>2020-09-23 10:09:49.988 UTC</lastUpdate>" +
        "</com.hs.mail.smtp.message.SmtpMessage>";
        com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>Wed, 23 Sep 2020 12:09:49 +0200 (CEST)</string>";
        java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getDate());
    }

    @Test
    public void testGetDataFile1() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.SmtpMessage>" +
        "  <name>1600855789988-1</name>" +
        "  <node>3</node>" +
        "  <from>" +
        "    <address>test-sender@localhost</address>" +
        "  </from>" +
        "  <recipients class=\"sorted-set\">" +
        "    <com.hs.mail.smtp.message.Recipient>" +
        "      <address>test-receiver@localhost</address>" +
        "      <id>-1</id>" +
        "    </com.hs.mail.smtp.message.Recipient>" +
        "  </recipients>" +
        "  <retryCount>0</retryCount>" +
        "  <lastUpdate>2020-09-23 10:09:49.988 UTC</lastUpdate>" +
        "</com.hs.mail.smtp.message.SmtpMessage>";
        com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<file>../spool/1600855789988-1</file>";
        java.io.File expectedObject = (java.io.File) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getDataFile());
    }

    @Test
    public void testGetDataFile2() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.SmtpMessage>" +
        "  <name>1600855789988-1</name>" +
        "  <node>3</node>" +
        "  <from>" +
        "    <address>test-sender@localhost</address>" +
        "  </from>" +
        "  <recipients class=\"sorted-set\"/>" +
        "  <retryCount>0</retryCount>" +
        "  <lastUpdate>2020-09-23 10:09:49.988 UTC</lastUpdate>" +
        "</com.hs.mail.smtp.message.SmtpMessage>";
        com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<file>../spool/1600855789988-1</file>";
        java.io.File expectedObject = (java.io.File) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getDataFile());
    }

    @Test
    public void testGetDataFile3() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.SmtpMessage>" +
        "  <name>1600855714294-0</name>" +
        "  <node>3</node>" +
        "  <from>" +
        "    <address>test-sender@localhost</address>" +
        "  </from>" +
        "  <recipients class=\"sorted-set\"/>" +
        "  <retryCount>0</retryCount>" +
        "  <lastUpdate>2020-09-23 10:08:34.294 UTC</lastUpdate>" +
        "</com.hs.mail.smtp.message.SmtpMessage>";
        com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<file>../spool/1600855714294-0</file>";
        java.io.File expectedObject = (java.io.File) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getDataFile());
    }

    @Test
    public void testGetDataFile4() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.SmtpMessage>" +
        "  <name>1600855714294-0</name>" +
        "  <node>3</node>" +
        "  <from>" +
        "    <address>test-sender@localhost</address>" +
        "  </from>" +
        "  <recipients class=\"sorted-set\">" +
        "    <com.hs.mail.smtp.message.Recipient>" +
        "      <address>test-receiver@localhost</address>" +
        "      <id>-1</id>" +
        "    </com.hs.mail.smtp.message.Recipient>" +
        "  </recipients>" +
        "  <retryCount>0</retryCount>" +
        "  <lastUpdate>2020-09-23 10:08:34.294 UTC</lastUpdate>" +
        "</com.hs.mail.smtp.message.SmtpMessage>";
        com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<file>../spool/1600855714294-0</file>";
        java.io.File expectedObject = (java.io.File) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getDataFile());
    }

    @Test
    public void testGetMailMessage1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.hs.mail.smtp.message.SmtpMessage>" +
            "  <name>1600855714294-0</name>" +
            "  <node>3</node>" +
            "  <from>" +
            "    <address>test-sender@localhost</address>" +
            "  </from>" +
            "  <recipients class=\"sorted-set\"/>" +
            "  <retryCount>0</retryCount>" +
            "  <lastUpdate>2020-09-23 10:08:34.294 UTC</lastUpdate>" +
            "</com.hs.mail.smtp.message.SmtpMessage>";
            com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("com.hs.mail.smtp.message.SmtpMessage.getMailMessage1-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MailMessage expectedObject = (com.hs.mail.imap.message.MailMessage) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMailMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMailMessage2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.hs.mail.smtp.message.SmtpMessage>" +
            "  <name>1600855714294-0</name>" +
            "  <node>3</node>" +
            "  <from>" +
            "    <address>test-sender@localhost</address>" +
            "  </from>" +
            "  <recipients class=\"sorted-set\"/>" +
            "  <retryCount>0</retryCount>" +
            "  <lastUpdate>2020-09-23 10:08:34.294 UTC</lastUpdate>" +
            "</com.hs.mail.smtp.message.SmtpMessage>";
            com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("com.hs.mail.smtp.message.SmtpMessage.getMailMessage2-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MailMessage expectedObject = (com.hs.mail.imap.message.MailMessage) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMailMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMailMessage3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.hs.mail.smtp.message.SmtpMessage>" +
            "  <name>1600855789988-1</name>" +
            "  <node>3</node>" +
            "  <from>" +
            "    <address>test-sender@localhost</address>" +
            "  </from>" +
            "  <recipients class=\"sorted-set\"/>" +
            "  <retryCount>0</retryCount>" +
            "  <lastUpdate>2020-09-23 10:09:49.988 UTC</lastUpdate>" +
            "</com.hs.mail.smtp.message.SmtpMessage>";
            com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("com.hs.mail.smtp.message.SmtpMessage.getMailMessage3-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MailMessage expectedObject = (com.hs.mail.imap.message.MailMessage) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMailMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMailMessage4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.hs.mail.smtp.message.SmtpMessage>" +
            "  <name>1600855789988-1</name>" +
            "  <node>3</node>" +
            "  <from>" +
            "    <address>test-sender@localhost</address>" +
            "  </from>" +
            "  <recipients class=\"sorted-set\"/>" +
            "  <retryCount>0</retryCount>" +
            "  <lastUpdate>2020-09-23 10:09:49.988 UTC</lastUpdate>" +
            "</com.hs.mail.smtp.message.SmtpMessage>";
            com.hs.mail.smtp.message.SmtpMessage receivingObject = (com.hs.mail.smtp.message.SmtpMessage) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("com.hs.mail.smtp.message.SmtpMessage.getMailMessage4-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MailMessage expectedObject = (com.hs.mail.imap.message.MailMessage) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMailMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}