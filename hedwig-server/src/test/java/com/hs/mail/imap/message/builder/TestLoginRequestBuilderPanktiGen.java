package com.hs.mail.imap.message.builder;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestLoginRequestBuilderPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testCreateRequest1() {
        String receivingXML = 
        "<com.hs.mail.imap.message.builder.LoginRequestBuilder/>";
        com.hs.mail.imap.message.builder.LoginRequestBuilder receivingObject = (com.hs.mail.imap.message.builder.LoginRequestBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.message.request.LoginRequest>" +
        "  <tag>BHEM1</tag>" +
        "  <command>LOGIN</command>" +
        "  <username>test-receiver@localhost</username>" +
        "  <password>654321</password>" +
        "</com.hs.mail.imap.message.request.LoginRequest>";
        com.hs.mail.imap.message.request.ImapRequest expectedObject = (com.hs.mail.imap.message.request.ImapRequest) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <string>BHEM1</string>" +
        "  <string>LOGIN</string>" +
        "  <com.hs.mail.imap.server.codec.DefaultImapMessage>" +
        "    <literal class=\"org.jboss.netty.buffer.EmptyChannelBuffer\">" +
        "      <readerIndex>0</readerIndex>" +
        "      <writerIndex>0</writerIndex>" +
        "      <markedReaderIndex>0</markedReaderIndex>" +
        "      <markedWriterIndex>0</markedWriterIndex>" +
        "      <array/>" +
        "    </literal>" +
        "    <literalLength>-1</literalLength>" +
        "    <needContinuationRequest>false</needContinuationRequest>" +
        "    <tokens>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>QUOTED</type>" +
        "        <value>test-receiver@localhost</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>QUOTED</type>" +
        "        <value>654321</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "    </tokens>" +
        "  </com.hs.mail.imap.server.codec.DefaultImapMessage>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
        java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
        com.hs.mail.imap.server.codec.ImapMessage paramObject3 = (com.hs.mail.imap.server.codec.ImapMessage) paramObjects[2];
        Assert.assertEquals(expectedObject, receivingObject.createRequest(paramObject1, paramObject2, paramObject3));
    }

    @Test
    public void testCreateRequest2() {
        String receivingXML = 
        "<com.hs.mail.imap.message.builder.LoginRequestBuilder/>";
        com.hs.mail.imap.message.builder.LoginRequestBuilder receivingObject = (com.hs.mail.imap.message.builder.LoginRequestBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.message.request.LoginRequest>" +
        "  <tag>CCNC1</tag>" +
        "  <command>LOGIN</command>" +
        "  <username>test-receiver@localhost</username>" +
        "  <password>654321</password>" +
        "</com.hs.mail.imap.message.request.LoginRequest>";
        com.hs.mail.imap.message.request.ImapRequest expectedObject = (com.hs.mail.imap.message.request.ImapRequest) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <string>CCNC1</string>" +
        "  <string>LOGIN</string>" +
        "  <com.hs.mail.imap.server.codec.DefaultImapMessage>" +
        "    <literal class=\"org.jboss.netty.buffer.EmptyChannelBuffer\">" +
        "      <readerIndex>0</readerIndex>" +
        "      <writerIndex>0</writerIndex>" +
        "      <markedReaderIndex>0</markedReaderIndex>" +
        "      <markedWriterIndex>0</markedWriterIndex>" +
        "      <array/>" +
        "    </literal>" +
        "    <literalLength>-1</literalLength>" +
        "    <needContinuationRequest>false</needContinuationRequest>" +
        "    <tokens>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>QUOTED</type>" +
        "        <value>test-receiver@localhost</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>QUOTED</type>" +
        "        <value>654321</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "    </tokens>" +
        "  </com.hs.mail.imap.server.codec.DefaultImapMessage>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
        java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
        com.hs.mail.imap.server.codec.ImapMessage paramObject3 = (com.hs.mail.imap.server.codec.ImapMessage) paramObjects[2];
        Assert.assertEquals(expectedObject, receivingObject.createRequest(paramObject1, paramObject2, paramObject3));
    }
}