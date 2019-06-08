/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner;
/**
 *
 * @author 5864
 */
public class Fixed extends Account implements Interest{
    public Fixed(double balance, double interest, double withdrawAmount, double withdrawLimit)
    {
        super(balance, interest, withdrawAmount, withdrawLimit);        
    }

    @Override
    public void display() {                                                     //displays info
        System.out.println("\n" +"\n" +"Fixed");               
        System.out.println("Withdraw Limit: " +withdrawLimit);
        super.display();
    }    
    
    @Override
    public void addInterest() {                                                 //calculates interest
        boolean date = true;
        if(date){
            balance += balance * interest;
            System.out.println("New Balance: " +balance);
        }
    }
    
    public void changeWithdrawLimit(){                                          //change withdraw limit
        withdrawLimit= balance + 1;
    }
}
