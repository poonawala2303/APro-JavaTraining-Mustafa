package com.aurionpro.loops;

import java.util.Scanner;

public class LetsPlayPIG {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);

		int totalTurnScore = 0;
		int numberOfTurns = 1;

		System.out.println("Welcome to PIG Game");
		
		while (totalTurnScore < 20) 
		{
			
			
			int individualTurnScore = 0;
			System.out.println("\nTURN - " + numberOfTurns);

			while (true) 
			{
				System.out.print("\nRoll or Hold (r/h) ? ");
				String choice = inputVariable.nextLine();

				if (choice.equalsIgnoreCase("h")) 
				{
					break;
				}

				int max = 6;
				int min = 1;
				int range = max - min + 1;

				int dieNumber = (int) (Math.random() * range) + min;
				System.out.println("The number on the Die is: " + dieNumber);

				if (dieNumber == 1) 
				{
					individualTurnScore = 0;
					System.out.println("\nTurn over. No score for the turn as the number on the Die was 1. Keep Trying !!");
					break;
				}

				individualTurnScore += dieNumber;
				

			}
			numberOfTurns++;
			totalTurnScore += individualTurnScore;
			System.out.println("Total Score: " + totalTurnScore + "\n");
			
		}
		System.out.println("You finished in " + (numberOfTurns - 1) + " turns");
	}
}
