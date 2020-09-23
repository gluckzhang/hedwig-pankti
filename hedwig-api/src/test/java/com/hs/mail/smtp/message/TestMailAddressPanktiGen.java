package com.hs.mail.smtp.message;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestMailAddressPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetHost1() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.Recipient>" +
        "  <address>test-receiver@localhost</address>" +
        "  <id>-1</id>" +
        "</com.hs.mail.smtp.message.Recipient>";
        com.hs.mail.smtp.message.Recipient receivingObject = (com.hs.mail.smtp.message.Recipient) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>localhost</string>";
        java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getHost());
    }

    @Test
    public void testGetHost2() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.Recipient>" +
        "  <address>test-receiver@localhost</address>" +
        "  <id>4</id>" +
        "</com.hs.mail.smtp.message.Recipient>";
        com.hs.mail.smtp.message.Recipient receivingObject = (com.hs.mail.smtp.message.Recipient) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>localhost</string>";
        java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getHost());
    }

    @Test
    public void testCompareTo1() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.Recipient>" +
        "  <address>test-receiver@localhost</address>" +
        "  <id>-1</id>" +
        "</com.hs.mail.smtp.message.Recipient>";
        com.hs.mail.smtp.message.Recipient receivingObject = (com.hs.mail.smtp.message.Recipient) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <com.hs.mail.smtp.message.Recipient>" +
        "    <address>test-receiver@localhost</address>" +
        "    <id>-1</id>" +
        "  </com.hs.mail.smtp.message.Recipient>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.lang.Object paramObject1 = (java.lang.Object) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.compareTo(paramObject1));
    }

    @Test
    public void testGetUser1() {
        String receivingXML = 
        "<com.hs.mail.smtp.message.Recipient>" +
        "  <address>test-receiver@localhost</address>" +
        "  <id>4</id>" +
        "</com.hs.mail.smtp.message.Recipient>";
        com.hs.mail.smtp.message.Recipient receivingObject = (com.hs.mail.smtp.message.Recipient) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>test-receiver</string>";
        java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getUser());
    }
}