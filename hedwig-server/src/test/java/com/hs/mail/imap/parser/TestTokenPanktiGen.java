package com.hs.mail.imap.parser;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestTokenPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testIsLiteral1() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.Token>" +
        "  <type>KEYWORD</type>" +
        "  <value>CAPABILITY</value>" +
        "</com.hs.mail.imap.parser.Token>";
        com.hs.mail.imap.parser.Token receivingObject = (com.hs.mail.imap.parser.Token) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isLiteral());
    }

    @Test
    public void testIsLiteral2() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.Token>" +
        "  <type>QUOTED</type>" +
        "  <value>654321</value>" +
        "</com.hs.mail.imap.parser.Token>";
        com.hs.mail.imap.parser.Token receivingObject = (com.hs.mail.imap.parser.Token) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isLiteral());
    }

    @Test
    public void testIsLiteral3() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.Token>" +
        "  <type>KEYWORD</type>" +
        "  <value>INBOX</value>" +
        "</com.hs.mail.imap.parser.Token>";
        com.hs.mail.imap.parser.Token receivingObject = (com.hs.mail.imap.parser.Token) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isLiteral());
    }

    @Test
    public void testIsLiteral4() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.Token>" +
        "  <type>KEYWORD</type>" +
        "  <value>LOGOUT</value>" +
        "</com.hs.mail.imap.parser.Token>";
        com.hs.mail.imap.parser.Token receivingObject = (com.hs.mail.imap.parser.Token) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isLiteral());
    }

    @Test
    public void testIsLiteral5() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.Token>" +
        "  <type>KEYWORD</type>" +
        "  <value>ALL</value>" +
        "</com.hs.mail.imap.parser.Token>";
        com.hs.mail.imap.parser.Token receivingObject = (com.hs.mail.imap.parser.Token) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isLiteral());
    }

    @Test
    public void testIsLiteral6() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.Token>" +
        "  <type>KEYWORD</type>" +
        "  <value>CLOSE</value>" +
        "</com.hs.mail.imap.parser.Token>";
        com.hs.mail.imap.parser.Token receivingObject = (com.hs.mail.imap.parser.Token) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isLiteral());
    }

    @Test
    public void testIsLiteral7() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.Token>" +
        "  <type>RPAREN</type>" +
        "  <value>)</value>" +
        "</com.hs.mail.imap.parser.Token>";
        com.hs.mail.imap.parser.Token receivingObject = (com.hs.mail.imap.parser.Token) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isLiteral());
    }
}