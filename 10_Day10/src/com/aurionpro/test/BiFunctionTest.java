package com.aurionpro.test;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionTest 
{
	public static void main(String[] args) 
	{
		BiFunction<Integer,Integer,Integer> multiplyFunction = (num1 , num2)-> num1*num2; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter num2: ");
		int num2 = input.nextInt();
		
		System.out.println("Multiplication: " + multiplyFunction.apply(num1,num2));
	}
}
