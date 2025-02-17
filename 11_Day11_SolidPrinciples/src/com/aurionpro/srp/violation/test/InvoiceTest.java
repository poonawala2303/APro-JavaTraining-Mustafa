package com.aurionpro.srp.violation.test;

import java.util.Scanner;

import com.aurionpro.srp.violation.model.Invoice;

public class InvoiceTest 
{
	public static void main(String[] args) 
	{
		Invoice invoice = null;
		Scanner input = new Scanner(System.in);
		
		Invoice.calculateTax(invoice, input);
		Invoice.printInvoice(invoice);
		
	}
}
