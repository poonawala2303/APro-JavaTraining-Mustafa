package com.aurionpro.adapter.model;

public class Biscuit implements Iitem 
{

	private String name;
	private double mrp;

	public Biscuit(String name, double mrp) 
	{
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String displayName() 
	{
		return name;

	}

	@Override
	public double displayFinalPrice() 
	{
		return mrp;
	}

}
