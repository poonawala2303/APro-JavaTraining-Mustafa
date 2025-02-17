package com.aurionpro.srp.violation.model;

import java.util.Scanner;

public class Invoice 
{
	private int id;
	private String description;
	private static int amount;
	private static double tax;
	
	public Invoice(int id, String description, int amount, double tax) 
	{
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public int getAmount() 
	{
		return amount;
	}

	public void setAmount(int amount) 
	{
		this.amount = amount;
	}

	public double getTax() 
	{
		return tax;
	}

	public void setTax(double tax) 
	{
		this.tax = tax;
	}
	
	public static void calculateTax(Invoice invoice , Scanner input)
	{
		
		System.out.print("Enter the Product Id: ");
		invoice.setId(input.nextInt());
		
		System.out.print("Enter the Product Desc: ");
		invoice.setDescription(input.nextLine());
		
		System.out.print("Enter the Product Amount: ");
		invoice.setAmount(input.nextInt());
		
	}
	
	public static void printInvoice(Invoice invoice)
	{
		
		tax = 0.05*amount;
		invoice.setTax(tax);
		
		System.out.println("Product Id: ");
		invoice.getId();
		
		System.out.println("Product Description: ");
		invoice.getDescription();
		
		System.out.println("Product Amount: ");
		invoice.getAmount();
		
		System.out.println("Applicable Tax: ");
		invoice.getTax();
		
		double totalAmount = invoice.getTax() + invoice.getAmount();
		System.err.println("Total Amount: " + totalAmount);
		
	}
	
}
