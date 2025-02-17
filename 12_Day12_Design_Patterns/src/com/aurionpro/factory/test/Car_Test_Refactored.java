package com.aurionpro.factory.test;

import com.aurionpro.factory.model.CarFactory;
import com.aurionpro.factory.model.CarType;
import com.aurionpro.factory.model.Icar;

public class Car_Test_Refactored 
{
	public static void main(String[] args) 
	{
		CarFactory factory = new CarFactory();
		
		Icar maruti = factory.makeCars(CarType.Maruti);
		
		maruti.start();
		maruti.stop();
	}
}
