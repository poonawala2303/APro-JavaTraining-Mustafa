package com.aurionpro.conditionals;

import java.util.Scanner;

public class RideBillCalculator {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.print("Enter your height in cms: ");
		int height = inputVariable.nextInt();
		
		if(height > 120)
		{
			System.out.println("Can ride");
			
			System.out.print("Enter age: ");
			int age = inputVariable.nextInt();
			int rideCost = 0;
			
			if(age < 12)
			{
				rideCost += 5;
			}
			
			if(age>12 && age<18)
			{
				rideCost += 7;
			}
			
			if(age>18)
			{
				if(age>45 && age<55)
				{
					rideCost = 0;
				}
				else
				{
					rideCost += 12;
				}
				
			}
			
			
			
			System.out.print("Want Photos ?? ");
			inputVariable.nextLine();
			String wantPhotosChoice = inputVariable.nextLine();
			
			
			if(wantPhotosChoice.equalsIgnoreCase("Yes")){
				int totalCost = 3;
				rideCost += totalCost;
				System.out.print("Total Bill is: $" + rideCost);
			}
			
			else{
				System.out.print("Total Bill is: $" + rideCost);
			}
			
		}
		
		else
		{
			System.out.println("Can't ride");
		}
		
	}
}
