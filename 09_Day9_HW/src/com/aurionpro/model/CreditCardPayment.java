package com.aurionpro.model;

import java.util.Scanner;

public class CreditCardPayment implements Payment
{

	private String name;
	private double interest;
	
	public CreditCardPayment()
	{
		
	}
	
	public CreditCardPayment(String name, double interest) 
	{
		this.name = name;
		this.interest = interest;
	}

	public void processPayment(double amount) 
	{
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.print("Enter account holder name: ");
		name = inputVariable.nextLine();
		
		System.out.println("Payment processed");
		
		try 
		{
			  Thread.sleep(2000);
		} 
		
		catch(InterruptedException e) 
		{
			  Thread.currentThread().interrupt();
		}
		
		interest = 0.034*amount;
		
		System.out.println("Payment successfull");
		System.out.print("Interest Payable: " + interest);
		System.out.println("");
		
	}

}
