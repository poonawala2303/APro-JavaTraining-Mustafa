package com.aurionpro.model;

public class Operations 
{
	public int addition(int a , int b)
	{
		return a+b;
	}
	public int subtraction(int a , int b)
	{
		return a-b;
	}
	public int multiplicarion(int a , int b)
	{
		return a*b;
	}
	public int division(int a , int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		return a/b;
	}
	
	public boolean isEven(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		
		return false;
	}
}
