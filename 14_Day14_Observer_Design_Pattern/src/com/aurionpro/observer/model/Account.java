package com.aurionpro.observer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account 
{
	private String accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;

	public Account() 
	{
		
	}

	public Account(String accountNumber, String name, double balance) 
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		notifiers = new ArrayList<>();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}
	
	public void depost(double amount)
	{
		if(amount < 0)
		{
			return;
		}
		
		balance += amount;
		
		System.out.println("Deposited! Available Balance: " +balance);
		
		for(INotifier notifier : notifiers)
		{
			notifier.depositNotifier(amount);
		}
		
	}
	
	public void withdraw(double amount) throws Exception
	{
		if (amount > balance)
		{
			throw new Exception("Balance not sufficient. Balance is: " + balance);
		}
	
		balance -= amount;
		
		System.out.println("Withdrwan! Available Balance: " +balance);
		
		for(INotifier notifier : notifiers)
		{
			notifier.withdrawNotifier(amount);
		}
	}
	
	public void registerNotifier(Account account)
	{
		System.out.println("\nChoose the the following to recieve notifications on SMS, Whatsapp , Mail: ");
		System.out.println("Press 1 for SMS ");
		System.out.println("Press 2 for Whatsapp ");
		System.out.println("Press 3 for Mail ");
		System.out.println("Press 4 for all ");
		
		Scanner in = new Scanner(System.in);
		
		int choice = in.nextInt();
		
		switch(choice) 
		{
		case 1:
			notifiers.add(new SMSNotifier(account));
			System.out.println("Registered for SMS");
			break;
		case 2:
			notifiers.add(new WhatsappNotifier(account));
			System.out.println("Registered for Whatsapp");
			break;
		case 3:
			notifiers.add(new EmailNotifier(account));
			System.out.println("Registered for Email");
			break;
		case 4:
			notifiers.add(new SMSNotifier(account));
			notifiers.add(new WhatsappNotifier(account));
			notifiers.add(new EmailNotifier(account));
			System.out.println("Registered for SMS,Email,Whatsapp");
			break;
		}
	}
	
}
