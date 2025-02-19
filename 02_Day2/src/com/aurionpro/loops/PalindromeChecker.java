package com.aurionpro.loops;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked");
		int originalNumber = inputVariable.nextInt();
		int temp = originalNumber;
		
		int remainder = 0;
		int newNumber = 0;
		
		while (originalNumber > 0){
			remainder = originalNumber % 10;
			newNumber = newNumber*10 + remainder;
			originalNumber /= 10;
		}
		
		if(temp == newNumber){
			System.out.println("Numbers are Palindrome");
		}
		else{
			System.out.println("Numbers are not Palindrome");
		}
	}
}
