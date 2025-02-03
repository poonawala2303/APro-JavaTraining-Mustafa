package com.aurionpro.test;

public class AccountDetails {
	
//	public static class Account
//	{
//		long accountNumber;
//		String accountType;
//		String accountName;
//		long accountBalance;
		
//	}
	
	public static void displayDetails(long accountNumber , String accountType , String accountName ,long accountBalance)
	{
		System.out.println(accountNumber);
		System.out.println(accountType);
		System.out.println(accountName);
		System.out.println(accountBalance);
	}
	
	public static void main(String[] args) 
	{
		Account ac = new Account();
		
		ac.accountNumber = 1234567890123456l;
		ac.accountType = "Savings";
		ac.accountName = "Mustafa";
		ac.accountBalance = 9090909090l; 
		
		displayDetails(1234567890123456l, "Savings" , "Mustafa" , 90000000);

		System.out.println(ac.accountNumber);
		System.out.println(ac.accountType);
		System.out.println(ac.accountName);
		System.out.println(ac.accountBalance);
		
	}
	
}
