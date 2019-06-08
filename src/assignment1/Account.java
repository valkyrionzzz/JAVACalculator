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
public abstract class Account implements Interest {
    protected double balance;
    protected double interest;
    protected double withdrawAmount;
    protected double withdrawLimit;

    public Account(double balance, double interest, double withdrawAmount, double withdrawLimit) {
        this.balance = balance;
        this.interest = interest;
        this.withdrawAmount = withdrawAmount;
        this.withdrawLimit = withdrawLimit;
    }
    
    public void display(){                                                      //displays info
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interest);
        System.out.println("Withdraw Limit: " + withdrawLimit);
    }
 
    public void withdrawMoney(){                                                //withdraw money
        boolean valid = true;
        double newBalance;
        Scanner sc=new Scanner(System.in);                                      //check for vali input
        System.out.print("Enter your withdrawal amount:$"); 
        while(!sc.hasNextDouble()) {
            System.out.println("Invalid Input. Enter a number");
                sc.nextLine();
        }
        while(valid){    
            withdrawAmount = sc.nextDouble();
                if(withdrawLimit >= withdrawAmount && balance >= withdrawAmount && withdrawLimit >20 && withdrawAmount%20 == 0){    //validity check
                    newBalance = balance - withdrawAmount;
                    System.out.print("Your new balance is:$"+newBalance);
                    dispense();                                                                                                     //runs dispense()
                    valid = false;
                }
                else  
                    System.out.println("Invalid input \nEnter your withdrawal amount:$");            
        }
    }

    @Override
    public void addInterest(){                                                  //calculates interest
        balance += balance * interest;
    }   
    
    public void dispense(){                                                     //gives appropriate notes
        double temp = withdrawAmount;
        int counter = 0;
        while(temp >= 100){
            temp = temp-100;
            counter++;            
        }
        System.out.println("\n"+"100's :" + counter);                           //100's
        counter = 0;
        while(temp >= 50 && temp%50 ==0){
            temp = temp-50;
            counter++;            
        }
        System.out.println("50's :" + counter);                                 //50's
        counter = 0;
        while(temp >= 20){
            temp = temp-20;
            counter++;
        }
        System.out.println("20's :" + counter);                                 //20's
    } 
    
}
