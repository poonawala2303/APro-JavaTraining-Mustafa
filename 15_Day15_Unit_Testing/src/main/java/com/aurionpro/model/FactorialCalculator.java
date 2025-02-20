package com.aurionpro.model;

public class FactorialCalculator 
{
	public static int factorial(int a)
	{
		int output = 0;
		for(int i=1 ; i<=a ; i++)
		{
			output +=  a*a-i;
		}
		System.out.println(output);
		return output;
	}
	
	public static void main(String[] args) {
		factorial(5);
	}
}
