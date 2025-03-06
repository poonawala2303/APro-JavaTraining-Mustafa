package com.aurionpro.entity;

public class BankAccount 
{
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) 
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
}
