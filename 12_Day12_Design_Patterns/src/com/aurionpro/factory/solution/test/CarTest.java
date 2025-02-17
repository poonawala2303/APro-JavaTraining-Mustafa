package com.aurionpro.factory.solution.test;

import com.aurionpro.factory.solution.model.ICar;
import com.aurionpro.factory.solution.model.ICarFactory;
import com.aurionpro.factory.solution.model.MarutiFactory;

public class CarTest 
{
	public static void main(String[] args) 
	{
		ICarFactory marutiFactory = new MarutiFactory();
		ICar maruti = marutiFactory.makeCar();
		
		maruti.start();
		maruti.stop();
	}
}
