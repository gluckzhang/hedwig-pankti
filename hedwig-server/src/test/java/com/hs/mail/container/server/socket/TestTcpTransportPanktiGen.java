package com.hs.mail.container.server.socket;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestTcpTransportPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetRemoteAddress1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.container.server.socket.TcpTransport.getRemoteAddress1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.container.server.socket.TcpTransport receivingObject = (com.hs.mail.container.server.socket.TcpTransport) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.net.Inet4Address resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
            "  <java.net.InetAddress>" +
            "    <default>" +
            "      <address>2130706433</address>" +
            "      <family>2</family>" +
            "    </default>" +
            "  </java.net.InetAddress>" +
            "</java.net.Inet4Address>";
            java.net.InetAddress expectedObject = (java.net.InetAddress) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getRemoteAddress());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetRemoteAddress2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.container.server.socket.TcpTransport.getRemoteAddress2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.container.server.socket.TcpTransport receivingObject = (com.hs.mail.container.server.socket.TcpTransport) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.net.Inet4Address resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
            "  <java.net.InetAddress>" +
            "    <default>" +
            "      <address>2130706433</address>" +
            "      <family>2</family>" +
            "    </default>" +
            "  </java.net.InetAddress>" +
            "</java.net.Inet4Address>";
            java.net.InetAddress expectedObject = (java.net.InetAddress) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getRemoteAddress());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}