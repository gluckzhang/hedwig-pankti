package com.hs.mail.imap.message;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestMailMessagePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetInputStream1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.message.MailMessage.getInputStream1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MailMessage receivingObject = (com.hs.mail.imap.message.MailMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.io.FileInputStream>" +
            "  <fd>" +
            "    <fd>130</fd>" +
            "    <handle>-1</handle>" +
            "    <parent class=\"java.io.FileInputStream\" reference=\"../..\"/>" +
            "    <closed>false</closed>" +
            "    <append>false</append>" +
            "    <cleanup class=\"java.io.FileCleanable\"/>" +
            "  </fd>" +
            "  <path>../spool/1600853557618-1</path>" +
            "  <closeLock/>" +
            "  <closed>false</closed>" +
            "</java.io.FileInputStream>";
            java.io.InputStream expectedObject = (java.io.InputStream) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInputStream2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.message.MailMessage.getInputStream2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MailMessage receivingObject = (com.hs.mail.imap.message.MailMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.io.FileInputStream>" +
            "  <fd>" +
            "    <fd>130</fd>" +
            "    <handle>-1</handle>" +
            "    <parent class=\"java.io.FileInputStream\" reference=\"../..\"/>" +
            "    <closed>false</closed>" +
            "    <append>false</append>" +
            "    <cleanup class=\"java.io.FileCleanable\"/>" +
            "  </fd>" +
            "  <path>../spool/1600853481206-0</path>" +
            "  <closeLock/>" +
            "  <closed>false</closed>" +
            "</java.io.FileInputStream>";
            java.io.InputStream expectedObject = (java.io.InputStream) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}