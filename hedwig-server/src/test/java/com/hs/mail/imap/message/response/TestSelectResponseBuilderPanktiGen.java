package com.hs.mail.imap.message.response;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestSelectResponseBuilderPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testBuild1() {
        String receivingXML = 
        "<com.hs.mail.imap.message.response.SelectResponseBuilder/>";
        com.hs.mail.imap.message.response.SelectResponseBuilder receivingObject = (com.hs.mail.imap.message.response.SelectResponseBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.message.response.SelectResponse>" +
        "  <mailbox>" +
        "    <mailboxID>4</mailboxID>" +
        "    <name>INBOX</name>" +
        "    <ownerID>4</ownerID>" +
        "    <nextUID>883</nextUID>" +
        "    <uidValidity>1600194306829</uidValidity>" +
        "    <noInferiors>false</noInferiors>" +
        "    <noSelect>false</noSelect>" +
        "    <readOnly>false</readOnly>" +
        "    <marked>false</marked>" +
        "    <hasChildren>false</hasChildren>" +
        "  </mailbox>" +
        "  <firstUnseen>2</firstUnseen>" +
        "  <messageCount>39</messageCount>" +
        "  <recentMessageCount>1</recentMessageCount>" +
        "</com.hs.mail.imap.message.response.SelectResponse>";
        com.hs.mail.imap.message.response.SelectResponse expectedObject = (com.hs.mail.imap.message.response.SelectResponse) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <com.hs.mail.imap.mailbox.UidToMsnMapper>" +
        "    <selected>" +
        "      <sessionID>4405955356756322956</sessionID>" +
        "      <mailboxID>4</mailboxID>" +
        "      <readOnly>false</readOnly>" +
        "      <recent>false</recent>" +
        "      <converter serialization=\"custom\">" +
        "        <unserializable-parents/>" +
        "        <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "          <default/>" +
        "          <map/>" +
        "        </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      </converter>" +
        "    </selected>" +
        "    <useUID>false</useUID>" +
        "  </com.hs.mail.imap.mailbox.UidToMsnMapper>" +
        "  <com.hs.mail.imap.mailbox.Mailbox>" +
        "    <mailboxID>4</mailboxID>" +
        "    <name>INBOX</name>" +
        "    <ownerID>4</ownerID>" +
        "    <nextUID>883</nextUID>" +
        "    <uidValidity>1600194306829</uidValidity>" +
        "    <noInferiors>false</noInferiors>" +
        "    <noSelect>false</noSelect>" +
        "    <readOnly>false</readOnly>" +
        "    <marked>false</marked>" +
        "    <hasChildren>false</hasChildren>" +
        "  </com.hs.mail.imap.mailbox.Mailbox>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.hs.mail.imap.mailbox.UidToMsnMapper paramObject1 = (com.hs.mail.imap.mailbox.UidToMsnMapper) paramObjects[0];
        com.hs.mail.imap.mailbox.Mailbox paramObject2 = (com.hs.mail.imap.mailbox.Mailbox) paramObjects[1];
        Assert.assertEquals(expectedObject, receivingObject.build(paramObject1, paramObject2));
    }

    @Test
    public void testBuild2() {
        String receivingXML = 
        "<com.hs.mail.imap.message.response.SelectResponseBuilder/>";
        com.hs.mail.imap.message.response.SelectResponseBuilder receivingObject = (com.hs.mail.imap.message.response.SelectResponseBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.message.response.SelectResponse>" +
        "  <mailbox>" +
        "    <mailboxID>4</mailboxID>" +
        "    <name>INBOX</name>" +
        "    <ownerID>4</ownerID>" +
        "    <nextUID>884</nextUID>" +
        "    <uidValidity>1600194306829</uidValidity>" +
        "    <noInferiors>false</noInferiors>" +
        "    <noSelect>false</noSelect>" +
        "    <readOnly>false</readOnly>" +
        "    <marked>false</marked>" +
        "    <hasChildren>false</hasChildren>" +
        "  </mailbox>" +
        "  <firstUnseen>2</firstUnseen>" +
        "  <messageCount>40</messageCount>" +
        "  <recentMessageCount>1</recentMessageCount>" +
        "</com.hs.mail.imap.message.response.SelectResponse>";
        com.hs.mail.imap.message.response.SelectResponse expectedObject = (com.hs.mail.imap.message.response.SelectResponse) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <com.hs.mail.imap.mailbox.UidToMsnMapper>" +
        "    <selected>" +
        "      <sessionID>-2772295120921817616</sessionID>" +
        "      <mailboxID>4</mailboxID>" +
        "      <readOnly>false</readOnly>" +
        "      <recent>false</recent>" +
        "      <converter serialization=\"custom\">" +
        "        <unserializable-parents/>" +
        "        <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "          <default/>" +
        "          <map/>" +
        "        </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      </converter>" +
        "    </selected>" +
        "    <useUID>false</useUID>" +
        "  </com.hs.mail.imap.mailbox.UidToMsnMapper>" +
        "  <com.hs.mail.imap.mailbox.Mailbox>" +
        "    <mailboxID>4</mailboxID>" +
        "    <name>INBOX</name>" +
        "    <ownerID>4</ownerID>" +
        "    <nextUID>884</nextUID>" +
        "    <uidValidity>1600194306829</uidValidity>" +
        "    <noInferiors>false</noInferiors>" +
        "    <noSelect>false</noSelect>" +
        "    <readOnly>false</readOnly>" +
        "    <marked>false</marked>" +
        "    <hasChildren>false</hasChildren>" +
        "  </com.hs.mail.imap.mailbox.Mailbox>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.hs.mail.imap.mailbox.UidToMsnMapper paramObject1 = (com.hs.mail.imap.mailbox.UidToMsnMapper) paramObjects[0];
        com.hs.mail.imap.mailbox.Mailbox paramObject2 = (com.hs.mail.imap.mailbox.Mailbox) paramObjects[1];
        Assert.assertEquals(expectedObject, receivingObject.build(paramObject1, paramObject2));
    }
}