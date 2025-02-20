package com.aurionpro.strategy.model;

public class MultiplyOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) 
	{
		System.out.println("Chosen Operation is multiplication. Output is: " + a*b);
		return a*b;
	}

}
