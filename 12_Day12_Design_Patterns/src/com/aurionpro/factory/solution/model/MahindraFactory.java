package com.aurionpro.factory.solution.model;

public class MahindraFactory implements ICarFactory
{

	@Override
	public ICar makeCar() {
		return new Mahindra();
		
	}

}
