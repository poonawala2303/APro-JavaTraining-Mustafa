package com.aurionpro.srp.solution.model;

public class InvoicePrinter 
{

	public void printInvoice(Invoice invoice)
	{
		System.out.println("Product Id: " + invoice.getId());
		
		System.out.println("Product Description: " + invoice.getDescription());
		
		System.out.println("Product Amount: " + invoice.getAmount());
		
		System.out.println("Applicable Tax: " + invoice.getTax());
		
		double totalAmount = invoice.getTax() + invoice.getAmount();
		
		System.out.println("Total Amount: " + totalAmount);
	}
	
}
