package com.aurionpro;

import java.util.Scanner;

public class CalculatorwithInput {

	public static double sum(double number1, double number2) {
		return number1 + number2;
	}

	public static double difference(double number1, double number2) {
		return number1 - number2;
	}

	public static double product(double number1, double number2) {
		return number1 * number2;
	}

	public static double division(double number1, double number2) {
		return number1 / number2;
	}

	public static void main(String[] args) {
		
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		double number1 = inputVariable.nextDouble();
		
		System.out.println("Enter number 2: ");
		double number2 = inputVariable.nextDouble();
		
		System.out.println("Addition of " + number1 + " and " + number2 + " is " + sum(number1, number2));
		System.out.println("Difference of " + number1 + " and " + number2 + " is " + difference(number1, number2));
		System.out.println("Product of " + number1 + " and " + number2 + " is " + product(number1, number2));
		System.out.println("Division of " + number1 + " and " + number2 + " is " + division(number1, number2));
	}

}
