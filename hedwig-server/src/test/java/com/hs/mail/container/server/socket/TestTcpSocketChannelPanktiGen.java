package com.hs.mail.container.server.socket;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestTcpSocketChannelPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetInputStream1() throws IOException {
        String receivingXML = 
        "<com.hs.mail.container.server.socket.TcpSocketChannel>" +
        "  <socket>" +
        "    <created>true</created>" +
        "    <bound>true</bound>" +
        "    <connected>true</connected>" +
        "    <closed>false</closed>" +
        "    <closeLock/>" +
        "    <shutIn>false</shutIn>" +
        "    <shutOut>false</shutOut>" +
        "    <impl class=\"java.net.SocksSocketImpl\">" +
        "      <socket reference=\"../..\"/>" +
        "      <fd>" +
        "        <fd>132</fd>" +
        "        <handle>-1</handle>" +
        "        <closed>false</closed>" +
        "        <append>false</append>" +
        "        <cleanup class=\"java.net.SocketCleanable\"/>" +
        "      </fd>" +
        "      <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "        <java.net.InetAddress>" +
        "          <default>" +
        "            <address>2130706433</address>" +
        "            <family>2</family>" +
        "          </default>" +
        "        </java.net.InetAddress>" +
        "      </address>" +
        "      <port>59856</port>" +
        "      <localport>30025</localport>" +
        "      <timeout>300000</timeout>" +
        "      <trafficClass>0</trafficClass>" +
        "      <shut__rd>false</shut__rd>" +
        "      <shut__wr>false</shut__wr>" +
        "      <fdUseCount>0</fdUseCount>" +
        "      <fdLock/>" +
        "      <closePending>false</closePending>" +
        "      <connectionReset>false</connectionReset>" +
        "      <stream>false</stream>" +
        "      <serverPort>1080</serverPort>" +
        "      <useV4>false</useV4>" +
        "      <applicationSetProxy>false</applicationSetProxy>" +
        "    </impl>" +
        "    <oldImpl>false</oldImpl>" +
        "  </socket>" +
        "</com.hs.mail.container.server.socket.TcpSocketChannel>";
        com.hs.mail.container.server.socket.TcpSocketChannel receivingObject = (com.hs.mail.container.server.socket.TcpSocketChannel) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<java.io.BufferedInputStream>" +
        "  <in class=\"java.net.SocketInputStream\">" +
        "    <fd>" +
        "      <fd>132</fd>" +
        "      <handle>-1</handle>" +
        "      <parent class=\"java.net.SocketInputStream\" reference=\"../..\"/>" +
        "      <closed>false</closed>" +
        "      <append>false</append>" +
        "      <cleanup class=\"java.net.SocketCleanable\"/>" +
        "    </fd>" +
        "    <closeLock/>" +
        "    <closed>false</closed>" +
        "    <eof>false</eof>" +
        "    <impl class=\"java.net.SocksSocketImpl\">" +
        "      <socket>" +
        "        <created>true</created>" +
        "        <bound>true</bound>" +
        "        <connected>true</connected>" +
        "        <closed>false</closed>" +
        "        <closeLock/>" +
        "        <shutIn>false</shutIn>" +
        "        <shutOut>false</shutOut>" +
        "        <impl class=\"java.net.SocksSocketImpl\" reference=\"../..\"/>" +
        "        <oldImpl>false</oldImpl>" +
        "      </socket>" +
        "      <fd reference=\"../../fd\"/>" +
        "      <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "        <java.net.InetAddress>" +
        "          <default>" +
        "            <address>2130706433</address>" +
        "            <family>2</family>" +
        "          </default>" +
        "        </java.net.InetAddress>" +
        "      </address>" +
        "      <port>59856</port>" +
        "      <localport>30025</localport>" +
        "      <timeout>300000</timeout>" +
        "      <trafficClass>0</trafficClass>" +
        "      <shut__rd>false</shut__rd>" +
        "      <shut__wr>false</shut__wr>" +
        "      <socketInputStream reference=\"../..\"/>" +
        "      <fdUseCount>0</fdUseCount>" +
        "      <fdLock/>" +
        "      <closePending>false</closePending>" +
        "      <connectionReset>false</connectionReset>" +
        "      <stream>false</stream>" +
        "      <serverPort>1080</serverPort>" +
        "      <useV4>false</useV4>" +
        "      <applicationSetProxy>false</applicationSetProxy>" +
        "    </impl>" +
        "    <socket reference=\"../impl/socket\"/>" +
        "    <closing>false</closing>" +
        "  </in>" +
        "  <buf>AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA==</buf>" +
        "  <count>0</count>" +
        "  <pos>0</pos>" +
        "  <markpos>-1</markpos>" +
        "  <marklimit>0</marklimit>" +
        "</java.io.BufferedInputStream>";
        java.io.InputStream expectedObject = (java.io.InputStream) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getInputStream());
    }

    @Test
    public void testGetInputStream2() throws IOException {
        String receivingXML = 
        "<com.hs.mail.container.server.socket.TcpSocketChannel>" +
        "  <socket>" +
        "    <created>true</created>" +
        "    <bound>true</bound>" +
        "    <connected>true</connected>" +
        "    <closed>false</closed>" +
        "    <closeLock/>" +
        "    <shutIn>false</shutIn>" +
        "    <shutOut>false</shutOut>" +
        "    <impl class=\"java.net.SocksSocketImpl\">" +
        "      <socket reference=\"../..\"/>" +
        "      <fd>" +
        "        <fd>131</fd>" +
        "        <handle>-1</handle>" +
        "        <closed>false</closed>" +
        "        <append>false</append>" +
        "        <cleanup class=\"java.net.SocketCleanable\"/>" +
        "      </fd>" +
        "      <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "        <java.net.InetAddress>" +
        "          <default>" +
        "            <address>2130706433</address>" +
        "            <family>2</family>" +
        "          </default>" +
        "        </java.net.InetAddress>" +
        "      </address>" +
        "      <port>59872</port>" +
        "      <localport>30025</localport>" +
        "      <timeout>300000</timeout>" +
        "      <trafficClass>0</trafficClass>" +
        "      <shut__rd>false</shut__rd>" +
        "      <shut__wr>false</shut__wr>" +
        "      <fdUseCount>0</fdUseCount>" +
        "      <fdLock/>" +
        "      <closePending>false</closePending>" +
        "      <connectionReset>false</connectionReset>" +
        "      <stream>false</stream>" +
        "      <serverPort>1080</serverPort>" +
        "      <useV4>false</useV4>" +
        "      <applicationSetProxy>false</applicationSetProxy>" +
        "    </impl>" +
        "    <oldImpl>false</oldImpl>" +
        "  </socket>" +
        "</com.hs.mail.container.server.socket.TcpSocketChannel>";
        com.hs.mail.container.server.socket.TcpSocketChannel receivingObject = (com.hs.mail.container.server.socket.TcpSocketChannel) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<java.io.BufferedInputStream>" +
        "  <in class=\"java.net.SocketInputStream\">" +
        "    <fd>" +
        "      <fd>131</fd>" +
        "      <handle>-1</handle>" +
        "      <parent class=\"java.net.SocketInputStream\" reference=\"../..\"/>" +
        "      <closed>false</closed>" +
        "      <append>false</append>" +
        "      <cleanup class=\"java.net.SocketCleanable\"/>" +
        "    </fd>" +
        "    <closeLock/>" +
        "    <closed>false</closed>" +
        "    <eof>false</eof>" +
        "    <impl class=\"java.net.SocksSocketImpl\">" +
        "      <socket>" +
        "        <created>true</created>" +
        "        <bound>true</bound>" +
        "        <connected>true</connected>" +
        "        <closed>false</closed>" +
        "        <closeLock/>" +
        "        <shutIn>false</shutIn>" +
        "        <shutOut>false</shutOut>" +
        "        <impl class=\"java.net.SocksSocketImpl\" reference=\"../..\"/>" +
        "        <oldImpl>false</oldImpl>" +
        "      </socket>" +
        "      <fd reference=\"../../fd\"/>" +
        "      <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "        <java.net.InetAddress>" +
        "          <default>" +
        "            <address>2130706433</address>" +
        "            <family>2</family>" +
        "          </default>" +
        "        </java.net.InetAddress>" +
        "      </address>" +
        "      <port>59872</port>" +
        "      <localport>30025</localport>" +
        "      <timeout>300000</timeout>" +
        "      <trafficClass>0</trafficClass>" +
        "      <shut__rd>false</shut__rd>" +
        "      <shut__wr>false</shut__wr>" +
        "      <socketInputStream reference=\"../..\"/>" +
        "      <fdUseCount>0</fdUseCount>" +
        "      <fdLock/>" +
        "      <closePending>false</closePending>" +
        "      <connectionReset>false</connectionReset>" +
        "      <stream>false</stream>" +
        "      <serverPort>1080</serverPort>" +
        "      <useV4>false</useV4>" +
        "      <applicationSetProxy>false</applicationSetProxy>" +
        "    </impl>" +
        "    <socket reference=\"../impl/socket\"/>" +
        "    <closing>false</closing>" +
        "  </in>" +
        "  <buf>AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA==</buf>" +
        "  <count>0</count>" +
        "  <pos>0</pos>" +
        "  <markpos>-1</markpos>" +
        "  <marklimit>0</marklimit>" +
        "</java.io.BufferedInputStream>";
        java.io.InputStream expectedObject = (java.io.InputStream) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getInputStream());
    }

    @Test
    public void testGetOutputStream1() throws IOException {
        String receivingXML = 
        "<com.hs.mail.container.server.socket.TcpSocketChannel>" +
        "  <socket>" +
        "    <created>true</created>" +
        "    <bound>true</bound>" +
        "    <connected>true</connected>" +
        "    <closed>false</closed>" +
        "    <closeLock/>" +
        "    <shutIn>false</shutIn>" +
        "    <shutOut>false</shutOut>" +
        "    <impl class=\"java.net.SocksSocketImpl\">" +
        "      <socket reference=\"../..\"/>" +
        "      <fd>" +
        "        <fd>132</fd>" +
        "        <handle>-1</handle>" +
        "        <parent class=\"java.net.SocketInputStream\">" +
        "          <fd reference=\"../..\"/>" +
        "          <closeLock/>" +
        "          <closed>false</closed>" +
        "          <eof>false</eof>" +
        "          <impl class=\"java.net.SocksSocketImpl\" reference=\"../../..\"/>" +
        "          <socket reference=\"../../../..\"/>" +
        "          <closing>false</closing>" +
        "        </parent>" +
        "        <closed>false</closed>" +
        "        <append>false</append>" +
        "        <cleanup class=\"java.net.SocketCleanable\"/>" +
        "      </fd>" +
        "      <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "        <java.net.InetAddress>" +
        "          <default>" +
        "            <address>2130706433</address>" +
        "            <family>2</family>" +
        "          </default>" +
        "        </java.net.InetAddress>" +
        "      </address>" +
        "      <port>59856</port>" +
        "      <localport>30025</localport>" +
        "      <timeout>300000</timeout>" +
        "      <trafficClass>0</trafficClass>" +
        "      <shut__rd>false</shut__rd>" +
        "      <shut__wr>false</shut__wr>" +
        "      <socketInputStream reference=\"../fd/parent\"/>" +
        "      <fdUseCount>0</fdUseCount>" +
        "      <fdLock/>" +
        "      <closePending>false</closePending>" +
        "      <connectionReset>false</connectionReset>" +
        "      <stream>false</stream>" +
        "      <serverPort>1080</serverPort>" +
        "      <useV4>false</useV4>" +
        "      <applicationSetProxy>false</applicationSetProxy>" +
        "    </impl>" +
        "    <oldImpl>false</oldImpl>" +
        "  </socket>" +
        "</com.hs.mail.container.server.socket.TcpSocketChannel>";
        com.hs.mail.container.server.socket.TcpSocketChannel receivingObject = (com.hs.mail.container.server.socket.TcpSocketChannel) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<java.io.BufferedOutputStream>" +
        "  <out class=\"java.net.SocketOutputStream\">" +
        "    <fd>" +
        "      <fd>132</fd>" +
        "      <handle>-1</handle>" +
        "      <parent class=\"java.net.SocketInputStream\">" +
        "        <fd reference=\"../..\"/>" +
        "        <closeLock/>" +
        "        <closed>false</closed>" +
        "        <eof>false</eof>" +
        "        <impl class=\"java.net.SocksSocketImpl\">" +
        "          <socket>" +
        "            <created>true</created>" +
        "            <bound>true</bound>" +
        "            <connected>true</connected>" +
        "            <closed>false</closed>" +
        "            <closeLock/>" +
        "            <shutIn>false</shutIn>" +
        "            <shutOut>false</shutOut>" +
        "            <impl class=\"java.net.SocksSocketImpl\" reference=\"../..\"/>" +
        "            <oldImpl>false</oldImpl>" +
        "          </socket>" +
        "          <fd reference=\"../../..\"/>" +
        "          <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "            <java.net.InetAddress>" +
        "              <default>" +
        "                <address>2130706433</address>" +
        "                <family>2</family>" +
        "              </default>" +
        "            </java.net.InetAddress>" +
        "          </address>" +
        "          <port>59856</port>" +
        "          <localport>30025</localport>" +
        "          <timeout>300000</timeout>" +
        "          <trafficClass>0</trafficClass>" +
        "          <shut__rd>false</shut__rd>" +
        "          <shut__wr>false</shut__wr>" +
        "          <socketInputStream reference=\"../..\"/>" +
        "          <socketOutputStream reference=\"../../../..\"/>" +
        "          <fdUseCount>0</fdUseCount>" +
        "          <fdLock/>" +
        "          <closePending>false</closePending>" +
        "          <connectionReset>false</connectionReset>" +
        "          <stream>false</stream>" +
        "          <serverPort>1080</serverPort>" +
        "          <useV4>false</useV4>" +
        "          <applicationSetProxy>false</applicationSetProxy>" +
        "        </impl>" +
        "        <socket reference=\"../impl/socket\"/>" +
        "        <closing>false</closing>" +
        "      </parent>" +
        "      <otherParents>" +
        "        <java.net.SocketInputStream reference=\"../../parent\"/>" +
        "        <java.net.SocketOutputStream reference=\"../../..\"/>" +
        "      </otherParents>" +
        "      <closed>false</closed>" +
        "      <append>false</append>" +
        "      <cleanup class=\"java.net.SocketCleanable\"/>" +
        "    </fd>" +
        "    <closeLock/>" +
        "    <closed>false</closed>" +
        "    <impl class=\"java.net.SocksSocketImpl\" reference=\"../fd/parent/impl\"/>" +
        "    <temp>AA==</temp>" +
        "    <socket reference=\"../fd/parent/impl/socket\"/>" +
        "    <closing>false</closing>" +
        "  </out>" +
        "  <closed>false</closed>" +
        "  <closeLock/>" +
        "  <buf>AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA==</buf>" +
        "  <count>0</count>" +
        "</java.io.BufferedOutputStream>";
        java.io.OutputStream expectedObject = (java.io.OutputStream) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getOutputStream());
    }

    @Test
    public void testGetOutputStream2() throws IOException {
        String receivingXML = 
        "<com.hs.mail.container.server.socket.TcpSocketChannel>" +
        "  <socket>" +
        "    <created>true</created>" +
        "    <bound>true</bound>" +
        "    <connected>true</connected>" +
        "    <closed>false</closed>" +
        "    <closeLock/>" +
        "    <shutIn>false</shutIn>" +
        "    <shutOut>false</shutOut>" +
        "    <impl class=\"java.net.SocksSocketImpl\">" +
        "      <socket reference=\"../..\"/>" +
        "      <fd>" +
        "        <fd>131</fd>" +
        "        <handle>-1</handle>" +
        "        <parent class=\"java.net.SocketInputStream\">" +
        "          <fd reference=\"../..\"/>" +
        "          <closeLock/>" +
        "          <closed>false</closed>" +
        "          <eof>false</eof>" +
        "          <impl class=\"java.net.SocksSocketImpl\" reference=\"../../..\"/>" +
        "          <socket reference=\"../../../..\"/>" +
        "          <closing>false</closing>" +
        "        </parent>" +
        "        <closed>false</closed>" +
        "        <append>false</append>" +
        "        <cleanup class=\"java.net.SocketCleanable\"/>" +
        "      </fd>" +
        "      <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "        <java.net.InetAddress>" +
        "          <default>" +
        "            <address>2130706433</address>" +
        "            <family>2</family>" +
        "          </default>" +
        "        </java.net.InetAddress>" +
        "      </address>" +
        "      <port>59872</port>" +
        "      <localport>30025</localport>" +
        "      <timeout>300000</timeout>" +
        "      <trafficClass>0</trafficClass>" +
        "      <shut__rd>false</shut__rd>" +
        "      <shut__wr>false</shut__wr>" +
        "      <socketInputStream reference=\"../fd/parent\"/>" +
        "      <fdUseCount>0</fdUseCount>" +
        "      <fdLock/>" +
        "      <closePending>false</closePending>" +
        "      <connectionReset>false</connectionReset>" +
        "      <stream>false</stream>" +
        "      <serverPort>1080</serverPort>" +
        "      <useV4>false</useV4>" +
        "      <applicationSetProxy>false</applicationSetProxy>" +
        "    </impl>" +
        "    <oldImpl>false</oldImpl>" +
        "  </socket>" +
        "</com.hs.mail.container.server.socket.TcpSocketChannel>";
        com.hs.mail.container.server.socket.TcpSocketChannel receivingObject = (com.hs.mail.container.server.socket.TcpSocketChannel) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<java.io.BufferedOutputStream>" +
        "  <out class=\"java.net.SocketOutputStream\">" +
        "    <fd>" +
        "      <fd>131</fd>" +
        "      <handle>-1</handle>" +
        "      <parent class=\"java.net.SocketInputStream\">" +
        "        <fd reference=\"../..\"/>" +
        "        <closeLock/>" +
        "        <closed>false</closed>" +
        "        <eof>false</eof>" +
        "        <impl class=\"java.net.SocksSocketImpl\">" +
        "          <socket>" +
        "            <created>true</created>" +
        "            <bound>true</bound>" +
        "            <connected>true</connected>" +
        "            <closed>false</closed>" +
        "            <closeLock/>" +
        "            <shutIn>false</shutIn>" +
        "            <shutOut>false</shutOut>" +
        "            <impl class=\"java.net.SocksSocketImpl\" reference=\"../..\"/>" +
        "            <oldImpl>false</oldImpl>" +
        "          </socket>" +
        "          <fd reference=\"../../..\"/>" +
        "          <address class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">" +
        "            <java.net.InetAddress>" +
        "              <default>" +
        "                <address>2130706433</address>" +
        "                <family>2</family>" +
        "              </default>" +
        "            </java.net.InetAddress>" +
        "          </address>" +
        "          <port>59872</port>" +
        "          <localport>30025</localport>" +
        "          <timeout>300000</timeout>" +
        "          <trafficClass>0</trafficClass>" +
        "          <shut__rd>false</shut__rd>" +
        "          <shut__wr>false</shut__wr>" +
        "          <socketInputStream reference=\"../..\"/>" +
        "          <socketOutputStream reference=\"../../../..\"/>" +
        "          <fdUseCount>0</fdUseCount>" +
        "          <fdLock/>" +
        "          <closePending>false</closePending>" +
        "          <connectionReset>false</connectionReset>" +
        "          <stream>false</stream>" +
        "          <serverPort>1080</serverPort>" +
        "          <useV4>false</useV4>" +
        "          <applicationSetProxy>false</applicationSetProxy>" +
        "        </impl>" +
        "        <socket reference=\"../impl/socket\"/>" +
        "        <closing>false</closing>" +
        "      </parent>" +
        "      <otherParents>" +
        "        <java.net.SocketInputStream reference=\"../../parent\"/>" +
        "        <java.net.SocketOutputStream reference=\"../../..\"/>" +
        "      </otherParents>" +
        "      <closed>false</closed>" +
        "      <append>false</append>" +
        "      <cleanup class=\"java.net.SocketCleanable\"/>" +
        "    </fd>" +
        "    <closeLock/>" +
        "    <closed>false</closed>" +
        "    <impl class=\"java.net.SocksSocketImpl\" reference=\"../fd/parent/impl\"/>" +
        "    <temp>AA==</temp>" +
        "    <socket reference=\"../fd/parent/impl/socket\"/>" +
        "    <closing>false</closing>" +
        "  </out>" +
        "  <closed>false</closed>" +
        "  <closeLock/>" +
        "  <buf>AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA==</buf>" +
        "  <count>0</count>" +
        "</java.io.BufferedOutputStream>";
        java.io.OutputStream expectedObject = (java.io.OutputStream) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getOutputStream());
    }
}