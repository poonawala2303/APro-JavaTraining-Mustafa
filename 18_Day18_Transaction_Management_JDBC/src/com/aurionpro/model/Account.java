package com.aurionpro.model;

public abstract class Account 
{
	// Variable Declarations 
	
	private String accountNumber;
	private String name;
	protected double balance;

//	private static double minimumBalance = 500.0;
	// Parametrized constructor 
	
	public Account(String accountNumber ,String name, double balance) 
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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
	
}