package com.aurionpro.factory.solution.model;

public class TataFactory implements ICarFactory
{

	@Override
	public ICar makeCar() 
	{
		return new Tata();
	}

}
