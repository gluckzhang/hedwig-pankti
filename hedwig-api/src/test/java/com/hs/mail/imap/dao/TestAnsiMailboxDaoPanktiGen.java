package com.hs.mail.imap.dao;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestAnsiMailboxDaoPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetMessageCount1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMailboxDao.getMessageCount1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>37</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getMessageCount(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMessageCount2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMailboxDao.getMessageCount2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>38</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getMessageCount(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetRecentMessageCount1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMailboxDao.getRecentMessageCount1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getRecentMessageCount(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetRecentMessageCount2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMailboxDao.getRecentMessageCount2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getRecentMessageCount(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDeletedMessageIDList1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMailboxDao.getDeletedMessageIDList1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<list/>";
            java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getDeletedMessageIDList(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDeletedMessageIDList2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMailboxDao.getDeletedMessageIDList2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMailboxDao receivingObject = (com.hs.mail.imap.dao.MySqlMailboxDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<list/>";
            java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getDeletedMessageIDList(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}