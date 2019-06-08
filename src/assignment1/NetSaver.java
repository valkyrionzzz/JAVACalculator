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
public class NetSaver extends Account implements Interest {
    public NetSaver(double balance, double interest, double withdrawAmount, double withdrawLimit) {
        super(balance, interest, withdrawAmount, withdrawLimit);        
    }

    @Override
    public void display() {                                                     //display info
        System.out.println("\n" +"\n" +"Net-Savings");
        super.display();
    }    
    
    @Override
    public void addInterest() {                                                 //calculate interest
        balance += balance * interest;
    }  
}
