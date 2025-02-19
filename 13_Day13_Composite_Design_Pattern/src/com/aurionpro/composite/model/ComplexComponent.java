package com.aurionpro.composite.model;

import java.util.ArrayList;

public class ComplexComponent implements IComponent
{

	String name;
	
	ArrayList<IComponent> components;
	
	public ComplexComponent() 
	{
		
	}
	
	public ComplexComponent(String name) 
	{
		this.name = name;
		components = new ArrayList<>();
	}



	@Override
	public void showPrice() 
	{
		for (IComponent c : components)
		{
			c.showPrice();
	    }
	}
	
	public void add(IComponent subComponent)
    {
        components.add(subComponent);
    }

}
