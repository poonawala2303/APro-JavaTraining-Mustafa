package com.aurionpro.factory.solution.model;

public class MarutiFactory implements ICarFactory
{

	@Override
	public ICar makeCar() 
	{
		return new Maruti();
		
	}

}
