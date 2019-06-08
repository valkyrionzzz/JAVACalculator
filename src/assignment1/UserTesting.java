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
public class UserTesting {
    Savings savings1 = new Savings(9000,0.03,0,-1);                             //sets up a user with all the accounts
    NetSaver netSaver1 = new NetSaver(9000,0.05,0,500);
    Cheque netCheque1 = new Cheque(9000,0.00,0,500);
    Fixed fixed1 = new Fixed(9000,0.08,0,500);
}
