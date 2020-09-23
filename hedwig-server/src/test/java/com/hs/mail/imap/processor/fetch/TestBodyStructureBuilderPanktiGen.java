package com.hs.mail.imap.processor.fetch;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.james.mime4j.MimeException;
import org.junit.Assert;
import org.junit.Test;
public class TestBodyStructureBuilderPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testBuild1() throws IOException, MimeException {
        String receivingXML = 
        "<com.hs.mail.imap.processor.fetch.BodyStructureBuilder>" +
        "  <envelopeBuilder/>" +
        "</com.hs.mail.imap.processor.fetch.BodyStructureBuilder>";
        com.hs.mail.imap.processor.fetch.BodyStructureBuilder receivingObject = (com.hs.mail.imap.processor.fetch.BodyStructureBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.processor.fetch.MimeDescriptor>" +
        "  <bodyOctets>2898</bodyOctets>" +
        "  <lines>68</lines>" +
        "  <type>text</type>" +
        "  <subType>plain</subType>" +
        "  <encoding>quoted-printable</encoding>" +
        "  <parameters>" +
        "    <string>charset</string>" +
        "    <string>us-ascii</string>" +
        "  </parameters>" +
        "  <languages class=\"empty-list\"/>" +
        "  <parts/>" +
        "</com.hs.mail.imap.processor.fetch.MimeDescriptor>";
        com.hs.mail.imap.processor.fetch.MimeDescriptor expectedObject = (com.hs.mail.imap.processor.fetch.MimeDescriptor) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <date>2020-09-23 10:09:56.57 UTC</date>" +
        "  <long>825</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.util.Date paramObject1 = (java.util.Date) paramObjects[0];
        long paramObject2 = (Long) paramObjects[1];
        Assert.assertEquals(expectedObject, receivingObject.build(paramObject1, paramObject2));
    }

    @Test
    public void testBuild2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.hs.mail.imap.processor.fetch.BodyStructureBuilder>" +
            "  <envelopeBuilder/>" +
            "</com.hs.mail.imap.processor.fetch.BodyStructureBuilder>";
            com.hs.mail.imap.processor.fetch.BodyStructureBuilder receivingObject = (com.hs.mail.imap.processor.fetch.BodyStructureBuilder) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.processor.fetch.MimeDescriptor>" +
            "  <bodyOctets>9531</bodyOctets>" +
            "  <lines>160</lines>" +
            "  <type>text</type>" +
            "  <subType>plain</subType>" +
            "  <encoding>quoted-printable</encoding>" +
            "  <parameters>" +
            "    <string>charset</string>" +
            "    <string>us-ascii</string>" +
            "  </parameters>" +
            "  <languages class=\"empty-list\"/>" +
            "  <parts/>" +
            "</com.hs.mail.imap.processor.fetch.MimeDescriptor>";
            com.hs.mail.imap.processor.fetch.MimeDescriptor expectedObject = (com.hs.mail.imap.processor.fetch.MimeDescriptor) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.hs.mail.imap.processor.fetch.BodyStructureBuilder.build2-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.util.Date paramObject1 = (java.util.Date) paramObjects[0];
            long paramObject2 = (Long) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.build(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testBuild3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.hs.mail.imap.processor.fetch.BodyStructureBuilder>" +
            "  <envelopeBuilder/>" +
            "</com.hs.mail.imap.processor.fetch.BodyStructureBuilder>";
            com.hs.mail.imap.processor.fetch.BodyStructureBuilder receivingObject = (com.hs.mail.imap.processor.fetch.BodyStructureBuilder) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.processor.fetch.MimeDescriptor>" +
            "  <bodyOctets>2898</bodyOctets>" +
            "  <lines>68</lines>" +
            "  <type>text</type>" +
            "  <subType>plain</subType>" +
            "  <encoding>quoted-printable</encoding>" +
            "  <parameters>" +
            "    <string>charset</string>" +
            "    <string>us-ascii</string>" +
            "  </parameters>" +
            "  <languages class=\"empty-list\"/>" +
            "  <parts/>" +
            "</com.hs.mail.imap.processor.fetch.MimeDescriptor>";
            com.hs.mail.imap.processor.fetch.MimeDescriptor expectedObject = (com.hs.mail.imap.processor.fetch.MimeDescriptor) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.hs.mail.imap.processor.fetch.BodyStructureBuilder.build3-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.util.Date paramObject1 = (java.util.Date) paramObjects[0];
            long paramObject2 = (Long) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.build(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testBuild4() throws IOException, MimeException {
        String receivingXML = 
        "<com.hs.mail.imap.processor.fetch.BodyStructureBuilder>" +
        "  <envelopeBuilder/>" +
        "</com.hs.mail.imap.processor.fetch.BodyStructureBuilder>";
        com.hs.mail.imap.processor.fetch.BodyStructureBuilder receivingObject = (com.hs.mail.imap.processor.fetch.BodyStructureBuilder) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<com.hs.mail.imap.processor.fetch.MimeDescriptor>" +
        "  <bodyOctets>9531</bodyOctets>" +
        "  <lines>160</lines>" +
        "  <type>text</type>" +
        "  <subType>plain</subType>" +
        "  <encoding>quoted-printable</encoding>" +
        "  <parameters>" +
        "    <string>charset</string>" +
        "    <string>us-ascii</string>" +
        "  </parameters>" +
        "  <languages class=\"empty-list\"/>" +
        "  <parts/>" +
        "</com.hs.mail.imap.processor.fetch.MimeDescriptor>";
        com.hs.mail.imap.processor.fetch.MimeDescriptor expectedObject = (com.hs.mail.imap.processor.fetch.MimeDescriptor) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <date>2020-09-23 10:08:55.551 UTC</date>" +
        "  <long>824</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.util.Date paramObject1 = (java.util.Date) paramObjects[0];
        long paramObject2 = (Long) paramObjects[1];
        Assert.assertEquals(expectedObject, receivingObject.build(paramObject1, paramObject2));
    }
}