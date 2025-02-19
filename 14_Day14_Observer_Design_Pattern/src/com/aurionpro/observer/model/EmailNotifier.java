package com.aurionpro.observer.model;

public class EmailNotifier implements INotifier 
{
	Account account;

	public EmailNotifier(Account account) 
	{
		this.account = account;
	}

	@Override
	public void depositNotifier(double amount) {
		System.out.println("Deposit notifier called through Email. New balance is: " + account.getBalance());
		
	}

	@Override
	public void withdrawNotifier(double amount) {
		System.out.println("Withdraw notifier called through whatsapp. New balance is: " + account.getBalance());
		
	}

}
