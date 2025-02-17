package com.aurionpro.dip.solution.model;

import com.aurionpro.dip.solution.model.DBLogger;

public class TaxCalculator 
{
	private Ilogger logger;
	
	public TaxCalculator(Ilogger logger) 
	{
		this.logger = logger;
	}
	
	public int calculateTax(int amount , int rate)
	{
		int tax = 0;
		
		try 
		{
			tax = amount/rate;
			System.out.println("Tax is: "+tax);
		}
		
		catch (Exception e)
		{
			logger.log("Divide by Zero error");
		}
		
		return tax;
	}

}
