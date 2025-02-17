package com.aurionpro.model;

public class Car implements Vehicle
{

	private String fuel;
	
	public Car(String fuel) 
	{
		this.fuel = fuel;
	}

	public void start() {
		
		System.out.println("Inside start function of Car");
		
	}

	public void stop() {
		
		System.out.println("Inside stop function of Car");
		
	}

	public String fuelType() {
		
		return fuel;
		
	}
	
}
