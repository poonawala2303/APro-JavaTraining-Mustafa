package com.aurionpro.factory.solution.model;

public class Maruti implements ICar
{

	@Override
	public void start() 
	{
		System.out.println("Maruti Starts");	
	}

	@Override
	public void stop() 
	{
		System.out.println("Maruti Stops");
	}

}
