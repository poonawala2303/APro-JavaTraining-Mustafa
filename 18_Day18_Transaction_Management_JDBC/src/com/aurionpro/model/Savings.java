package com.aurionpro.model;

public class Savings extends Account 
{
	
	// Variable declarations
	
	private static double minimumBalance = 500.0;
	
	// Parameterized Constructor

	public Savings(String accountNumber , String name, double balance) 
	{
		super(accountNumber , name, balance);
	}
	
	// Getter

	public static double getMinimumBalance() 
	{
		return minimumBalance;
	}
}