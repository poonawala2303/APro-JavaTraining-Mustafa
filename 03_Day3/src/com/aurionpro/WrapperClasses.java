package com.aurionpro;

public class WrapperClasses {
	public static void main(String[] args) {
		
		// Autoboxing
		
		int number = 100;
		Integer obj1 = number;
		
		System.out.println(obj1);
		
		// ParseInt
		
		int number3 = Integer.parseInt("123");
		System.out.println(number3);
		
		// ToString
		
		String str = Integer.toString(58);
		System.out.println(str);
		
	}
}
