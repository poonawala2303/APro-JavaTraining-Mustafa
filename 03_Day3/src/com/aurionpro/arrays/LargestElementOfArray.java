package com.aurionpro.arrays;

import java.util.Scanner;

public class LargestElementOfArray {
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
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i] > largestElement)
			{
				largestElement = array[i];
			}
		}
		
		System.out.print("The largest element is: " +largestElement);
		
	}
}
