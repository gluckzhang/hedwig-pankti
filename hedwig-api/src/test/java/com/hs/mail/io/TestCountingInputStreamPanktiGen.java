package com.hs.mail.io;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestCountingInputStreamPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testRead1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>97</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>105</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>109</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>104</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>114</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>102</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>103</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>110</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>101</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>67</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>114</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>111</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>67</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>101</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>82</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>101</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>101</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>116</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>108</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>117</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>114</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>100</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>110</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>110</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>72</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>105</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>97</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>115</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read38-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read40-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>118</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read41-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>97</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read42-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>112</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read43-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>105</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read44-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>118</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read45-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>111</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>67</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read47-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>116</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read49-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRead50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("com.hs.mail.io.CountingInputStream.read50-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            com.hs.mail.io.CountingInputStream receivingObject = (com.hs.mail.io.CountingInputStream) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>105</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.read());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}