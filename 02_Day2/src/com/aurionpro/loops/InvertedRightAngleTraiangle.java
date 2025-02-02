package com.aurionpro.loops;

import java.util.Scanner;

public class InvertedRightAngleTraiangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int numOfRows = sc.nextInt();
		
		for (int i = numOfRows ; i > 0 ; i--)
		{
			for (int j = 1 ; j<=i ; j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
