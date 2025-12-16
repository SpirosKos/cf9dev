package gr.aueb.cf.cf9.solutions.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Withdraw and deposits only positive numbers from a balance bank account
 *
 * @author g0ld3
 * @version 1.0
 */

public class Bank {

    //static declaration
    static double balance = 500;
    static Scanner sc = new Scanner(System.in);

    //main caller with try/catch for withdraw and deposit
    public static void main(String[] args) {
        try {
            deposit(-100);
        }catch (Exception e){
            System.out.println("There was an error with deposit, please try again");
        }
        try {
            withdraw(50);
        }catch (Exception e){
            System.out.println("There was an error with withdraw, please try again");
        }
    }

    /**
     * deposit method
     * @param amount        deposit amount
     * @throws Exception    amount < 0
     */
    public static void deposit(double amount) throws Exception{
        try {
            if (amount < 0 ) {
                throw new Exception(" Deposit Amount cannot be negative");
            }
            System.out.println("The new balance is " + (balance += amount));    //log
        }catch (Exception e){
            System.err.println(LocalDateTime.now() + e.getMessage());   //log
            throw e;
        }
    }

    /**
     * Withdraw method
     * @param amount        withdraw amount
     * @throws Exception    amount < 0
     */
    public static void withdraw(double amount) throws Exception{
        try {
            if (amount < 0 || amount > balance){
                throw new Exception("Withdraw Amount cannot be negative or more than balance");
            }
            System.out.println("The new balance is " + (balance -= amount));    //log
        }catch (Exception e){
            System.err.println(LocalDateTime.now() + e.getMessage());   //log
            throw e;
        }
    }
}
