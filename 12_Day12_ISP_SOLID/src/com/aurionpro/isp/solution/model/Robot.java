package com.aurionpro.isp.solution.model;

public class Robot implements RoboInterface 
{

	@Override
	public void startWork() 
	{
		System.out.println("Robot started working");
	}

	@Override
	public void stopWork() 
	{
		System.out.println("Robot stopped working");
	}

}
