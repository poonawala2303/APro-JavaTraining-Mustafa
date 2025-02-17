package com.aurionpro.test;

import java.util.function.BiConsumer;

public class BiConsumerTest 
{
	public static void main(String[] args) 
	{
		BiConsumer<Integer,Integer> additionConsumer = (number1,number2)->{
			
			int sum =number1+number2;
			
			System.out.println("Sum is: " + sum);
			
		};
		
		additionConsumer.accept(2,5);
	}
}
