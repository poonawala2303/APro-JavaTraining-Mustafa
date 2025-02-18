package com.aurionpro.builder.test;

import com.aurionpro.builder.model.Car;
import com.aurionpro.builder.model.CarBuilder;
import com.aurionpro.builder.model.CarDirector;
import com.aurionpro.builder.model.SportsCarBuilder;

public class CarMain {
    public static void main(String[] args) 
    {
        CarBuilder builder = new SportsCarBuilder();
        CarDirector director = new CarDirector(builder);

        Car sportsCar = director.constructSportsCar();
        sportsCar.showSpecifications();
    }
}
