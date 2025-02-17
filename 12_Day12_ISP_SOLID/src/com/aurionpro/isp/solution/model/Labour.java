package com.aurionpro.isp.solution.model;

public class Labour implements LabourInterface,RoboInterface 
{

	@Override
	public void startWork() 
	{
		System.out.println("Labour Started Working");
		
	}

	@Override
	public void stopWork() 
	{
		System.out.println("Labour Stopped Working");
		
	}

	@Override
	public void eat() 
	{
		System.out.println("Labour Started Eating");
		
	}

	@Override
	public void drink() 
	{
		System.out.println("Labour Started Drinking");
		
	}

}
