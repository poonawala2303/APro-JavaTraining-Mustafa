package com.aurionpro.model;

public class ElectricCar extends Car{
	
	private int batteryCapacity;
	private double chargingTime;
	
	public ElectricCar()
	{
		
	}
	
	public ElectricCar(String brand , String model , int speed , int batteryCapacity, double chargingTime) {
		super(brand,model,speed);
		this.batteryCapacity = batteryCapacity;
		this.chargingTime = chargingTime;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public double getChargingTime() {
		return chargingTime;
	}
	
	public void display() 
	{
		System.out.println("Brand of vehicle: " + getBrand());
		System.out.println("Model of vehicle: " + getModel());
		System.out.println("Speed of vehicle: " + getSpeed());
		System.out.println("No of Seats: " + getNumSeats());
		System.out.println("Battery Capacity: " + batteryCapacity);
		System.out.println("Charging Time: " + chargingTime);
	}

	@Override
	public String toString() {
		return "ElectricCar [batteryCapacity=" + batteryCapacity + ", chargingTime=" + chargingTime + "]";
	}
	
	
}
