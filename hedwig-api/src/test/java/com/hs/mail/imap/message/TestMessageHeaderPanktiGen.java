package com.hs.mail.imap.message;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestMessageHeaderPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetSubject1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.message.MessageHeader.getSubject1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MessageHeader receivingObject = (com.hs.mail.imap.message.MessageHeader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>[SEWORLD] Tenure-track or Tenured Position - CRC Tier II in Pervasive Computing for Health and Healthy Aging - Concordia Univ., Montreal, QC, Canada</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getSubject());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetSubject2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.message.MessageHeader.getSubject2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MessageHeader receivingObject = (com.hs.mail.imap.message.MessageHeader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>cs daily Subj-class mailing ffffffff 126</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getSubject());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDate1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.message.MessageHeader.getDate1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MessageHeader receivingObject = (com.hs.mail.imap.message.MessageHeader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<date>2020-03-13 08:17:12.0 UTC</date>";
            java.util.Date expectedObject = (java.util.Date) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDate2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.message.MessageHeader.getDate2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MessageHeader receivingObject = (com.hs.mail.imap.message.MessageHeader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<date>2020-02-21 15:12:46.0 UTC</date>";
            java.util.Date expectedObject = (java.util.Date) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFrom1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.message.MessageHeader.getFrom1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MessageHeader receivingObject = (com.hs.mail.imap.message.MessageHeader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Wahab Hamou-Lhadj &lt;wahab.hamou-lhadj@concordia.ca&gt;</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getFrom());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFrom2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.message.MessageHeader.getFrom2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.message.MessageHeader receivingObject = (com.hs.mail.imap.message.MessageHeader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>no-reply@arXiv.org (send mail ONLY to cs)</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getFrom());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}