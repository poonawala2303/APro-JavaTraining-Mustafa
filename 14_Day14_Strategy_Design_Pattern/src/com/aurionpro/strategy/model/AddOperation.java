package com.aurionpro.strategy.model;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) 
	{
		System.out.println("Chosen Operation is addition. Output is: " + (a+b));
		return a+b;
	}

}
