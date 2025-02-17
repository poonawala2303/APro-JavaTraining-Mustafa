package com.aurionpro.model;

public interface Shape 
{
	
	void area();
	
	static void display()
	{
		System.out.println("Displaying shape");
	}
	
	default void show()
	{
		System.out.println("Showing shape");
	}
	
}
