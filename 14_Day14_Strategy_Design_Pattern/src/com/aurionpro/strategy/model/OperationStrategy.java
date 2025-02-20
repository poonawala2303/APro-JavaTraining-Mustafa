package com.aurionpro.strategy.model;

public class OperationStrategy 
{
	IOperation operation;

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	public void doOperation(int a ,int b)
	{
		operation.doOperation(a, b);
	}
	
}
