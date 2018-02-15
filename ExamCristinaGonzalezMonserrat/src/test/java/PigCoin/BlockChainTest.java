/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PigCoin;

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
public class BlockChainTest {
    
    public BlockChainTest() {
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
     * Test of addOrigin method, of class BlockChain.
     */
    @Test
    public void testAddOrigin() {
        System.out.println("addOrigin");
        Wallet origin = new Wallet();
        origin.generateKeyPair();
        Wallet wallet_1 = new Wallet();
        wallet_1.generateKeyPair();
        Transaction trx = new Transaction("hash_1", "0", origin.getAddress(), wallet_1.getAddress(), 20, "bacon eggs");
        BlockChain instance = new BlockChain();
        instance.addOrigin(trx);
        assert(instance.getBlockChain().size() > 0);
    }
    
}
