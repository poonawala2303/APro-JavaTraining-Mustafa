package com.aurionpro.test;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	
		Function<Integer,Integer> functionSquare = (number)-> number*number;
		
		System.out.print("Enter number: ");
		int number = input .nextInt();
		System.out.println("Square : " + functionSquare.apply(number));
	}
}
