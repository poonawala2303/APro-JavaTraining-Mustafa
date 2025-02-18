package com.aurionpro.decorator.model;

public class PremiumHat implements IHat {

	@Override
	public String getName() 
	{
		return "Jack&Jones";
	}

	@Override
	public int getPrice() 
	{
		return 5000;
	}

	@Override
	public String getDescription() 
	{
		return "Premium Jack&Jones Hat made from exclusive material";
	}

}
