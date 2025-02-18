package com.aurionpro.builder.model;

public interface CarBuilder 
{
	 	CarBuilder setEngine(String engine);
	    CarBuilder setSeats(int seats);
	    CarBuilder setSunroof(boolean sunroof);
	    Car build();
}
