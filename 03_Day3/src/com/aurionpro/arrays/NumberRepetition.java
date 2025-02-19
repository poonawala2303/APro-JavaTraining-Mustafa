package com.aurionpro.arrays;

import java.util.Scanner;

public class NumberRepetition {
	
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

		
		boolean[] visited = new boolean[size]; 
		System.out.println("Repeated elements and their counts:");

		for (int i = 0; i < array.length; i++) 
		{
			if (!visited[i]) 
			{
				int count = 1; 
				for (int j = i + 1; j < array.length; j++) 
				{
					if (array[i] == array[j]) 
					{
						count++;
						visited[j] = true;
					}
				}
				
				if (count > 1) 
				{
					System.out.println("Element: " + array[i] + " Count: "+ count);
				}
			}
		}
	}
}
