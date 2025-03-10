package com.aurionpro.twodimensionalarrays;

import java.util.Scanner;

public class MatrixCalculator 
{
	public static void main(String[] args) 
	{
		Scanner inputVariable = new Scanner(System.in);
		
		int rowofMatrix1,columnofMatrix1;
		int rowofMatrix2,columnofMatrix2;
		
		// Inputs for Matrix 1 
		
		System.out.print("Enter the number of rows of Matrix 1: ");
		rowofMatrix1 = inputVariable.nextInt();
		
		System.out.print("Enter the number of columns of Matrix 1: ");
		columnofMatrix1 = inputVariable.nextInt();
		
		int[][] array = new int[rowofMatrix1][columnofMatrix1];
		
		System.out.println("\n");
		System.out.println("Enter the elements of the array for size "+rowofMatrix1+"*"+columnofMatrix1);
		
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
		
		System.out.println("");
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println("\n");
		}
		
		System.out.println("");
		for (int k = 0; k < array2.length; k++) 
		{
			for (int l = 0; l < array2[k].length; l++) {
				System.out.print(array2[k][l] + "  ");
			}
			System.out.println("\n");
		}
		
		
		
		// Menu Driven Code
		
		System.out.println("Welcome to Matrix Calculator");
		System.out.println("Choose 1 for Matrix Addition");
		System.out.println("Choose 2 for Matrix Subtraction");
		System.out.println("Choose 3 for Matrix Multiplication");
		System.out.println("Choose 4 for Matrix Transpose");
		
		int choice = inputVariable.nextInt();
		
		if(choice == 1)
		{
			int[][] addMatrixChoice1 = new int[rowofMatrix1][columnofMatrix1];
			
			if(rowofMatrix1 == rowofMatrix2 && columnofMatrix1 == columnofMatrix2)
			{
				for (int i = 0; i < addMatrixChoice1.length; i++) 
				{
					for (int j = 0; j < addMatrixChoice1[i].length; j++) {
						addMatrixChoice1[i][j] = array[i][j] + array2[i][j];
					}
				}
				
				System.out.println("Matrix addition Output");
				
				for (int i = 0; i < addMatrixChoice1.length; i++) 
				{
					for (int j = 0; j < addMatrixChoice1[i].length; j++) {
						System.out.print(addMatrixChoice1[i][j] + "  ");
					}
					System.out.println("\n");
				}
				
			}
			
			else
			{
				System.out.println("GoodBye");
			}
		}
		
		if(choice == 2)
		{
			int[][] subMatrixChoice2 = new int[rowofMatrix1][columnofMatrix1];
			
			if(rowofMatrix1 == rowofMatrix2 && columnofMatrix1 == columnofMatrix2)
			{
				for (int i = 0; i < subMatrixChoice2.length; i++) 
				{
					for (int j = 0; j < subMatrixChoice2[i].length; j++) {
						subMatrixChoice2[i][j] = array[i][j] - array2[i][j];
					}
				}
				
				System.out.println("\nMatrix subtraction Output\n");
				
				for (int i = 0; i < subMatrixChoice2.length; i++) 
				{
					for (int j = 0; j < subMatrixChoice2[i].length; j++) {
						System.out.print(subMatrixChoice2[i][j] + "  ");
					}
					System.out.println("\n");
				}
				
			}
			
			else
			{
				System.out.println("GoodBye");
			}
		}
		
		if(choice == 3)
		{
			
			int[][] multMatrixChoice3 = new int[rowofMatrix1][columnofMatrix2];
			
			if(columnofMatrix1 == rowofMatrix2)
			{
				
//				for (int i = 0; i < multMatrixChoice3.length; i++) 
//				{
//					for (int j = 0; j <= multMatrixChoice3[i].length; j++) {
//						multMatrixChoice3[i][0] += array[i][j] * array2[j][i];
//					}
//				}
				
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
				System.out.println("GoodBye");
			}
			
		}
		
		if(choice == 4)
		{
			System.out.println("Which Matrix Transose do you want? ");
			inputVariable.nextLine();
			String transposeChoice = inputVariable.nextLine();
			
			if(transposeChoice.equalsIgnoreCase("A"))
			{
				int[][] transposeMatrix = new int[columnofMatrix1][rowofMatrix1];
				
				for (int i = 0; i < transposeMatrix.length; i++) 
				{
					for (int j = 0; j < transposeMatrix[i].length; j++) {
						transposeMatrix[i][j] = array[j][i];
					}
					
				}
				
				System.out.println("\nMatrix Transpose Output\n");
				
				for (int i = 0; i < transposeMatrix.length; i++) 
				{
					for (int j = 0; j < transposeMatrix[i].length; j++) {
						System.out.print(transposeMatrix[i][j] + "  ");
					}
					System.out.println("\n");
				}
				
			}
			
			else
			{
				System.out.println("GoodBye");
			}
		}
		
	}
}
