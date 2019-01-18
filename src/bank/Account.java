/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Almodad
 */
public class Account {
    int accountNumber;
    String accountType;
    float balance;
    
   
    public void deposit(float amount){
        this.balance += amount;
    }
    public void withdraw(float amount){
        if(this.getBalance() >= amount){
            this.balance -= amount;            
        }else{
            System.out.print("Insufficient balance");
        }
    }
    public float getBalance(){
        return this.balance;
    }
}
