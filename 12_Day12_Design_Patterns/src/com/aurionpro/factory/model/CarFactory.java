package com.aurionpro.factory.model;

public class CarFactory 
{
	public Icar makeCars(CarType car)
	{
		
		if(car == CarType.Mahindra)
		{
			return new Mahindra();
		}
		
		if(car == CarType.Maruti)
		{
			return new Maruti();
		}
		
		if(car == CarType.Tata)
		{
			return new Tata();
		}
		
		return null;
	}
}
