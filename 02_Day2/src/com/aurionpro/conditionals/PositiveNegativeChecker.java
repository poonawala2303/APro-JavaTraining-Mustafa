package com.aurionpro.conditionals;

import java.util.Scanner;

public class PositiveNegativeChecker {
	
	static void checkPositiveNegative(int number){
		if(number > 0){
			System.out.println("Number is Positive");
		}
		
		else if (number < 0){
			System.out.println("Number is Negative");
		}
		else{
			System.out.println("Neither positive nor negative");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether its negative or positive: ");
		int number = input.nextInt();
		
		checkPositiveNegative(number);
	}
}
