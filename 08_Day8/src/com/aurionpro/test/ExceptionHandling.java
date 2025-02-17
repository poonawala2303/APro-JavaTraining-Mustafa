package com.aurionpro.test;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) 
	{
		
		try
		{
		
		Scanner scanner = new Scanner(System.in);
				
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		double c = a/b;
		
		System.out.println("Division of the above numbers is: " + c);
		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Program expects at least 2 arguments");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Enter Numbers only");
		}
		
		catch(Exception e)
		{
			System.out.println("Unexpected Error occured: " + e);
		}
		
		finally
		{
			System.out.println();
		}
		
	}
}
