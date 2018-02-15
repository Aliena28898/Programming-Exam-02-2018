/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PigCoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
/**
 *
 * @author aliena
 */
public class Wallet {
    private PrivateKey SK;
    private PublicKey Address;
    private double total_input = 0.0;
    private double total_output = 0.0;
    private double balance = 0.0;
    private ArrayList <Transaction> inputTransactions = new ArrayList<>();
    private ArrayList <Transaction> outputTransactions = new ArrayList<>();

    public PrivateKey getSK() {
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
    
    public double getTotal_input() {
        return total_input;
    }

    public void setTotal_input(double total_input) {
        this.total_input = total_input;
    }

    public double getTotal_output() {
        return total_output;
    }

    public void setTotal_output(double total_output) {
        this.total_output = total_output;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void generateKeyPair(){
        KeyPair pair = GenSig.generateKeyPair();
        this.setSK(pair.getPrivate());
        this.setAddress(pair.getPublic());
    }
    
    @Override
    public String toString(){
        String s = "" +
                "Wallet = "+this.getAddress().hashCode() + "\n" +
                "Total input = "+this.getTotal_input() + "\n" +
                "Total output = "+this.getTotal_output() + "\n" +
                "Balance = "+this.getBalance();
        return s;
    }

    
    
}
