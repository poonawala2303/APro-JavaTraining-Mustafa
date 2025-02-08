package com.aurionpro.model;

import java.util.Random;

public abstract class Account 
{
	// Variable Declarations 
	
	private String accountNumber;
	private String name;
	protected double balance;

	// Parametrized constructor 
	
	public Account(String name, double balance) 
	{
		this.name = name;
		this.accountNumber = generateAccountNumber();
		this.balance = balance;
	}
	
	// Random number generation function

	private String generateAccountNumber() 
	{
		Random rand = new Random();
    	return String.format("BOI" +"%010d" , rand.nextInt(1000000000));
	}

	// Getters
	
	public String getAccountNumber() 
	{
		return accountNumber;
	}

	public String getName() 
	{
		return name;
	}

	public double getBalance() 
	{
		return balance;
	}
	
	// Deposit fxn

	public void deposit(double amount) 
	{
		
		if (amount > 0) 
		{
			balance += amount;
			System.out.println("Amount Deposited Successfully!");
			System.out.println("New Balance: " + balance);
		} 
		
		else 
		{
			System.out.println("Invalid amount!");
		}
		
	}

	public abstract void debit(double amount);
}