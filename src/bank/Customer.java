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
public class Customer {
    String firstName, lastName, gender, phone;
    int accountNumber;
    
    public void setFirstName(String fname){
        this.firstName = fname;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lname){
        this.lastName = lname;
    }
    public String getLastName(){
        return this.lastName;
    }
    
    public void setAccNo(int account){
        this.accountNumber = account;
    }
    
    public int getAccNo(){
        return this.accountNumber;
    }
    
}
