package com.aurionpro.decorator.test;

import java.util.Scanner;

import com.aurionpro.decorator.model.GoldenHat;
import com.aurionpro.decorator.model.IHat;
import com.aurionpro.decorator.model.PremiumHat;
import com.aurionpro.decorator.model.RibonedHat;
import com.aurionpro.decorator.model.StandardHat;

public class HatDecoratorTest 
{
	public static void main(String[] args) 
	{		
		System.out.println("Hat Shopping\n");
		
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.print("Standard Hat or Premium Hat ? ");
		
		String hatChoice = inputVariable.nextLine();
		
		System.out.print("In " + hatChoice + " hat, Golden Hat or Riboned Hat ?: ");
		
		String hatCustomize = inputVariable.nextLine();
		
		if(hatChoice.equalsIgnoreCase("Standard") && hatCustomize.equalsIgnoreCase("Golden"))
		{
			IHat hat = new StandardHat();
			GoldenHat golden = new GoldenHat(hat);
			
			System.out.println("\nHat Name: " + golden.getName());
			System.out.println("Hat Description: " + golden.getDescription());
			System.out.println("Final Price of Hat is: " + golden.getPrice());
		}
		
		if(hatChoice.equalsIgnoreCase("Premium") && hatCustomize.equalsIgnoreCase("Golden"))
		{
			IHat hat = new PremiumHat();
			GoldenHat golden = new GoldenHat(hat);
			
			System.out.println("\nHat Name: " + golden.getName());
			System.out.println("Hat Description: " + golden.getDescription());
			System.out.println("Final Price of Hat is: " + golden.getPrice());
		}
		
		if(hatChoice.equalsIgnoreCase("Standard") && hatCustomize.equalsIgnoreCase("Riboned"))
		{
			IHat hat = new StandardHat();
			RibonedHat riboned = new RibonedHat(hat);
			
			System.out.println("\nHat Name: " + riboned.getName());
			System.out.println("Hat Description: " + riboned.getDescription());
			System.out.println("Final Price of Hat is: " + riboned.getPrice());
		}
		if(hatChoice.equalsIgnoreCase("Premium") && hatCustomize.equalsIgnoreCase("Riboned"))
		{
			IHat hat = new PremiumHat();
			RibonedHat riboned = new RibonedHat(hat);
			
			System.out.println("\nHat Name: " + riboned.getName());
			System.out.println("Hat Description: " + riboned.getDescription());
			System.out.println("Final Price of Hat is: " + riboned.getPrice());
		}
		
	}
}
