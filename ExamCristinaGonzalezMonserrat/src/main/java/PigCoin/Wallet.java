/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PigCoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
/**
 *
 * @author aliena
 */
public class Wallet {
    private PrivateKey SK;
    private PublicKey Address;

    public PrivateKey getPK() {
        return SK;
    }

    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }

    public PublicKey getAddress() {
        return Address;
    }

    public void setAddress(PublicKey Address) {
        this.Address = Address;
    }
    
}
