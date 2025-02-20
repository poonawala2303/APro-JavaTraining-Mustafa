package com.aurionpro.strategy.test;

import java.util.Scanner;

import com.aurionpro.strategy.model.AddOperation;
import com.aurionpro.strategy.model.MultiplyOperation;
import com.aurionpro.strategy.model.OperationStrategy;

public class ClientInputs 
{
	public void takeInputs()
	{
		OperationStrategy operation = new OperationStrategy(); // creating operation strategy object
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = input.nextInt();
		
		System.out.println("\nWhich operation do you want to choose ?");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Multiplication");
		System.out.print("Enter choice: ");
		int choice = input.nextInt();
		System.out.println("");
		
		switch(choice)
		{
		case 1:
			operation.setOperation(new AddOperation());
			operation.doOperation(num1, num2);
			break;
			
		case 2:
			operation.setOperation(new MultiplyOperation());
			operation.doOperation(num1, num2);
			break;
			
		default:
			System.out.println("Enter valid numbers");
		}
	}
}
