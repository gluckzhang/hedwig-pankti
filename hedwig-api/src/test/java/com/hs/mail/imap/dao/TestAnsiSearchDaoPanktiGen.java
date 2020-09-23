package com.hs.mail.imap.dao;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestAnsiSearchDaoPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testQuery1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiSearchDao.query1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlSearchDao receivingObject = (com.hs.mail.imap.dao.MySqlSearchDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<list>" +
            "  <long>844</long>" +
            "  <long>845</long>" +
            "  <long>846</long>" +
            "  <long>847</long>" +
            "  <long>848</long>" +
            "  <long>849</long>" +
            "  <long>850</long>" +
            "  <long>851</long>" +
            "  <long>852</long>" +
            "  <long>853</long>" +
            "  <long>854</long>" +
            "  <long>855</long>" +
            "  <long>856</long>" +
            "  <long>857</long>" +
            "  <long>858</long>" +
            "  <long>859</long>" +
            "  <long>860</long>" +
            "  <long>861</long>" +
            "  <long>862</long>" +
            "  <long>863</long>" +
            "  <long>864</long>" +
            "  <long>865</long>" +
            "  <long>866</long>" +
            "  <long>867</long>" +
            "  <long>868</long>" +
            "  <long>869</long>" +
            "  <long>870</long>" +
            "  <long>871</long>" +
            "  <long>872</long>" +
            "  <long>873</long>" +
            "  <long>874</long>" +
            "  <long>875</long>" +
            "  <long>876</long>" +
            "  <long>877</long>" +
            "  <long>878</long>" +
            "  <long>879</long>" +
            "  <long>880</long>" +
            "  <long>881</long>" +
            "</list>";
            java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <com.hs.mail.imap.mailbox.UidToMsnMapper>" +
            "    <selected>" +
            "      <sessionID>8262323712137915342</sessionID>" +
            "      <mailboxID>4</mailboxID>" +
            "      <readOnly>false</readOnly>" +
            "      <recent>true</recent>" +
            "      <converter serialization=\"custom\">" +
            "        <unserializable-parents/>" +
            "        <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
            "          <default/>" +
            "          <map>" +
            "            <entry>" +
            "              <int>2</int>" +
            "              <long>845</long>" +
            "            </entry>" +
            "          </map>" +
            "        </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
            "      </converter>" +
            "    </selected>" +
            "    <useUID>false</useUID>" +
            "  </com.hs.mail.imap.mailbox.UidToMsnMapper>" +
            "  <long>4</long>" +
            "  <com.hs.mail.imap.message.search.AllKey/>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.hs.mail.imap.mailbox.UidToMsnMapper paramObject1 = (com.hs.mail.imap.mailbox.UidToMsnMapper) paramObjects[0];
            long paramObject2 = (Long) paramObjects[1];
            com.hs.mail.imap.message.search.SearchKey paramObject3 = (com.hs.mail.imap.message.search.SearchKey) paramObjects[2];
            Assert.assertEquals(expectedObject, receivingObject.query(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testQuery2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiSearchDao.query2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlSearchDao receivingObject = (com.hs.mail.imap.dao.MySqlSearchDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<list>" +
            "  <long>844</long>" +
            "  <long>845</long>" +
            "  <long>846</long>" +
            "  <long>847</long>" +
            "  <long>848</long>" +
            "  <long>849</long>" +
            "  <long>850</long>" +
            "  <long>851</long>" +
            "  <long>852</long>" +
            "  <long>853</long>" +
            "  <long>854</long>" +
            "  <long>855</long>" +
            "  <long>856</long>" +
            "  <long>857</long>" +
            "  <long>858</long>" +
            "  <long>859</long>" +
            "  <long>860</long>" +
            "  <long>861</long>" +
            "  <long>862</long>" +
            "  <long>863</long>" +
            "  <long>864</long>" +
            "  <long>865</long>" +
            "  <long>866</long>" +
            "  <long>867</long>" +
            "  <long>868</long>" +
            "  <long>869</long>" +
            "  <long>870</long>" +
            "  <long>871</long>" +
            "  <long>872</long>" +
            "  <long>873</long>" +
            "  <long>874</long>" +
            "  <long>875</long>" +
            "  <long>876</long>" +
            "  <long>877</long>" +
            "  <long>878</long>" +
            "  <long>879</long>" +
            "  <long>880</long>" +
            "</list>";
            java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <com.hs.mail.imap.mailbox.UidToMsnMapper>" +
            "    <selected>" +
            "      <sessionID>-7091255062154486704</sessionID>" +
            "      <mailboxID>4</mailboxID>" +
            "      <readOnly>false</readOnly>" +
            "      <recent>true</recent>" +
            "      <converter serialization=\"custom\">" +
            "        <unserializable-parents/>" +
            "        <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
            "          <default/>" +
            "          <map>" +
            "            <entry>" +
            "              <int>2</int>" +
            "              <long>845</long>" +
            "            </entry>" +
            "          </map>" +
            "        </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
            "      </converter>" +
            "    </selected>" +
            "    <useUID>false</useUID>" +
            "  </com.hs.mail.imap.mailbox.UidToMsnMapper>" +
            "  <long>4</long>" +
            "  <com.hs.mail.imap.message.search.AllKey/>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.hs.mail.imap.mailbox.UidToMsnMapper paramObject1 = (com.hs.mail.imap.mailbox.UidToMsnMapper) paramObjects[0];
            long paramObject2 = (Long) paramObjects[1];
            com.hs.mail.imap.message.search.SearchKey paramObject3 = (com.hs.mail.imap.message.search.SearchKey) paramObjects[2];
            Assert.assertEquals(expectedObject, receivingObject.query(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}