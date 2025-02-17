package com.aurionpro.isp.solution.test;

import com.aurionpro.isp.solution.model.Labour;
import com.aurionpro.isp.solution.model.LabourInterface;
import com.aurionpro.isp.solution.model.RoboInterface;
import com.aurionpro.isp.solution.model.Robot;

public class WorkerTest 
{
	public static void main(String[] args) 
	{
		
		LabourInterface labour = new Labour();
		labourFunctions(labour);
		
		System.out.println("");
		
		RoboInterface robo = new Robot();
		roboFunctions(robo);
	}
	
	public static void labourFunctions(LabourInterface labour)
	{
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
	}
	
	public static void roboFunctions(RoboInterface robo)
	{
		robo.startWork();
		robo.stopWork();
	}
}
