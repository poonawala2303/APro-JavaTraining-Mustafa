package com.aurionpro.test;

import com.aurionpro.model.Car;
import com.aurionpro.model.ElectricCar;
import com.aurionpro.model.Vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Toyota" , "Toyota 2025" , 300);
		vehicle1.display();
		vehicle1.accelerate();
		
		Car car1 = new Car("Toyota" , "Toyota 2025" , 300 , "Petrol" , 7);
		car1.display();
		
		ElectricCar electricCar1 = new ElectricCar("Toyota" , "Toyota 2025" , 300 , 50000 , 4.5);
		electricCar1.display();
		
	
	}
}
