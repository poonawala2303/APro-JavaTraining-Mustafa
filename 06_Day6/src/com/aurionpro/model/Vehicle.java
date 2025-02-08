package com.aurionpro.model;

public class Vehicle {
	
	private String brand;
	private String model;
	private int speed;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(String brand, String model, int speed) {
//		super();
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void accelerate() 
	{
		System.out.println("Vehicle class method accelerate");
	}
	
	public void brake() 
	{
		System.out.println("Vehicle class method brake");
	}
	
	public void display() 
	{
		System.out.println("Brand of vehicle: " + brand);
		System.out.println("Model of vehicle: " + model);
		System.out.println("Speed of vehicle: " + speed);
	}
	
}
