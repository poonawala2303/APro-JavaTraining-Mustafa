package com.aurionpro.arrays;

import java.util.Scanner;

public class ShiftCharactersInString {
	public static void main(String[] args) {
		
		Scanner inputVariable = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = inputVariable.nextInt();

		String[] array = new String[size];

		System.out.println("Enter the elements of the array one by one\n");

		for (int i = 0; i < array.length; i++) 
		{
			array[i] = inputVariable.nextLine();
		}
		
		
	}
}
