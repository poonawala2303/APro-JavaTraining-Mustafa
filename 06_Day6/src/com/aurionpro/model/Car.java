package com.aurionpro.model;

public class Car extends Vehicle {
	
	private String fuelType;
	private int numSeats;
	
	public Car()
	{
		
	}
	
	public Car(String brand , String model , int speed) {
		super(brand , model , speed);
		this.fuelType = fuelType;
		this.numSeats = numSeats;
	}
	
	public Car(String brand , String model , int speed, String fuelType, int numSeats) {
		super(brand , model , speed);
		this.fuelType = fuelType;
		this.numSeats = numSeats;
	}

	public String getFuelType() {
		return fuelType;
	}

	public int getNumSeats() {
		return numSeats;
	}
	
	public void display() 
	{
		System.out.println("Brand of vehicle: " + getBrand());
		System.out.println("Model of vehicle: " + getModel());
		System.out.println("Speed of vehicle: " + getSpeed());
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("No of Seats: " + numSeats);
	}

	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + ", numSeats=" + numSeats + "]";
	}
	
	
}
