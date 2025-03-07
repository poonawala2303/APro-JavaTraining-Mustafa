package com.aurionpro.loops;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		int number = inputVariable.nextInt();
		
		int remainder = 0;
		int newNumber = 0;
		
		while(number > 0){
			remainder = number % 10;
			newNumber += remainder;
			number /= 10;
		}
		
		System.out.println(newNumber);
	}
}
