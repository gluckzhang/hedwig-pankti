package com.hs.mail.imap.user;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestDefaultUserManagerPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testRewriteAddress1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.rewriteAddress1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>test-receiver@localhost</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.rewriteAddress(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRewriteAddress2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.rewriteAddress2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>test-receiver@localhost</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.rewriteAddress(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRewriteAddress3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.rewriteAddress3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>test-receiver@localhost</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.rewriteAddress(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRewriteAddress4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.rewriteAddress4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>test-receiver@localhost</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.rewriteAddress(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetUserByAddress1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.getUserByAddress1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
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
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.getUserByAddress2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
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
    public void testGetUserHome1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.getUserHome1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<file>../data/localhost/users/tr/test-receiver</file>";
            java.io.File expectedObject = (java.io.File) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <com.hs.mail.smtp.message.Recipient>" +
            "    <address>test-receiver@localhost</address>" +
            "    <id>4</id>" +
            "  </com.hs.mail.smtp.message.Recipient>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.hs.mail.smtp.message.MailAddress paramObject1 = (com.hs.mail.smtp.message.MailAddress) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getUserHome(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetUserHome2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.getUserHome2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<file>../data/localhost/users/tr/test-receiver</file>";
            java.io.File expectedObject = (java.io.File) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <com.hs.mail.smtp.message.Recipient>" +
            "    <address>test-receiver@localhost</address>" +
            "    <id>4</id>" +
            "  </com.hs.mail.smtp.message.Recipient>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.hs.mail.smtp.message.MailAddress paramObject1 = (com.hs.mail.smtp.message.MailAddress) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getUserHome(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testLogin1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.login1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>4</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "  <string>654321</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.login(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testLogin2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.user.DefaultUserManager.login2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.user.DefaultUserManager receivingObject = (com.hs.mail.imap.user.DefaultUserManager) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>4</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>test-receiver@localhost</string>" +
            "  <string>654321</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.login(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}