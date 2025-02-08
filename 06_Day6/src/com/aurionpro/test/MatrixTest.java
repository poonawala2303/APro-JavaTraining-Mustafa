package com.aurionpro.test;

import java.util.Scanner;

public class MatrixTest {
	public static void main(String[] args) {
		
		int array[][] = createMatrix();
		
		printMatrix(array);
		
		
		
		
	}
	
	private static int[][] createMatrix()
	{
		Scanner inputVariable = new Scanner(System.in);
		
		// Inputs 
		
		int[][] array = new int[3][3];
		
		System.out.println("\n");
		System.out.println("Enter the elements of the array for size "+3+"*"+3);
		
		for (int i = 0; i < array.length; i++) 
		{
			readColumns(array,i,inputVariable);
		}
		
		return array;
	}
	
	private static void readColumns(int[][] array , int i , Scanner inputVariable)
	{
		for (int j = 0; j < array[i].length; j++) {
			System.out.print("Enter element of Row "+i+ " of Matrix 1 and Column "+j+" of Matrix 1: ");
			array[i][j] = inputVariable.nextInt();
		}
	}
	
	private static void printMatrix(int[][] array)
	{
		System.out.println("\nMatrix Output\n");
		for (int i = 0; i < array.length; i++) 
		{
			printColumns(array,i);
		}
	}
	
	private static void printColumns(int[][] array , int i)
	{
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j] + "  ");
		}
		System.out.println("\n");
	}
	
}
