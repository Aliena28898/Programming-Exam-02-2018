/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PigCoin;

import java.security.PrivateKey;
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
public class WalletTest {
    
    public WalletTest() {
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
     * Tests para la historia de usuario 1:
     */

    /**
     * Test of getPK method, of class Wallet.
     */
    @org.junit.Test
    public void testGetPK() {
        System.out.println("getPK");
        Wallet instance = new Wallet();
        PrivateKey expResult = null;
        PrivateKey result = instance.getPK();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSK method, of class Wallet.
     */
    @org.junit.Test
    public void testSetSK() {
        System.out.println("setSK");
        PrivateKey PK = null;
        Wallet instance = new Wallet();
        instance.setSK(PK);
    }

    /**
     * Test of getAddress method, of class Wallet.
     */
    @org.junit.Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Wallet instance = new Wallet();
        PublicKey expResult = null;
        PublicKey result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Wallet.
     */
    @org.junit.Test
    public void testSetAddress() {
        System.out.println("setAddress");
        PublicKey Address = null;
        Wallet instance = new Wallet();
        instance.setAddress(Address);
    }
    
}