package com.aurionpro.model;

import java.util.Random;

public class Account {

    private String accountNumber;
    private String accountName;
    private double accountBalance;

    public Account()
    {

    }

    public Account(String accountName, double accountBalance)
    {
        this.accountNumber = generateAccountNumber();
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    
    public static String generateAccountNumber()
    {
    	Random randomNum = new Random();
    	return String.format("%010d" , randomNum.nextInt(1000000000));
    }

    // Getters and Setters
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    // Deposit fxn 
    
    public void deposit(double amount)
    {
    	if(amount > 0)
    	{
    		accountBalance += amount;
    	}
    	
    	else
    	{
    		System.out.println("Enter valid amount");
    	}
    }
    
    // withdraw fxn
    
    public void withdraw(double amount)
    {
    	if (amount > 0 && accountBalance >= amount) 
    	{
    		accountBalance -= amount;
            System.out.println("Withdrawal successful! New balance: " + accountBalance);
            
        } 
    	
    	else 
    	{
            System.out.println("Insufficient funds.");
            
        }
    }
    
    // displayDetaila fxn
    
    public void displayDetails()
    {
    	 System.out.println("Account Number: " + accountNumber);
         System.out.println("Name: " + accountName);
         System.out.println("Balance: " + accountBalance);
    }

}
