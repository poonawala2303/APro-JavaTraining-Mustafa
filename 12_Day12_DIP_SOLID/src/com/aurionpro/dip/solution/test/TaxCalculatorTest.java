package com.aurionpro.dip.solution.test;

import com.aurionpro.dip.solution.model.DBLogger;
import com.aurionpro.dip.solution.model.FileLogger;
import com.aurionpro.dip.solution.model.Ilogger;
import com.aurionpro.dip.solution.model.TaxCalculator;

public class TaxCalculatorTest 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Tax for object t1");
		TaxCalculator t1 = new TaxCalculator(new DBLogger());
		t1.calculateTax(2000, 20);
		
		System.out.println("");
		
		System.out.println("\nTax for object t2");
		TaxCalculator t2 = new TaxCalculator(new FileLogger());
		t2.calculateTax(1000, 0);
		
	}
}
