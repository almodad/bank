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
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer alex = new Customer();
        alex.setFirstName("Alex");
        alex.setLastName("Jane");
        alex.setAccNo(1);
        
        Account account = new Account();
        account.deposit(5000);
        System.out.println("Account Balance: "+account.getBalance());      
        account.withdraw(8000);
        System.out.println("Account Balance: "+account.getBalance());
      
    }
    
}
