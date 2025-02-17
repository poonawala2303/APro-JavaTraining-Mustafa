package com.aurionpro.dip.violation.test;

import com.aurionpro.dip.violation.model.TaxCalaulator;

public class TaxCalculatorTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Tax for object t1");
		TaxCalaulator t1 = new TaxCalaulator(null);
		t1.calculateTax(2000, 25);
		
		System.out.println("\nTax for object t2");
		TaxCalaulator t2 = new TaxCalaulator(null);
		t2.calculateTax(1000, 0);
	}
}
