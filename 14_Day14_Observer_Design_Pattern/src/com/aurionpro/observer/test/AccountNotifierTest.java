package com.aurionpro.observer.test;

import java.util.Scanner;

import com.aurionpro.observer.model.Account;

public class AccountNotifierTest 
{
	
	public static void main(String[] args) throws Exception 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bank Account Management System\n");
		System.out.print("Enter bank account number: ");
		String accNum = input.nextLine();
		System.out.print("Enter bank account name: ");
		String accName = input.nextLine();
		System.out.print("Enter balance: ");
		double balance = input.nextDouble();
		
		System.out.println("Account Details \n");
		System.out.println("Account Number: " +accNum);
		System.out.println("Account Name: " +accName);
		System.out.println("Account Balance: " +balance);
		
		Account account = new Account(accNum,accName,balance);
		
		account.registerNotifier(account);
		account.depost(100);
		
		try 
		{
			account.withdraw(300);
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		
		try {
			account.withdraw(1200);
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
