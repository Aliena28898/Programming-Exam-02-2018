/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PigCoin;


import java.security.PublicKey;
/**
 *
 * @author aliena
 */
public class Transaction {
    private String hash;
    private String prev_hash;
    private PublicKey pKey_sender;
    private PublicKey pKey_recipient;
    private String message;
    private byte[] signature;
    private double pigcoins;

    public Transaction(){
        
    }
    
    public Transaction(String hash, String prevHash, PublicKey sender, PublicKey recipient, double amount, String message){
        this.setHash(hash);
        this.setPrev_hash(prevHash);
        this.setpKey_sender(sender);
        this.setpKey_recipient(recipient);
        this.setPigcoins(amount);
        this.setMessage(message);
        
    };

    public double getPigcoins() {
        return pigcoins;
    }

    public void setPigcoins(double pigcoins) {
        this.pigcoins = pigcoins;
    }
    
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPrev_hash() {
        return prev_hash;
    }

    public void setPrev_hash(String prev_hash) {
        this.prev_hash = prev_hash;
    }

    public PublicKey getpKey_sender() {
        return pKey_sender;
    }

    public void setpKey_sender(PublicKey pKey_sender) {
        this.pKey_sender = pKey_sender;
    }

    public PublicKey getpKey_recipient() {
        return pKey_recipient;
    }

    public void setpKey_recipient(PublicKey pKey_recipient) {
        this.pKey_recipient = pKey_recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }
    
    @Override
    public String toString(){
        String s = "" +
                "hash = "+this.getHash() + "\n" +
                "prev_hash = "+this.getPrev_hash() + "\n" +
                "pKey_sender = "+this.getpKey_sender().hashCode() + "\n" +
                "pKey_recipient = "+this.getpKey_recipient().hashCode() + "\n" +
                "pigcoins = "+this.getPigcoins() + "\n" +
                "message = "+this.getMessage();
        return s;
    }
    
}
