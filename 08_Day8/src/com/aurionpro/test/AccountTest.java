package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.model.Account;
import com.aurionpro.model.Current;
import com.aurionpro.model.Savings;

public class AccountTest 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Account account = null;
		
		while (true) 
		{
			System.out.println("\nBanking Application Menu:");
			System.out.println("Select one of the below options:\n");
			System.out.println("1. Create Savings Account");
			System.out.println("2. Create Current Account");
			System.out.println("3. Credit Amount");
			System.out.println("4. Debit Amount");
			System.out.println("5. View Balance");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline
			
			switch (choice) 
			{
			case 1:
				if (account == null) {
					System.out.print("Enter Holder's Name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Initial Balance (Min balance should be 500): ");
					double balance = scanner.nextDouble();
					if (balance < Savings.getMinimumBalance()) {
						System.out.println("Initial balance must be atleast 500");
						break;
					}
					account = new Savings(name, balance);
					System.out.println("Savings Account Created! Account Number: " + account.getAccountNumber());
				} else {
					System.out.println("An account already exists!");
				}
				break;
			case 2:
				if (account == null) {
					System.out.print("Enter Holder's Name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Initial Balance: ");
					double balance = scanner.nextDouble();
					System.out.print("Enter Overdraft Limit: ");
					double overdraftLimit = scanner.nextDouble();
					System.out.print("Enter Interest Rate: ");
					double interestRate = scanner.nextDouble();
					account = new Current(name, balance, overdraftLimit , interestRate);
					System.out.println("Current Account Created! Account Number: " + account.getAccountNumber());
				} else {
					System.out.println("An account already exists!");
				}
				break;
			case 3:
				if (account != null) {
					System.out.print("Enter Amount to Credit: ");
					double amount = scanner.nextDouble();
					account.deposit(amount);
				} else {
					System.out.println("Create an account first!");
				}
				break;
			case 4:
				if (account != null) {
					System.out.print("Enter Amount to Debit: ");
					double amount = scanner.nextDouble();
					try
					{
					account.debit(amount);
					}
					catch(MinimumBalanceException e)
					{
//						e.getMessage();
						System.out.println(e.getMessage());
					}
				} else {
					System.out.println("Create an account first!");
				}
				break;
			case 5:
				if (account != null) {
					System.out.println("Account Holder: " + account.getName());
					System.out.println("Account Number: " + account.getAccountNumber());
					System.out.println("Current Balance: " + account.getBalance());
				} else {
					System.out.println("Create an account first!");
				}
				break;
			case 6:
				System.out.println("Thanks");
				scanner.close();

				return;
			default:
				System.out.println("Invalid choice! Please enter a valid option.");
			}
		}
	}
}