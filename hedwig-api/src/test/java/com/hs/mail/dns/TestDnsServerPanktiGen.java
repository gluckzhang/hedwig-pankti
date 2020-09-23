package com.hs.mail.dns;
import com.thoughtworks.xstream.XStream;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
public class TestDnsServerPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetDnsServers1() {
        String receivingXML = 
        "<com.hs.mail.dns.DnsServer>" +
        "  <maxCacheSize>50000</maxCacheSize>" +
        "  <dnsCredibility>3</dnsCredibility>" +
        "  <dnsServers>" +
        "    <string>127.0.0.53</string>" +
        "  </dnsServers>" +
        "  <mxComparator class=\"com.hs.mail.dns.DnsServer$MXRecordComparator\"/>" +
        "</com.hs.mail.dns.DnsServer>";
        com.hs.mail.dns.DnsServer receivingObject = (com.hs.mail.dns.DnsServer) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string-array>" +
        "  <string>127.0.0.53</string>" +
        "</string-array>";
        java.lang.String[] expectedObject = (java.lang.String[]) xStream.fromXML(returnedXML);
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDnsServers()));
    }
}