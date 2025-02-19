package com.aurionpro.arrays;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String[] args) 
	{
		Scanner inputVariable = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = inputVariable.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the elements of array one by one\n");

		for (int i = 0; i < array.length; i++) 
		{
			int element = inputVariable.nextInt();
			array[i] = element;
		}

		System.out.println("Array elements are\n");

		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);

		}
		
		int largestElement = array[0];
		int secondLargestElement = array[1];
		
//		Using 2 Loops
		
//		for (int i = 0; i < array.length; i++) 
//		{
//			if(array[i] > largestElement)
//			{
//				largestElement = array[i];
//			}
//		}
//		
//		for (int i = 0; i < array.length; i++) 
//		{
//			if(array[i] > secondLargestElement && array[i]!= largestElement)
//			{
//				secondLargestElement = array[i];
//			}
//		}
		
//		Using single loop
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i] > largestElement)
			{
				secondLargestElement = largestElement;
				largestElement = array[i];
			}
			
			if(array[i] < largestElement && array[i] > secondLargestElement)
			{
				secondLargestElement = array[i];
			}
		}
		
		System.out.println("\nFirst Largest element is: "+largestElement);
		System.out.print("Second Largest element is: "+secondLargestElement);
		
	}
}
