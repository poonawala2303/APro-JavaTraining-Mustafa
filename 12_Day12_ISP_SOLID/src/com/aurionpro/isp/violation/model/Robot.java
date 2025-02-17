package com.aurionpro.isp.violation.model;

public class Robot implements Iworker{

	@Override
	public void startWork() 
	{
		System.out.println("Robot Started Working");
	}

	@Override
	public void stopWork() 
	{
		System.out.println("Robot Stopped Working");
	}

	@Override
	public void eat()
	{
		System.out.println("Robot Started Eating (doesnt make sense)");	
	}

	@Override
	public void drink() 
	{
		System.out.println("Robot Started Drinking (doesnt make sense)");	
	}

}
