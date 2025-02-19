package com.aurionpro.observer.model;

public class SMSNotifier implements INotifier 
{
	Account account;

	public SMSNotifier(Account account) 
	{
		this.account=account;
	}

	@Override
	public void depositNotifier(double amount) {
		System.out.println("Deposit notifier called through SMS. New balance is: " + account.getBalance());
		
	}

	@Override
	public void withdrawNotifier(double amount) {
		System.out.println("Withdraw notifier called through SMS. New balance is: " + account.getBalance());
		
	}

}
