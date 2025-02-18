package com.aurionpro.builder.model;

public class SportsCarBuilder implements CarBuilder 
{
    private String engine;
    private int seats;
    private boolean sunroof;

    @Override
    public CarBuilder setEngine(String engine) 
    {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) 
    {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setSunroof(boolean sunroof) 
    {
        this.sunroof = sunroof;
        return this;
    }

    @Override
    public Car build() 
    {
        return new Car(engine, seats, sunroof);
    }
}
