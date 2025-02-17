package com.aurionpro.model;

public class Bike implements Vehicle
{

	public void start() {
		
		System.out.println("Inside start function of Bike");
		
	}

	public void stop() {
		
		System.out.println("Inside stop function of Bike");
		
	}

	public String fuelType() {
	
		return "Petrol";
		
	}

}
