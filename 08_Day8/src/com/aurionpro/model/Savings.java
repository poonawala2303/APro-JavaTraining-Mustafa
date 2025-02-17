package com.aurionpro.model;

import com.aurionpro.exceptions.MinimumBalanceException;

public class Savings extends Account 
{
	
	// Variable declarations
	
	private static double minimumBalance = 500.0;
	
	// Parameterized Constructor

	public Savings(String name, double balance) 
	{
		super(name, balance);
	}
	
	// Getter

	public static double getMinimumBalance() 
	{
		return minimumBalance;
	}

	// Debit fxn
	
	public void debit(double amount) 
	{
		
			if (amount > 0 && balance - amount >= minimumBalance) 
			{
				balance -= amount;
				System.out.println("Amount Debited Successfully!");
				System.out.println("New Balance: " + balance);
			} 
			
			else 
			{
				throw new MinimumBalanceException();
			}
		
	}
}