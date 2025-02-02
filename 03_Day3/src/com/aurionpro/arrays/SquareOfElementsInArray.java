package com.aurionpro.arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

public class SquareOfElementsInArray {
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
		
		squareOfElements(array);
		
		System.out.println("The square of Array is: ");
		System.out.print("[ ");
		for (int i =0 ; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
		
	}
	
	static int[] squareOfElements(int[] array)
	{
		Arrays.sort(array);
		
		for (int i =0 ; i<array.length; i++)
		{
			array[i] = array[i]*array[i];
		}
		
		return array;
	}
	
}
