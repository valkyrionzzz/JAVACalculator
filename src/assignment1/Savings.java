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
public class Savings extends Account implements Interest {    

    public Savings(double balance, double interest, double withdrawAmount, double withdrawLimit)
    {
        super(balance, interest, withdrawAmount, withdrawLimit);        
    }

    @Override
    public void display() {                                                     //display info
        System.out.println("\n" +"Savings");               
        System.out.println("Withdraw Limit: " +withdrawLimit);
        super.display();
    }    
    
    @Override
    public void addInterest() {                                                 //calculates interest
        balance += balance * interest;
        System.out.println("New Balance: " +balance);
    }
    
    public void changeWithdrawLimit(){                                          //change withdraw limit
        Scanner sc=new Scanner(System.in);                                      //check for vali input
        System.out.print("Enter your withdraw limit: $"); 
        while(!sc.hasNextDouble()) {
            System.out.println("Invalid Input. Enter a number");
                sc.nextLine();
        }
        withdrawLimit=sc.nextDouble(); 
    }   
}
