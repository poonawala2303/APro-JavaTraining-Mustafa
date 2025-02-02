package com.aurionpro.twodimensionalarrays;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		int row,column;
		
		System.out.print("Enter the number of rows: ");
		row = inputVariable.nextInt();
		
		System.out.print("Enter the number of columns: ");
		column = inputVariable.nextInt();
		
		int[][] array = new int[row][column];
		
		System.out.println("Enter the elements of the array for size "+row+"*"+column);
		
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Enter element of Row "+i+ " and Column "+j+": ");
				array[i][j] = inputVariable.nextInt();
			}
		}
		
		System.out.println("");
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println("\n");
		}
		
		
	}
}
