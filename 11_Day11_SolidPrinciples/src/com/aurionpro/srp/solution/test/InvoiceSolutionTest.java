package com.aurionpro.srp.solution.test;

import com.aurionpro.srp.solution.model.Invoice;
import com.aurionpro.srp.solution.model.InvoicePrinter;
import com.aurionpro.srp.solution.model.TaxCalculator;

public class InvoiceSolutionTest 
{
	public static void main(String[] args) 
	{
		Invoice invoice = new Invoice();
		
		InvoicePrinter invoicePrint = new InvoicePrinter();
		TaxCalculator taxCalculate = new TaxCalculator();
		
		taxCalculate.calculateTax(invoice);
		invoicePrint.printInvoice(invoice);
	}
}
