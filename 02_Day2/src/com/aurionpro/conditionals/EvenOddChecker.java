package com.aurionpro.conditionals;

import java.util.Scanner;

public class EvenOddChecker {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int number1 = inputVariable.nextInt();
		
		if (number1 % 2 == 0){
			System.out.println("Number is even");
		}
		
		else{
			System.out.println("Number is odd");
		}
		
	}
}
