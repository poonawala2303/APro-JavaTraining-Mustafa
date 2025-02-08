package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class BankAccountDetails {	
	
	public static void main(String[] args) {
		
		Scanner inputVariable = new Scanner(System.in);
		
//		BankAccount b1 = new BankAccount();
		
		BankAccount b1 = new BankAccount(45,"Mustafa");
		
//		System.out.print("Enter your account number: ");
//		int accNum = inputVariable.nextInt();
//		b1.setAccountNumber(accNum);
		
//		System.out.print("Enter your account holder name: ");
//		inputVariable.nextLine();
//		String accHolderName = inputVariable.nextLine();
//		b1.setAccountHolderName(accHolderName);
		
		while(true) 
		{
			System.out.println("\nChoose from the following choices\n");
			
			System.out.println("Enter 1 to Deposit");
			System.out.println("Enter 2 to Withdraw");
			System.out.println("Enter 3 to Check Balance");
			System.out.println("Enter 4 to Exit");
			
			int choice = inputVariable.nextInt();
			
			switch(choice) 
			{
				case 1:
					System.out.print("\nEnter amount to Deposit: ");
					int depositAmount = inputVariable.nextInt();
					b1.deposit(depositAmount);
					break;
				case 2:
					System.out.print("\nEnter amount to Withdraw: ");
					int withdrawAmount = inputVariable.nextInt();
					b1.withdraw(withdrawAmount);
					break;
				case 3:
					b1.displayBalance();
					break;
				case 4:
					break;
			}
		}
		
	}
	
}
