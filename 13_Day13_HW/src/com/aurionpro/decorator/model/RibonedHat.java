package com.aurionpro.decorator.model;

public class RibonedHat extends HatDecorator {

	public RibonedHat(IHat hat) 
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
		return hat.getPrice() + 500;
	}

	@Override
	public String getDescription() 
	{
		return hat.getDescription();
	}

}
