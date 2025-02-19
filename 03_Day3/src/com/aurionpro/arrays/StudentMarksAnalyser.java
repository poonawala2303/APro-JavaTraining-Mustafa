package com.aurionpro.arrays;

import java.util.Scanner;

public class StudentMarksAnalyser {
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
		
		int maxMarksCount = array[0];
		int minMarksCount = array[0];
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) 
		{
			sum += array[i];
			
			if(array[i] > maxMarksCount)
			{
				maxMarksCount = array[i];
			}
			
			if(array[i] < minMarksCount)
			{
				 minMarksCount = array[i];
			}
			
		}
		
		double averageMarks = (double) sum / size;
		
		
		System.out.println("Maximum marks: " + maxMarksCount);
		System.out.println("Minimum marks: " + minMarksCount);
		System.out.println("Average marks: " + averageMarks);
		
	}
}
