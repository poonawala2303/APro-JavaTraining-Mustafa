package com.aurionpro.arrays;

import java.util.Scanner;

public class SubstringInString {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.println("Enter the main String: ");
		String mainString = inputVariable.nextLine();
		
		System.out.println("Enter the substring to match");
		String subString = inputVariable.nextLine();
		
		if (mainString.indexOf(subString) != 1)
		{
			System.out.println("Substring found at index " + mainString.indexOf(subString));
		}
	}
}
