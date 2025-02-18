package com.aurionpro.adapter.model;

public class HatAdapter implements Iitem
{
	
	Hat hat;
	
	public HatAdapter(String shortName, String longName, double price, double tax) 
	{
		hat = new Hat(shortName,longName,price,tax);
	}

	@Override
	public String displayName() 
	{
		return hat.getShortName() + " " + hat.getLongName();
	}

	@Override
	public double displayFinalPrice() 
	{
		return hat.getPrice() + hat.getTax();
	}

}
