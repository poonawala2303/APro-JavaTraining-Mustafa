package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Car;
import com.aurionpro.model.Vehicle;

public class VehicleTest 
{
	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[3];
		
		vehicles[0] = new Car("Petrol");
		vehicles[1] = new Car("Diesel");
		vehicles[2] = new Bike();
		
		for (Vehicle v : vehicles)
		{
			v.start();
			System.out.println("Fuel Type: " + v.fuelType());
			v.stop();
			
			System.out.println("----------------------------------");
		}
		
	}
}
