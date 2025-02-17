package com.aurionpro.test;

import java.util.function.Predicate;

public class PredicateTest 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> evenCheck = (number)-> {
			if(number%2 == 0)
			{
				return true;
			}
			
			else
			{
				return false;
			}
		};
		
		System.out.println("Even ?: " + evenCheck.test(4));
	}
}
