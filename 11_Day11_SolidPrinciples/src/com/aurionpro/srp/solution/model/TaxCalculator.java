package com.aurionpro.srp.solution.model;

import java.util.Scanner;

public class TaxCalculator 
{
	
	public void calculateTax(Invoice invoice)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Product Id: ");
		invoice.setId(input.nextInt());
		
		System.out.print("Enter the Product Desc: ");
		input.nextLine();
		invoice.setDescription(input.nextLine());
		
		System.out.print("Enter the Product Amount: ");
		invoice.setAmount(input.nextInt());
		
		invoice.setTax(0.05*invoice.getAmount());
	}
	
}
