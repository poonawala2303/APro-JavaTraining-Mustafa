package com.aurionpro.builder.model;

public class CarDirector 
{
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) 
    {
        this.builder = builder;
    }

    public Car constructSportsCar() 
    {
        return builder.setEngine("V8 Turbo")
                      .setSeats(2)
                      .setSunroof(true)
                      .build();
    }
}
