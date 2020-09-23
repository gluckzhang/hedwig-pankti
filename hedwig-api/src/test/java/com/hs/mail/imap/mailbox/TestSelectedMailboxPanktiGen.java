package com.hs.mail.imap.mailbox;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestSelectedMailboxPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetCachedUids1() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>35</int>" +
        "          <long>878</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>36</int>" +
        "          <long>879</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>37</int>" +
        "          <long>880</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getCachedUids());
    }

    @Test
    public void testGetCachedUids2() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getCachedUids());
    }

    @Test
    public void testGetCachedUids3() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>false</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map/>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getCachedUids());
    }

    @Test
    public void testGetCachedUids4() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>false</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map/>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getCachedUids());
    }

    @Test
    public void testGetCachedUids5() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>35</int>" +
        "          <long>878</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>36</int>" +
        "          <long>879</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>37</int>" +
        "          <long>880</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>38</int>" +
        "          <long>881</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getCachedUids());
    }

    @Test
    public void testGetCachedUids6() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.util.List expectedObject = (java.util.List) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getCachedUids());
    }

    @Test
    public void testGetMessageNumber1() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>869</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber2() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>846</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber3() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>2</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>845</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber4() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>852</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber5() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>35</int>" +
        "          <long>878</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>879</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber6() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>851</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber7() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>854</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber8() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>861</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber9() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>860</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber10() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>870</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber11() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>871</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber12() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>846</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber13() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>858</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber14() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>853</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber15() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>850</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber16() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>856</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber17() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>872</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber18() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>847</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber19() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>874</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber20() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>849</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber21() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>851</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber22() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>false</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map/>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>845</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber23() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>864</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber24() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>878</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber25() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>849</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber26() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>868</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber27() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>855</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber28() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>876</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber29() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>850</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber30() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>859</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber31() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>false</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map/>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>845</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber32() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>867</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber33() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>853</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber34() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>844</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber35() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>873</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber36() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>847</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber37() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>2</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>845</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber38() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>865</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber39() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>877</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber40() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>848</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber41() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>866</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber42() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>848</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber43() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>844</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber44() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>854</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber45() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>35</int>" +
        "          <long>878</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>36</int>" +
        "          <long>879</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>880</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber46() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>852</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber47() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>863</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber48() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>857</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber49() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>875</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testGetMessageNumber50() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <long>862</long>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        long paramObject1 = (Long) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getMessageNumber(paramObject1));
    }

    @Test
    public void testIsDeletedMailbox1() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>35</int>" +
        "          <long>878</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>36</int>" +
        "          <long>879</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>37</int>" +
        "          <long>880</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isDeletedMailbox());
    }

    @Test
    public void testIsDeletedMailbox2() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isDeletedMailbox());
    }

    @Test
    public void testIsDeletedMailbox3() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isDeletedMailbox());
    }

    @Test
    public void testIsDeletedMailbox4() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>35</int>" +
        "          <long>878</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>36</int>" +
        "          <long>879</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>37</int>" +
        "          <long>880</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>38</int>" +
        "          <long>881</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isDeletedMailbox());
    }

    @Test
    public void testGetUID1() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>8262323712137915342</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>35</int>" +
        "          <long>878</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>36</int>" +
        "          <long>879</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>37</int>" +
        "          <long>880</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>38</int>" +
        "          <long>881</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<long>881</long>";
        long expectedObject = (Long) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>38</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getUID(paramObject1));
    }

    @Test
    public void testGetUID2() {
        String receivingXML = 
        "<com.hs.mail.imap.mailbox.SelectedMailbox>" +
        "  <sessionID>-7091255062154486704</sessionID>" +
        "  <mailboxID>4</mailboxID>" +
        "  <readOnly>false</readOnly>" +
        "  <recent>true</recent>" +
        "  <converter serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "      <default/>" +
        "      <map>" +
        "        <entry>" +
        "          <int>1</int>" +
        "          <long>844</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>2</int>" +
        "          <long>845</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>3</int>" +
        "          <long>846</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>4</int>" +
        "          <long>847</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>5</int>" +
        "          <long>848</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>6</int>" +
        "          <long>849</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>7</int>" +
        "          <long>850</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>8</int>" +
        "          <long>851</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>9</int>" +
        "          <long>852</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>10</int>" +
        "          <long>853</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>11</int>" +
        "          <long>854</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>12</int>" +
        "          <long>855</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>13</int>" +
        "          <long>856</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>14</int>" +
        "          <long>857</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>15</int>" +
        "          <long>858</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>16</int>" +
        "          <long>859</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>17</int>" +
        "          <long>860</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>18</int>" +
        "          <long>861</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>19</int>" +
        "          <long>862</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>20</int>" +
        "          <long>863</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>21</int>" +
        "          <long>864</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>22</int>" +
        "          <long>865</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>23</int>" +
        "          <long>866</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>24</int>" +
        "          <long>867</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>25</int>" +
        "          <long>868</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>26</int>" +
        "          <long>869</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>27</int>" +
        "          <long>870</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>28</int>" +
        "          <long>871</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>29</int>" +
        "          <long>872</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>30</int>" +
        "          <long>873</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>31</int>" +
        "          <long>874</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>32</int>" +
        "          <long>875</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>33</int>" +
        "          <long>876</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>34</int>" +
        "          <long>877</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>35</int>" +
        "          <long>878</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>36</int>" +
        "          <long>879</long>" +
        "        </entry>" +
        "        <entry>" +
        "          <int>37</int>" +
        "          <long>880</long>" +
        "        </entry>" +
        "      </map>" +
        "    </org.apache.commons.collections.bidimap.DualHashBidiMap>" +
        "  </converter>" +
        "</com.hs.mail.imap.mailbox.SelectedMailbox>";
        com.hs.mail.imap.mailbox.SelectedMailbox receivingObject = (com.hs.mail.imap.mailbox.SelectedMailbox) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<long>880</long>";
        long expectedObject = (Long) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>37</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getUID(paramObject1));
    }
}