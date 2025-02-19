package com.aurionpro.conditionals;

import java.util.Scanner;

public class NumberGuesserGame {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);

		while (true) {
			System.out
					.println("Welcome to Random number Guessing Game. Please follow the next instructions");
			System.out.println();

			int maxPossibleAttempts = 5;

			// defining range for random number Generation
			int max = 100;
			int min = 1;
			int range = max - min + 1;

			int randomNumber = (int) (Math.random() * range) + min;
//			System.out.println(randomNumber);
			int count = 0;

			for (int i = maxPossibleAttempts; i > 0; i--) {
				System.out.print("Enter a number between 1 to 100: ");
				int userGuess = inputVariable.nextInt();

				if (userGuess == randomNumber) {
					count++;
					System.out.println("You Won !! in " + count + " attempts");
					break;
				} else if (userGuess < randomNumber) {
					System.out.println("Sorry , too low ");
					count++;
				} else {
					System.out.println("Sorry , too high ");
					count++;
				}

			}

			if (count >= 5) {
				System.out.println("Game over !! Attempst exceeded beyond 5");
				System.out.println("The random number was: " + randomNumber);
			}

			System.out.println("Do you want to play the game again? ");
			inputVariable.nextLine();
			String playAgainChoice = inputVariable.nextLine();
			if (!(playAgainChoice.equalsIgnoreCase("Yes"))) {
				break;
			}

		}
		
		System.out.println("Thanks for playing! Goodbye.");
	}
}
