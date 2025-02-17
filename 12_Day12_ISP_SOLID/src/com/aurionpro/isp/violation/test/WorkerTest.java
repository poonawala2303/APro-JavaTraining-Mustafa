package com.aurionpro.isp.violation.test;

import com.aurionpro.isp.violation.model.Labour;
import com.aurionpro.isp.violation.model.Robot;

public class WorkerTest 
{
	
	public static void main(String[] args) 
	{
		
		Labour labour = new Labour();
		labourFunctions(labour);
		
		System.out.println("");
		
		Robot robo = new Robot();
		roboFunctions(robo);
	}
	
	public static void labourFunctions(Labour labour)
	{
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
	}
	
	public static void roboFunctions(Robot robo)
	{
		robo.startWork();
		robo.stopWork();
		robo.eat();
		robo.drink();
	}
}
