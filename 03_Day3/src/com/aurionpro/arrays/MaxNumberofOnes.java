package com.aurionpro.arrays;

import java.util.Scanner;

public class MaxNumberofOnes {
	public static void main(String[] args) {
		
		Scanner inputVariable = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = inputVariable.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the elements of the array one by one\n");

		for (int i = 0; i < array.length; i++) 
		{
			array[i] = inputVariable.nextInt();
		}
		
		int maxCount = 0;
		int currentCount = 0;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i] == 1)
			{
				currentCount++;
				if(currentCount > maxCount)
				{
					maxCount = currentCount;
				}
			}
			else
			{
				currentCount=0;
			}
		}
		
		System.out.println("Maximum number of consecutive 1's is: " + maxCount);
		
	}
}
