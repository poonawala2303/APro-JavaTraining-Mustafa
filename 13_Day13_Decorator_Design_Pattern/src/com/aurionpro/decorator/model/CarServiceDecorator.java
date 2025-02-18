package com.aurionpro.decorator.model;

public abstract class CarServiceDecorator implements ICarService 
{
	ICarService carObj;

	public CarServiceDecorator(ICarService carObj) 
	{
		this.carObj = carObj;
	}
	
	
}
