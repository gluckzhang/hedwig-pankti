package com.hs.mail.container.server.socket;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestDefaultServerSocketFactoryPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testCreateServerSocket1() throws IOException {
        String receivingXML = 
        "<com.hs.mail.container.server.socket.DefaultServerSocketFactory/>";
        com.hs.mail.container.server.socket.DefaultServerSocketFactory receivingObject = (com.hs.mail.container.server.socket.DefaultServerSocketFactory) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<java.net.ServerSocket>" +
        "  <created>true</created>" +
        "  <bound>true</bound>" +
        "  <closed>false</closed>" +
        "  <closeLock/>" +
        "  <impl class=\"java.net.SocksSocketImpl\">" +
        "    <serverSocket reference=\"../..\"/>" +
        "    <fd>" +
        "      <fd>128</fd>" +
        "      <handle>-1</handle>" +
        "      <closed>false</closed>" +
        "      <append>false</append>" +
        "      <cleanup class=\"java.net.SocketCleanable\"/>" +
        "    </fd>" +
        "    <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "      <java.net.InetAddress>" +
        "        <default>" +
        "          <hostName>0.0.0.0</hostName>" +
        "          <address>0</address>" +
        "          <family>2</family>" +
        "        </default>" +
        "      </java.net.InetAddress>" +
        "    </address>" +
        "    <port>0</port>" +
        "    <localport>30110</localport>" +
        "    <timeout>0</timeout>" +
        "    <trafficClass>0</trafficClass>" +
        "    <shut__rd>false</shut__rd>" +
        "    <shut__wr>false</shut__wr>" +
        "    <fdUseCount>0</fdUseCount>" +
        "    <fdLock/>" +
        "    <closePending>false</closePending>" +
        "    <connectionReset>false</connectionReset>" +
        "    <stream>true</stream>" +
        "    <serverPort>1080</serverPort>" +
        "    <useV4>false</useV4>" +
        "    <applicationSetProxy>false</applicationSetProxy>" +
        "  </impl>" +
        "  <oldImpl>false</oldImpl>" +
        "</java.net.ServerSocket>";
        java.net.ServerSocket expectedObject = (java.net.ServerSocket) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>30110</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.createServerSocket(paramObject1));
    }

    @Test
    public void testCreateServerSocket2() throws IOException {
        String receivingXML = 
        "<com.hs.mail.container.server.socket.DefaultServerSocketFactory/>";
        com.hs.mail.container.server.socket.DefaultServerSocketFactory receivingObject = (com.hs.mail.container.server.socket.DefaultServerSocketFactory) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<java.net.ServerSocket>" +
        "  <created>true</created>" +
        "  <bound>true</bound>" +
        "  <closed>false</closed>" +
        "  <closeLock/>" +
        "  <impl class=\"java.net.SocksSocketImpl\">" +
        "    <serverSocket reference=\"../..\"/>" +
        "    <fd>" +
        "      <fd>127</fd>" +
        "      <handle>-1</handle>" +
        "      <closed>false</closed>" +
        "      <append>false</append>" +
        "      <cleanup class=\"java.net.SocketCleanable\"/>" +
        "    </fd>" +
        "    <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "      <java.net.InetAddress>" +
        "        <default>" +
        "          <hostName>0.0.0.0</hostName>" +
        "          <address>0</address>" +
        "          <family>2</family>" +
        "        </default>" +
        "      </java.net.InetAddress>" +
        "    </address>" +
        "    <port>0</port>" +
        "    <localport>30025</localport>" +
        "    <timeout>0</timeout>" +
        "    <trafficClass>0</trafficClass>" +
        "    <shut__rd>false</shut__rd>" +
        "    <shut__wr>false</shut__wr>" +
        "    <fdUseCount>0</fdUseCount>" +
        "    <fdLock/>" +
        "    <closePending>false</closePending>" +
        "    <connectionReset>false</connectionReset>" +
        "    <stream>true</stream>" +
        "    <serverPort>1080</serverPort>" +
        "    <useV4>false</useV4>" +
        "    <applicationSetProxy>false</applicationSetProxy>" +
        "  </impl>" +
        "  <oldImpl>false</oldImpl>" +
        "</java.net.ServerSocket>";
        java.net.ServerSocket expectedObject = (java.net.ServerSocket) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>30025</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.createServerSocket(paramObject1));
    }
}