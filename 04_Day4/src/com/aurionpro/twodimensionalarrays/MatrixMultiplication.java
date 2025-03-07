package com.aurionpro.twodimensionalarrays;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		
		Scanner inputVariable = new Scanner(System.in);
		
		int rowofMatrix1,columnofMatrix1;
		int rowofMatrix2,columnofMatrix2;
		
		// Inputs for Matrix 1 
		
		System.out.print("Enter the number of rows of Matrix 1: ");
		rowofMatrix1 = inputVariable.nextInt();
		
		System.out.print("Enter the number of columns of Matrix 1: ");
		columnofMatrix1 = inputVariable.nextInt();
		
		int[][] array = new int[rowofMatrix1][columnofMatrix1];
		
		System.out.println("\nEnter the elements of the array for size "+rowofMatrix1+"*"+columnofMatrix1);
		
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Enter element of Row "+i+ " of Matrix 1 and Column "+j+" of Matrix 1: ");
				array[i][j] = inputVariable.nextInt();
			}
		}
		
		// Inputs for Matrix 2 
		
		System.out.print("\nEnter the number of rows of Matrix 2: ");
		rowofMatrix2 = inputVariable.nextInt();
		
		System.out.print("Enter the number of columns of Matrix 2: ");
		columnofMatrix2 = inputVariable.nextInt();
		
		int[][] array2 = new int[rowofMatrix2][columnofMatrix2];
		
		System.out.println("\nEnter the elements of the array for size "+rowofMatrix2+"*"+columnofMatrix2);
		
		for (int i = 0; i < array2.length; i++) 
		{
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print("Enter element of Row "+i+ " of Matrix 2 and Column "+j+" of Matrix 2: ");
				array2[i][j] = inputVariable.nextInt();
			}
		}
		
		// Outputs
		
		System.out.println("Matrix 1: \n");
		
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Matrix 2: \n");
		
		for (int k = 0; k < array2.length; k++) 
		{
			for (int l = 0; l < array2[k].length; l++) {
				System.out.print(array2[k][l] + "  ");
			}
			System.out.println("\n");
		}
		
		int[][] multMatrixChoice3 = new int[rowofMatrix1][columnofMatrix2];
		
		if(columnofMatrix1 == rowofMatrix2)
		{
			
			for (int i = 0; i < rowofMatrix1; i++) 
	        {
	            for (int j = 0; j < columnofMatrix2; j++) 
	            {
	                for (int k = 0; k < columnofMatrix1; k++) 
	                {
	                    multMatrixChoice3[i][j] += array[i][k] * array2[k][j];
	                }
	            }
	        }
			
			System.out.println("\nMatrix multiplication Output\n");
			
			for (int i = 0; i < multMatrixChoice3.length; i++) 
			{
				for (int j = 0; j < multMatrixChoice3[i].length; j++) {
					System.out.print(multMatrixChoice3[i][j] + "  ");
				}
				System.out.println("\n");
			}
		}
		
		else
		{
			System.out.println("Matrix Multiplication not possible since number of columns of matrix 2 and number of rows of matrix 1 dont match");
		}
		
	}
}
