package com.aurionpro.test;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerTest 
{
	public static void main(String[] args) 
	{
		Consumer<Integer> factorialConsumer = (number)->{
			
			int fact = 1 ;
			
			for(int i =1 ;i<= number ; i++)
			{
				fact = fact*i;
			}
			
			System.out.println("Factorial is: " + fact);
			
		};
		
		factorialConsumer.accept(5);
	}
}
