package com.aurionpro.dip.violation.model;

public class DBLogger 
{
	public void log(String err)
	{
		System.err.println("Logged to Database: " + err);
	}
}
