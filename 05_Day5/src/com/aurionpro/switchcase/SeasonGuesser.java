package com.aurionpro.switchcase;

import java.util.Scanner;

public class SeasonGuesser {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.println("Enter a month number to check Season");
		int choice = inputVariable.nextInt();
		
		switch (choice) 
		{
			
			case 1:
			case 2:
			case 3:
				System.out.println("Winter");
				break;
			
			case 4:
			case 5:
			case 6:
				System.out.println("Summer");
				break;
			
			case 7:
			case 8:
			case 9:
				System.out.println("Monsoon");
				break;
			
			case 10:
			case 11:
			case 12:
				System.out.println("Autumn");
				break;
			
			default:
				System.out.println("Enter a valid month number");
				
		}
		
	}
}
