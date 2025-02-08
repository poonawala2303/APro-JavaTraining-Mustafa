package com.aurionpro.model;

public class BankAccount
{
	private long accountNumber;
	private String accountHolderName;
	private int accountBalance;
	
	public BankAccount()
	{
		System.out.println("Default constructor called");
	}
	
	public BankAccount(long accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	
	public BankAccount(int accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	
	public BankAccount(long accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public BankAccount(String accountHolderName, int accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public BankAccount(long accountNumber, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	// Getters and Setters
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void deposit(double amount)
	{
		if(amount > 0)
		{
			accountBalance+= amount;
			System.out.println("Deposited amount is: " +amount +" . Avaliable Balance is: " + accountBalance);
			System.out.println("\n");
		}
		else
		{
			System.out.println("Withdrawl not allowed. Funds insufficient");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount > 0)
		{
			if(accountBalance >= amount)
			{
				accountBalance -= amount;
				System.out.println("Withdrawn " + amount + " . Remaining Balance "+ accountBalance);
			}
			
			else if (accountBalance < amount)
			{
				System.out.println("Withdrawl amount greater than Balance. Please enter amount lower than or equal to Rs: "+accountBalance);
			}
		}
		
		else
		{
			System.out.println("Insufficient funds.");
		}
		
	}
	
	public void displayBalance()
	{
		System.out.println("Account Balance is: "+accountBalance);
	}
	
}
