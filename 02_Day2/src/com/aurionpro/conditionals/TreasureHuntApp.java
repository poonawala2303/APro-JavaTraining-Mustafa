package com.aurionpro.conditionals;

import java.util.Scanner;

public class TreasureHuntApp {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.println("Welcome to Treasure Island. Your mission is to find the treasure");
		
		System.out.print("Left OR Right ? ");
		String directionChoice = inputVariable.nextLine(); 
		
		if(directionChoice.equalsIgnoreCase("Left"))
		{
			System.out.print("Swim OR Wait ?? ");
			String swimOrWaitChoice = inputVariable.nextLine();
			
			if(swimOrWaitChoice.equalsIgnoreCase("Swim"))
			{
				System.out.println("Attakced by trout. Game Over");
			}
			
			else if (swimOrWaitChoice.equalsIgnoreCase("Wait"))
			{
				
				System.out.print("Enter the Door Choice (Red , Yellow , Blue): ");
				String doorChoice = inputVariable.nextLine();
				
				if(doorChoice.equalsIgnoreCase("Red"))
				{
					System.out.println("Burned by fire. Game over");
				}
				
				else if(doorChoice.equalsIgnoreCase("Blue"))
				{
					System.out.println("Eaten by Beasts. Game over");
				}
				
				else if(doorChoice.equalsIgnoreCase("Yellow"))
				{
					System.out.println("Congratulations !! You WIN !!!1");
				}
				
				else
				{
					System.out.println("Game over");
				}
			}
		}
		
		else
		{
			System.out.println("Fall into a hole. Game Over");
		}
		
	}
}
