package com.aurionpro.conditionals;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	static void swap(int number1 , int number2){
		
		int temp = 0;
		
		temp = number1;
		number1 = number2;
		number2 = temp;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int number1 = input.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = input.nextInt();
		
		System.out.println("Before Swapping : ");
		System.out.println("Number 1: "+number1);
		System.out.println("Number 2: "+number2);
		
//		int temp = 0;
//		
//		temp = number1;
//		number1 = number2;
//		number2 = temp;
		
		swap(number1,number2);
		
		System.out.println("After Swapping : ");
		System.out.println("Number 1: "+number1);
		System.out.println("Number 2: "+number2);
		
	}
	
}
