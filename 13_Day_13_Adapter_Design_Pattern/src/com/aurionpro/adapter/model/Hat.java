package com.aurionpro.adapter.model;

public class Hat
{
	
	private String shortName;
	private String LongName;
	private double price;
	private double tax;

	public Hat(String shortName, String longName, double price, double tax) 
	{
		this.shortName = shortName;
		this.LongName = longName;
		this.price = price;
		this.tax = tax;
	}

	public String getShortName() {
		return shortName;
	}

	public String getLongName() {
		return LongName;
	}

	public double getPrice() {
		return price;
	}

	public double getTax() {
		return tax;
	}

//	public String displayName() {
//		return shortName+ " " +LongName;
//
//	}
//
//	@Override
//	public double displayFinalPrice() {
//		return price+tax;
//
//	}
	

}
