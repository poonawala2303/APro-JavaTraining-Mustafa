package com.aurionpro.conditionals;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThird {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int number1 = input.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = input.nextInt();

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		

		System.out.println("After Swapping : ");
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);
	}
}
