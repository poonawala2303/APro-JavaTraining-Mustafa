package com.aurionpro.decorator.model;

public class StandardHat implements IHat {

	@Override
	public String getName() 
	{
		return "Adidas";
	}

	@Override
	public int getPrice() 
	{
		return 2500;
	}

	@Override
	public String getDescription() 
	{
		return "Standard Hat made of Cotton";
	}

}
