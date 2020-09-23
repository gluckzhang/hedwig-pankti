package com.hs.mail.imap.dao;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestMySqlMailboxDaoPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetMailbox1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.MySqlMailboxDao.getMailbox1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.mailbox.Mailbox>" +
            "  <mailboxID>4</mailboxID>" +
            "  <name>INBOX</name>" +
            "  <ownerID>4</ownerID>" +
            "  <nextUID>880</nextUID>" +
            "  <uidValidity>1600194306829</uidValidity>" +
            "  <noInferiors>false</noInferiors>" +
            "  <noSelect>false</noSelect>" +
            "  <readOnly>false</readOnly>" +
            "  <marked>false</marked>" +
            "  <hasChildren>false</hasChildren>" +
            "</com.hs.mail.imap.mailbox.Mailbox>";
            com.hs.mail.imap.mailbox.Mailbox expectedObject = (com.hs.mail.imap.mailbox.Mailbox) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "  <string>INBOX</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getMailbox(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMailbox2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.MySqlMailboxDao.getMailbox2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.mailbox.Mailbox>" +
            "  <mailboxID>4</mailboxID>" +
            "  <name>INBOX</name>" +
            "  <ownerID>4</ownerID>" +
            "  <nextUID>881</nextUID>" +
            "  <uidValidity>1600194306829</uidValidity>" +
            "  <noInferiors>false</noInferiors>" +
            "  <noSelect>false</noSelect>" +
            "  <readOnly>false</readOnly>" +
            "  <marked>false</marked>" +
            "  <hasChildren>false</hasChildren>" +
            "</com.hs.mail.imap.mailbox.Mailbox>";
            com.hs.mail.imap.mailbox.Mailbox expectedObject = (com.hs.mail.imap.mailbox.Mailbox) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "  <string>INBOX</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getMailbox(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMailbox3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.MySqlMailboxDao.getMailbox3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.mailbox.Mailbox>" +
            "  <mailboxID>4</mailboxID>" +
            "  <name>INBOX</name>" +
            "  <ownerID>4</ownerID>" +
            "  <nextUID>881</nextUID>" +
            "  <uidValidity>1600194306829</uidValidity>" +
            "  <noInferiors>false</noInferiors>" +
            "  <noSelect>false</noSelect>" +
            "  <readOnly>false</readOnly>" +
            "  <marked>false</marked>" +
            "  <hasChildren>false</hasChildren>" +
            "</com.hs.mail.imap.mailbox.Mailbox>";
            com.hs.mail.imap.mailbox.Mailbox expectedObject = (com.hs.mail.imap.mailbox.Mailbox) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "  <string>INBOX</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getMailbox(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMailbox4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.MySqlMailboxDao.getMailbox4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.mailbox.Mailbox>" +
            "  <mailboxID>4</mailboxID>" +
            "  <name>INBOX</name>" +
            "  <ownerID>4</ownerID>" +
            "  <nextUID>882</nextUID>" +
            "  <uidValidity>1600194306829</uidValidity>" +
            "  <noInferiors>false</noInferiors>" +
            "  <noSelect>false</noSelect>" +
            "  <readOnly>false</readOnly>" +
            "  <marked>false</marked>" +
            "  <hasChildren>false</hasChildren>" +
            "</com.hs.mail.imap.mailbox.Mailbox>";
            com.hs.mail.imap.mailbox.Mailbox expectedObject = (com.hs.mail.imap.mailbox.Mailbox) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "  <string>INBOX</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getMailbox(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testMailboxExists1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.MySqlMailboxDao.mailboxExists1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "  <string>INBOX</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.mailboxExists(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testMailboxExists2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.MySqlMailboxDao.mailboxExists2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "  <string>INBOX</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.mailboxExists(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFirstUnseenMessageID1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.MySqlMailboxDao.getFirstUnseenMessageID1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>845</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFirstUnseenMessageID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFirstUnseenMessageID2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.MySqlMailboxDao.getFirstUnseenMessageID2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>845</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFirstUnseenMessageID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}