package com.aurionpro.loops;

import java.util.Scanner;

public class ArmstrongNumberChecker {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether armstrong or not: ");
		int originalNumber = inputVariable.nextInt();
		
		int temp = originalNumber;
		int remainder = 0;
		int sum = 0;
		int newNumber = 0;
		
		while (originalNumber > 0){
			remainder = originalNumber % 10;
			newNumber = (int)Math.pow(remainder , 3);
			sum += newNumber;
			originalNumber /= 10;
		}
		
		if (temp == sum){
			System.out.println(temp + " is an Armstrong number");
		}
		
	}
}
