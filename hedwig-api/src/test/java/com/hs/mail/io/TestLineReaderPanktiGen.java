package com.hs.mail.io;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestLineReaderPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testReadLine1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.LineReader.readLine1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.LineReader receivingObject = (com.hs.mail.io.LineReader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>rcpt TO:&lt;test-receiver@localhost&gt;</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testReadLine2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.LineReader.readLine2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.LineReader receivingObject = (com.hs.mail.io.LineReader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>ehlo [127.0.1.1]</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testReadLine3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.LineReader.readLine3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.LineReader receivingObject = (com.hs.mail.io.LineReader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>mail FROM:&lt;test-sender@localhost&gt;</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testReadLine4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.LineReader.readLine4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.LineReader receivingObject = (com.hs.mail.io.LineReader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>data</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testReadLine5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.LineReader.readLine5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.LineReader receivingObject = (com.hs.mail.io.LineReader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>data</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testReadLine6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.LineReader.readLine6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.LineReader receivingObject = (com.hs.mail.io.LineReader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>mail FROM:&lt;test-sender@localhost&gt;</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testReadLine7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.LineReader.readLine7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.LineReader receivingObject = (com.hs.mail.io.LineReader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>ehlo [127.0.1.1]</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testReadLine8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.LineReader.readLine8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.LineReader receivingObject = (com.hs.mail.io.LineReader) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>rcpt TO:&lt;test-receiver@localhost&gt;</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}