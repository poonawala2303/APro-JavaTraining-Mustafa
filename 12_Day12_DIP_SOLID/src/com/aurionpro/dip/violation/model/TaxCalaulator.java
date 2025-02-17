package com.aurionpro.dip.violation.model;

public class TaxCalaulator 
{
	
	private DBLogger dblogger;
//	DBLogger dblogger = new DBLogger();
	
	public TaxCalaulator(DBLogger dblogger)
	{
		this.dblogger = dblogger;
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
			new DBLogger().log("Divide by Zero error");
		}
		
		return tax;
	}
}
