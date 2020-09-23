package com.hs.mail.imap.message.builder;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestCloseRequestBuilderPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testCreateRequest1() {
        String receivingXML = 
        "<com.hs.mail.imap.message.builder.CloseRequestBuilder/>";
        com.hs.mail.imap.message.builder.CloseRequestBuilder receivingObject = (com.hs.mail.imap.message.builder.CloseRequestBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.message.request.CloseRequest>" +
        "  <tag>BHEM5</tag>" +
        "  <command>CLOSE</command>" +
        "</com.hs.mail.imap.message.request.CloseRequest>";
        com.hs.mail.imap.message.request.ImapRequest expectedObject = (com.hs.mail.imap.message.request.ImapRequest) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <string>BHEM5</string>" +
        "  <string>CLOSE</string>" +
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
        "    <tokens/>" +
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
        "<com.hs.mail.imap.message.builder.CloseRequestBuilder/>";
        com.hs.mail.imap.message.builder.CloseRequestBuilder receivingObject = (com.hs.mail.imap.message.builder.CloseRequestBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.message.request.CloseRequest>" +
        "  <tag>CCNC5</tag>" +
        "  <command>CLOSE</command>" +
        "</com.hs.mail.imap.message.request.CloseRequest>";
        com.hs.mail.imap.message.request.ImapRequest expectedObject = (com.hs.mail.imap.message.request.ImapRequest) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <string>CCNC5</string>" +
        "  <string>CLOSE</string>" +
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
        "    <tokens/>" +
        "  </com.hs.mail.imap.server.codec.DefaultImapMessage>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
        java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
        com.hs.mail.imap.server.codec.ImapMessage paramObject3 = (com.hs.mail.imap.server.codec.ImapMessage) paramObjects[2];
        Assert.assertEquals(expectedObject, receivingObject.createRequest(paramObject1, paramObject2, paramObject3));
    }
}