package com.aurionpro.model;

import java.util.Scanner;

public class DebitCardPayment implements Payment {

	private String name;
	
	public DebitCardPayment()
	{
		
	}
	
	public DebitCardPayment(String name) 
	{
		this.name = name;
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
		
		System.out.println("Payment successfull");
		
	}

}
