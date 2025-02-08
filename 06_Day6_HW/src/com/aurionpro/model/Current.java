package com.aurionpro.model;

public class Current extends Account {
	
	// Variables declaration
	
	private double overdraftLimit = 3000;
	private double interestRate;

	// Parameterized constructor
	
	public Current(String name, double balance, double overdraftLimit , double interestRate) 
	{
		super(name, balance);
		this.overdraftLimit = overdraftLimit;
		this.interestRate = interestRate;
	}

	// Debit fxn
	
	public void debit(double amount) 
	{
		
		double overdraftAmount = 0;
		if (amount > 0 && (balance - amount) >= -overdraftLimit) 
		{
			balance -= amount;
			
			if( (balance - amount) < 0)
			{
				overdraftAmount = Math.abs(balance);
			}
			
			System.out.println("Amount Debited Successfully!");
			double interestAmount = (overdraftAmount*interestRate) / 100;
			System.out.println("Interest Amount is: " + Math.abs(interestAmount));
			System.out.println("New Balance: " + balance);
		} 
		
		else 
		{
			System.out.println("Overdraft limit exceeded! Maximum overdraft allowed: " + overdraftLimit);
		}
		
	}
}