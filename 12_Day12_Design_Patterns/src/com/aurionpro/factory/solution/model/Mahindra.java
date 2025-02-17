package com.aurionpro.factory.solution.model;

public class Mahindra implements ICar{

	@Override
	public void start() 
	{
		System.out.println("Mahindra Starts");	
	}

	@Override
	public void stop() 
	{
		System.out.println("Mahindra Stops");	
	}

}
