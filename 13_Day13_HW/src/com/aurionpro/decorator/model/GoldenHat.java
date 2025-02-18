package com.aurionpro.decorator.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) 
	{
		super(hat);
	}

	@Override
	public String getName() 
	{
		return hat.getName();
	}

	@Override
	public int getPrice() 
	{
		return hat.getPrice() + 1000;
	}

	@Override
	public String getDescription() 
	{
		return hat.getDescription();
	}

}
