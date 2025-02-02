package com.aurionpro.arrays;

import java.util.Scanner;

public class SubstringInString {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.println("Enter the main String: ");
		String mainString = inputVariable.nextLine();
		
		System.out.println("Enter the substring to match");
		String subStringmatch = inputVariable.nextLine();
		
		boolean answer = isSubstring(mainString,subStringmatch);
		System.out.println("Substring found: " + answer);
		
	}
	
	static boolean isSubstring(String mainString , String subStringmatch)
	{
		
			return mainString.contains(subStringmatch);
	}
	
}
