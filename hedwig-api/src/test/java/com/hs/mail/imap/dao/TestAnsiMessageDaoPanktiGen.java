package com.hs.mail.imap.dao;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestAnsiMessageDaoPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetHeaderNameID1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>7</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Content-Type</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>14</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>X-Received</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>27</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Resent-To</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>20</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Thread-Index</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>22</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Accept-Language</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>12</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>X-Gm-Message-State</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>9</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Return-Path</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>8</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Content-Transfer-Encoding</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>29</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Resent-From</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>30</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Resent-Message-Id</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>13</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>X-Google-Smtp-Source</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>33</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>List-Help</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>76</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>x-ms-exchange-transport-fromentityheader</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>26</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>x-originating-ip</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>19</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Thread-Topic</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>207</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>x-pmwin-version</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>4</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Message-ID</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>31</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Sender</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>21</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Date</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>24</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>X-MS-TNEF-Correlator</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>1</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Received</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>10</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>X-Virus-Scanned</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>62</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>DMARC-Filter</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>34</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>List-Unsubscribe</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>2</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>From</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>208</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>x-puremessage</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>32</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Precedence</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>11</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>X-Google-DKIM-Signature</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>6</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>MIME-Version</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>5</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Subject</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>23</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>X-MS-Has-Attach</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>3</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>To</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetHeaderNameID33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getHeaderNameID33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<long>28</long>";
            long expectedObject = (Long) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <string>Resent-Date</string>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            java.lang.String paramObject1 = (java.lang.String) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getHeaderNameID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMessageIDList1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getMessageIDList1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
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
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getMessageIDList(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMessageIDList2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getMessageIDList2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
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
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getMessageIDList(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMessageIDList3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getMessageIDList3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
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
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getMessageIDList(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMessageIDList4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getMessageIDList4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
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
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getMessageIDList(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMessageFetchData1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getMessageFetchData1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.message.FetchData>" +
            "  <messageID>881</messageID>" +
            "  <physMessageID>823</physMessageID>" +
            "  <size>337700</size>" +
            "  <flags>" +
            "    <system__flags>16</system__flags>" +
            "  </flags>" +
            "  <internalDate>2020-09-23 09:33:01.0 UTC</internalDate>" +
            "</com.hs.mail.imap.message.FetchData>";
            com.hs.mail.imap.message.FetchData expectedObject = (com.hs.mail.imap.message.FetchData) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>881</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getMessageFetchData(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMessageFetchData2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.getMessageFetchData2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.hs.mail.imap.message.FetchData>" +
            "  <messageID>880</messageID>" +
            "  <physMessageID>822</physMessageID>" +
            "  <size>16530</size>" +
            "  <flags>" +
            "    <system__flags>16</system__flags>" +
            "  </flags>" +
            "  <internalDate>2020-09-23 09:31:29.0 UTC</internalDate>" +
            "</com.hs.mail.imap.message.FetchData>";
            com.hs.mail.imap.message.FetchData expectedObject = (com.hs.mail.imap.message.FetchData) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>880</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getMessageFetchData(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testResetRecent1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.resetRecent1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<list>" +
            "  <long>880</long>" +
            "</list>";
            java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.resetRecent(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testResetRecent2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.imap.dao.AnsiMessageDao.resetRecent2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.imap.dao.MySqlMessageDao receivingObject = (com.hs.mail.imap.dao.MySqlMessageDao) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<list>" +
            "  <long>881</long>" +
            "</list>";
            java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <long>4</long>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            long paramObject1 = (Long) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.resetRecent(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}