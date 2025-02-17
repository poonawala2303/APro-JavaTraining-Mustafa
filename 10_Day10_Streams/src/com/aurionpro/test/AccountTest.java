package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Account;

public class AccountTest 
{
	static List<Account> accounts = new ArrayList<Account>();
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		System.out.print("How many accounts: ");
		int size = input.nextInt();
		System.out.println("");
		
		readAccounts(accounts , size);
		
		performOperations(accounts);
		
	}
	
	public static void readAccounts(List<Account> accounts , int size)
	{
		for (int i = 0; i<size ;i++) 
		{
			System.out.print("Enter acc no: ");
			int accNo = input.nextInt();
			
			System.out.print("Enter acc name: ");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.print("Enter balance to set: ");
			double balance = input.nextDouble();
			
			System.out.println("");
			accounts.add(new Account(accNo,name,balance));
		}
	}
	
	public static void performOperations(List<Account> accounts)
	{
		accounts.stream()
        .min(Comparator.comparingDouble(acc -> acc.getBalance()))
        .ifPresent(acc -> System.out.println("Account with Minimum Balance: " + acc));
		
		System.out.println("");
		
		accounts.stream()
        .max(Comparator.comparingDouble(acc -> acc.getBalance()))
        .ifPresent(acc -> System.out.println("Account with Maximum Balance: " + acc));
		
		System.out.println("");
		
		System.out.println("Accounts with name greater than 6 characters: ");
		accounts.stream()
		.filter((acc)->acc.getName().length()>=6)
		.forEach(name-> System.out.println(name));
		
		double totalBalance = accounts.stream()
		.mapToDouble((acc)-> acc.getBalance())
		.sum();
		
		System.out.println("");
		
		System.out.println("Total Balance is: " + totalBalance);
	}
}
