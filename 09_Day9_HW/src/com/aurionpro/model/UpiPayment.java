package com.aurionpro.model;

import java.util.Scanner;

public class UpiPayment implements Payment
{

	private String name;
	protected int pin;
	
	public UpiPayment()
	{
		
	}
	
	public UpiPayment(String name, int pin) 
	{
		this.name = name;
		this.pin = pin;
	}

	public void processPayment(double amount) 
	{
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.print("Enter account holder name: ");
		name = inputVariable.nextLine();
		
		System.err.print("Enter 4 digit UPI PIN: ");
		pin = inputVariable.nextInt();
		
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
