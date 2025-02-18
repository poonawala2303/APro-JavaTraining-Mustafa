package com.aurionpro.prototype.test;

import com.aurionpro.prototype.model.Car;

public class CarMain {
    public static void main(String[] args) 
    {
        Car originalCar = new Car("SportsCar", "V8 Turbo", 2);
        System.out.println("Original Car Details:");
        originalCar.showDetails();

        Car clonedCar = (Car) originalCar.cloneCar();
        System.out.println("\nCloned Car Details:");
        clonedCar.showDetails();
    }
}
