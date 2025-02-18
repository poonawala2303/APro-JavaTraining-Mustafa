package com.aurionpro.builder.model;

public class Car 
{
	private String engine;
	private int seats;
	private boolean sunroof;

	public Car(String engine, int seats, boolean sunroof) 
	{
		this.engine = engine;
		this.seats = seats;
		this.sunroof = sunroof;
	}

	public void showSpecifications() {
		System.out.println("Car Specifications:");
		System.out.println("Engine: " + engine);
		System.out.println("Seats: " + seats);
		System.out.println("Sunroof: " + sunroof);
	}
}
