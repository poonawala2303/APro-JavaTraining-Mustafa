package com.aurionpro.dip.solution.model;

public class FileLogger implements Ilogger
{

	@Override
	public void log(String err) 
	{
		System.err.println("Logged to file: " + err);
	}
	
}
