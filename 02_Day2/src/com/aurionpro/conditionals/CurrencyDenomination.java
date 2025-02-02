package com.aurionpro.conditionals;

import java.util.Scanner;

public class CurrencyDenomination {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.print("Sorry , Enter amount to withdraw: ");
		int initialInputAmount = inputVariable.nextInt();	

		
		if (!(initialInputAmount % 100 == 0) && initialInputAmount<=50000)
		{
			System.out.println("Enter amounts in multiple of 100");
		}
		
		else if (initialInputAmount <= 50000 && initialInputAmount % 100 == 0)
		{
			System.out.println("Amount withdrawn: " + initialInputAmount);
			
			int sumOf2000 = 0;
			int sumOf500 = 0;
			int sumOf200 = 0;
			int sumOf100 = 0;
			
			sumOf2000 = initialInputAmount / 2000;
			initialInputAmount = initialInputAmount % 2000;
			
			sumOf500 = initialInputAmount / 500;
			initialInputAmount = initialInputAmount % 500;
			
			sumOf200 = initialInputAmount / 200;
			initialInputAmount = initialInputAmount % 200;
			
			sumOf100 = initialInputAmount / 100;
			initialInputAmount = initialInputAmount % 100;
			
			
			
			if (sumOf2000 > 0) 
			{
                System.out.println("Two Thousand : " + sumOf2000);
            }
            
			if (sumOf500 > 0) 
            {
                System.out.println("Five Hundred : " + sumOf500);
            }
            
			if (sumOf200 > 0) 
			{
                System.out.println("Two Hundred : " + sumOf200);
            }
			
            if (sumOf100 > 0) 
            {
                System.out.println("One Hundred : " + sumOf100);
            }
			
		}
		
		else
		{
			System.out.println("Amount greater than 50000. Enter a smaller amount");
		}
		
	}
}
