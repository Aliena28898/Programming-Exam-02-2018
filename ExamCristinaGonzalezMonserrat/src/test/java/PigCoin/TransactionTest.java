/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PigCoin;

import java.security.PublicKey;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aliena
 */
public class TransactionTest {
    
    public TransactionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Tests de la historia de usuario 4.
     */
    
    /**
     * Test of getPigcoins method, of class Transaction.
     */
    @Test
    public void testGetPigcoins() {
        System.out.println("getPigcoins");
        Transaction instance = new Transaction();
        double expResult = 0.0;
        double result = instance.getPigcoins();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPigcoins method, of class Transaction.
     */
    @Test
    public void testSetPigcoins() {
        System.out.println("setPigcoins");
        double pigcoins = 0.0;
        Transaction instance = new Transaction();
        instance.setPigcoins(pigcoins);
    }

    /**
     * Test of getHash method, of class Transaction.
     */
    @Test
    public void testGetHash() {
        System.out.println("getHash");
        Transaction instance = new Transaction();
        String expResult = null;
        String result = instance.getHash();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHash method, of class Transaction.
     */
    @Test
    public void testSetHash() {
        System.out.println("setHash");
        String hash = "";
        Transaction instance = new Transaction();
        instance.setHash(hash);
    }

    /**
     * Test of getPrev_hash method, of class Transaction.
     */
    @Test
    public void testGetPrev_hash() {
        System.out.println("getPrev_hash");
        Transaction instance = new Transaction();
        String result = instance.getPrev_hash();
        assertEquals(null, result);
    }

    /**
     * Test of setPrev_hash method, of class Transaction.
     */
    @Test
    public void testSetPrev_hash() {
        System.out.println("setPrev_hash");
        String prev_hash = "";
        Transaction instance = new Transaction();
        instance.setPrev_hash(prev_hash);
    }

    /**
     * Test of getpKey_sender method, of class Transaction.
     */
    @Test
    public void testGetpKey_sender() {
        System.out.println("getpKey_sender");
        Transaction instance = new Transaction();
        PublicKey expResult = null;
        PublicKey result = instance.getpKey_sender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setpKey_sender method, of class Transaction.
     */
    @Test
    public void testSetpKey_sender() {
        System.out.println("setpKey_sender");
        PublicKey pKey_sender = null;
        Transaction instance = new Transaction();
        instance.setpKey_sender(pKey_sender);
    }

    /**
     * Test of getpKey_recipient method, of class Transaction.
     */
    @Test
    public void testGetpKey_recipient() {
        System.out.println("getpKey_recipient");
        Transaction instance = new Transaction();
        PublicKey expResult = null;
        PublicKey result = instance.getpKey_recipient();
        assertEquals(expResult, result);
    }

    /**
     * Test of setpKey_recipient method, of class Transaction.
     */
    @Test
    public void testSetpKey_recipient() {
        System.out.println("setpKey_recipient");
        PublicKey pKey_recipient = null;
        Transaction instance = new Transaction();
        instance.setpKey_recipient(pKey_recipient);
    }

    /**
     * Test of getMessage method, of class Transaction.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Transaction instance = new Transaction();
        String result = instance.getMessage();
        assertEquals(null, result);
    }

    /**
     * Test of setMessage method, of class Transaction.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        Transaction instance = new Transaction();
        instance.setMessage(message);
    }

    /**
     * Test of getSignature method, of class Transaction.
     */
    @Test
    public void testGetSignature() {
        System.out.println("getSignature");
        Transaction instance = new Transaction();
        byte[] expResult = null;
        byte[] result = instance.getSignature();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setSignature method, of class Transaction.
     */
    @Test
    public void testSetSignature() {
        System.out.println("setSignature");
        byte[] signature = null;
        Transaction instance = new Transaction();
        instance.setSignature(signature);
    }

    /**
     * Test of toString method, of class Transaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Wallet wallet_1 = new Wallet();
        wallet_1.generateKeyPair();
        Wallet wallet_2 = new Wallet();
        wallet_2.generateKeyPair();
        Transaction instance = new Transaction("hash_1", "0", wallet_1.getAddress(), wallet_2.getAddress(), 20, "a flying pig!");;
        String result = instance.toString();
        assertNotNull(result);
    }
    
}
