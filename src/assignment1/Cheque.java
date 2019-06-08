/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author 5864
 */
public class Cheque extends Account{
    public Cheque(double balance, double interest, double withdrawAmount, double withdrawLimit) {
        super(balance, interest, withdrawAmount, withdrawLimit);        
    }

    @Override
    public void display() {                                                     //displays info
        System.out.println("\n" +"\n" +"Cheque");
        super.display();
    }    
    
    public void changeWithdrawLimit(){                                          //change withdraw limit
        withdrawLimit= balance + 1;
    }    
}
