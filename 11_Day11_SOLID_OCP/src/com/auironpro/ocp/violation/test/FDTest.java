package com.auironpro.ocp.violation.test;

import java.util.Scanner;

import com.auironpro.ocp.violation.model.FestivalType;
import com.auironpro.ocp.violation.model.FixedDeposit;

public class FDTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		FixedDeposit fixedDeposit = new FixedDeposit();
		
		System.out.print("Enter your account number: ");
		fixedDeposit.setAccountNumber(input.nextInt());
		
		System.out.print("Enter your name: ");
		input.nextLine();
		fixedDeposit.setName(input.nextLine());
		
		System.out.print("Enter the Principal amount: ");
		fixedDeposit.setPrincipalAmount(input.nextDouble());
		
		System.out.print("Enter duration for which you are taking money: ");
		fixedDeposit.setDuration(input.nextInt());
		
		FestivalType festivalType = festiveType();
		
		fixedDeposit.calculateSimpleInterest(festivalType);
		
	}
	
	public static FestivalType festiveType()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select festivals from the list");
		System.out.println("Enter 1 for NEWYEAR");
		System.out.println("Enter 2 for DIWALI");
		System.out.println("Enter 3 for HOLI");
		System.out.println("Enter 4 for OTHERS");
		
		int choice = input.nextInt();
		FestivalType festivalType = null;
		
		switch(choice)
		{
		
		case 1:
			festivalType = festivalType.NEWYEAR; 
			break;
		case 2:
			festivalType = festivalType.DIWALI; 
			break;
		case 3:
			festivalType = festivalType.HOLI;
			break;
		case 4:
			festivalType = festivalType.OTHERS;
			break;
		}
		
		return festivalType;
	}
}
