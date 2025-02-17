package com.aurionpro.test;

import com.aurionpro.model.Factorial;

public class FactorialTest 
{
	public static void main(String[] args) 
	{
		Factorial fact = ()-> {
			int number = 5;
			int factSum = 1;
			
			for(int i = 1; i<=number; i++)
			{
				 factSum = factSum*i;
			}
			
			System.out.println("Factorial of 5 is: " + factSum);
			
		};
		
		fact.factorialNumber();
	}
}
