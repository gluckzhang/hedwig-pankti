package com.hs.mail.imap.dao;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestAnsiUserDaoPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetUserByAddress1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiUserDao.getUserByAddress1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlUserDao receivingObject = (com.hs.mail.imap.dao.MySqlUserDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.user.User>" +
            "  <id>4</id>" +
            "  <userID>test-receiver@localhost</userID>" +
            "  <passwd>654321</passwd>" +
            "  <quota>0</quota>" +
            "</com.hs.mail.imap.user.User>";
            com.hs.mail.imap.user.User expectedObject = (com.hs.mail.imap.user.User) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getUserByAddress(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetUserByAddress2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiUserDao.getUserByAddress2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlUserDao receivingObject = (com.hs.mail.imap.dao.MySqlUserDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.user.User>" +
            "  <id>4</id>" +
            "  <userID>test-receiver@localhost</userID>" +
            "  <passwd>654321</passwd>" +
            "  <quota>0</quota>" +
            "</com.hs.mail.imap.user.User>";
            com.hs.mail.imap.user.User expectedObject = (com.hs.mail.imap.user.User) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getUserByAddress(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetUserByAddress3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiUserDao.getUserByAddress3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlUserDao receivingObject = (com.hs.mail.imap.dao.MySqlUserDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.user.User>" +
            "  <id>4</id>" +
            "  <userID>test-receiver@localhost</userID>" +
            "  <passwd>654321</passwd>" +
            "  <quota>0</quota>" +
            "</com.hs.mail.imap.user.User>";
            com.hs.mail.imap.user.User expectedObject = (com.hs.mail.imap.user.User) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getUserByAddress(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetUserByAddress4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiUserDao.getUserByAddress4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlUserDao receivingObject = (com.hs.mail.imap.dao.MySqlUserDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.user.User>" +
            "  <id>4</id>" +
            "  <userID>test-receiver@localhost</userID>" +
            "  <passwd>654321</passwd>" +
            "  <quota>0</quota>" +
            "</com.hs.mail.imap.user.User>";
            com.hs.mail.imap.user.User expectedObject = (com.hs.mail.imap.user.User) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getUserByAddress(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}