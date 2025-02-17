package com.aurionpro.test;

import java.util.function.BiPredicate;

public class BiPredicateTest 
{
	public static void main(String[] args) 
	{
		BiPredicate<Integer,Integer> numberCompare = (number1 , number2)-> {
			
			if(number1 == number2)
			{
				return true;
			}
			
			else 
			{
				return false;
			}
			
		};
		
		System.out.println("Numbers equal ?: " + numberCompare.test(2,2));
	}
}
