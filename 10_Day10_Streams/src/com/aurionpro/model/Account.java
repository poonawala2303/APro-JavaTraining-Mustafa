package com.aurionpro.model;

public class Account 
{
	private int accNo;
	private String name;
	protected double balance;
	
	public Account(int accNo, String name, double balance) 
	{
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() 
	{
		return accNo;
	}

	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
