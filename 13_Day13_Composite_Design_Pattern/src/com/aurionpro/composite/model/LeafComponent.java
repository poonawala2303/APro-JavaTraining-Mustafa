package com.aurionpro.composite.model;

public class LeafComponent implements IComponent
{
	
	String name;
	int price;

	public LeafComponent() 
	{
		
	}
	
	public LeafComponent(String name, int price) 
	{
		super();
		this.name = name;
		this.price = price;
	}



	@Override
	public void showPrice() 
	{
		System.out.println("Price is: " + this.price);
	}
	
}
