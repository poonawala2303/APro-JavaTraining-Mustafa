package com.aurionpro.dip.solution.model;

public class DBLogger implements Ilogger 
{

	@Override
	public void log(String err) 
	{
		System.err.println("Logged to database: " + err);	
	}

}
