package com.aurionpro.test;

public class EvenOddTest {
	public static void main(String[] args) {
		int number = 5;
		
		evenOddNumberChecker(number);
	}
	
	
	public static void evenOddNumberChecker(int number)
	{
		if(number%2==0)
		{
			System.out.println("Even");
			System.exit(0);
		}
		System.out.println("Odd");
	}
}
