package com.aurionpro.loops;

import java.util.Scanner;

public class NumberReversal {
	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		
		int number = inputNumber.nextInt();
		
		System.out.println("Original Number: " + number);
		
		int remainder = 0;
		int newNumber = 0;
		
		while (number > 0){
			remainder = number % 10;
			newNumber = newNumber*10 + remainder;
			number /= 10;
		}
		
		System.out.println("Reversed Number: " + newNumber);
	}
}
