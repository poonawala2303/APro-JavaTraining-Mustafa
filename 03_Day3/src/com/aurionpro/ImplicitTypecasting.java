package com.aurionpro;

public class ImplicitTypecasting {
	
	public static void main(String[] args) 
	{
		byte number1 = 100;
		short number2 = number1;
		int number3 = number2;
		long number4 = number3;
		float number5 = number4;
		double number6 = number5;
		
		char ch = 'A';
		int asciiValue = ch;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
		System.out.println(asciiValue);
		
	}
}
