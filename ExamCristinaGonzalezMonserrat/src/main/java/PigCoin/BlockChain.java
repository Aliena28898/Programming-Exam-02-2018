/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PigCoin;

import java.util.ArrayList;

/**
 *
 * @author aliena
 */
public class BlockChain {
    private ArrayList <Transaction> blockChain = new ArrayList<>();
    
    
    
    
    public ArrayList <Transaction> getBlockChain(){
        return this.blockChain;
    }
    
    public void addOrigin(Transaction transaction){
        blockChain.add(transaction);
    }
    
    
    public String summarize(){
        String s = "";
        for(Transaction trans : this.getBlockChain()){
            s = s + trans.toString();
        }
        System.out.println(s); 
        return s;
    }
    
    public String summarize(int index){
        String s = this.getBlockChain().toArray()[index].toString();
        System.out.println(s);
        return s;
    }
}
