package com.hs.mail.imap.message.builder;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestFetchRequestBuilderPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testCreateRequest1() {
        String receivingXML = 
        "<com.hs.mail.imap.message.builder.FetchRequestBuilder/>";
        com.hs.mail.imap.message.builder.FetchRequestBuilder receivingObject = (com.hs.mail.imap.message.builder.FetchRequestBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.message.request.FetchRequest>" +
        "  <tag>BHEM4</tag>" +
        "  <command>FETCH</command>" +
        "  <sequenceSet>" +
        "    <com.hs.mail.imap.message.SequenceRange>" +
        "      <min>39</min>" +
        "      <max>39</max>" +
        "    </com.hs.mail.imap.message.SequenceRange>" +
        "  </sequenceSet>" +
        "  <fetchProfile>" +
        "    <specials>" +
        "      <com.hs.mail.imap.message.BodyFetchItem>" +
        "        <name defined-in=\"javax.mail.FetchProfile$Item\">RFC822</name>" +
        "        <name>RFC822</name>" +
        "        <peek>false</peek>" +
        "        <sectionType>5</sectionType>" +
        "        <firstOctet>-1</firstOctet>" +
        "        <numberOfOctets>-1</numberOfOctets>" +
        "      </com.hs.mail.imap.message.BodyFetchItem>" +
        "    </specials>" +
        "  </fetchProfile>" +
        "  <useUID>false</useUID>" +
        "</com.hs.mail.imap.message.request.FetchRequest>";
        com.hs.mail.imap.message.request.ImapRequest expectedObject = (com.hs.mail.imap.message.request.ImapRequest) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <string>BHEM4</string>" +
        "  <string>FETCH</string>" +
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
        "        <type>SEQ_NUMBER</type>" +
        "        <value>39</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>LPAREN</type>" +
        "        <value>(</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>KEYWORD</type>" +
        "        <value>RFC822</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>RPAREN</type>" +
        "        <value>)</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "    </tokens>" +
        "  </com.hs.mail.imap.server.codec.DefaultImapMessage>" +
        "  <boolean>false</boolean>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
        java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
        com.hs.mail.imap.server.codec.ImapMessage paramObject3 = (com.hs.mail.imap.server.codec.ImapMessage) paramObjects[2];
        boolean paramObject4 = (Boolean) paramObjects[3];
        Assert.assertEquals(expectedObject, receivingObject.createRequest(paramObject1, paramObject2, paramObject3, paramObject4));
    }

    @Test
    public void testCreateRequest2() {
        String receivingXML = 
        "<com.hs.mail.imap.message.builder.FetchRequestBuilder/>";
        com.hs.mail.imap.message.builder.FetchRequestBuilder receivingObject = (com.hs.mail.imap.message.builder.FetchRequestBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.message.request.FetchRequest>" +
        "  <tag>CCNC4</tag>" +
        "  <command>FETCH</command>" +
        "  <sequenceSet>" +
        "    <com.hs.mail.imap.message.SequenceRange>" +
        "      <min>40</min>" +
        "      <max>40</max>" +
        "    </com.hs.mail.imap.message.SequenceRange>" +
        "  </sequenceSet>" +
        "  <fetchProfile>" +
        "    <specials>" +
        "      <com.hs.mail.imap.message.BodyFetchItem>" +
        "        <name defined-in=\"javax.mail.FetchProfile$Item\">RFC822</name>" +
        "        <name>RFC822</name>" +
        "        <peek>false</peek>" +
        "        <sectionType>5</sectionType>" +
        "        <firstOctet>-1</firstOctet>" +
        "        <numberOfOctets>-1</numberOfOctets>" +
        "      </com.hs.mail.imap.message.BodyFetchItem>" +
        "    </specials>" +
        "  </fetchProfile>" +
        "  <useUID>false</useUID>" +
        "</com.hs.mail.imap.message.request.FetchRequest>";
        com.hs.mail.imap.message.request.ImapRequest expectedObject = (com.hs.mail.imap.message.request.ImapRequest) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <string>CCNC4</string>" +
        "  <string>FETCH</string>" +
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
        "        <type>SEQ_NUMBER</type>" +
        "        <value>40</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>LPAREN</type>" +
        "        <value>(</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>KEYWORD</type>" +
        "        <value>RFC822</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "      <com.hs.mail.imap.parser.Token>" +
        "        <type>RPAREN</type>" +
        "        <value>)</value>" +
        "      </com.hs.mail.imap.parser.Token>" +
        "    </tokens>" +
        "  </com.hs.mail.imap.server.codec.DefaultImapMessage>" +
        "  <boolean>false</boolean>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
        java.lang.String paramObject2 = (java.lang.String) paramObjects[1];
        com.hs.mail.imap.server.codec.ImapMessage paramObject3 = (com.hs.mail.imap.server.codec.ImapMessage) paramObjects[2];
        boolean paramObject4 = (Boolean) paramObjects[3];
        Assert.assertEquals(expectedObject, receivingObject.createRequest(paramObject1, paramObject2, paramObject3, paramObject4));
    }
}