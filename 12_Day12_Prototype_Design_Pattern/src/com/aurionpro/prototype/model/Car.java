package com.aurionpro.prototype.model;

public class Car implements CarPrototype 
{
    private String model;
    private String engine;
    private int seats;

    public Car(String model, String engine, int seats) 
    {
        this.model = model;
        this.engine = engine;
        this.seats = seats;
    }

    // Copy Constructor (Deep Copy)
    public Car(Car car) 
    {
        this.model = car.model;
        this.engine = car.engine;
        this.seats = car.seats;
    }

    @Override
    public CarPrototype cloneCar() {
        return new Car(this); // Cloning using copy constructor
    }

    public void showDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Seats: " + seats);
    }
}
