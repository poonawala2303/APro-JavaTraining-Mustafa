package com.aurionpro.entity;

public class Transaction 
{
	private int transactionId;
	private int accountNumber;
	private String btnType;
	private double amount;
	private Integer toAccountNumber;
	
	public Transaction()
	{
		
	}
	
	public Transaction(int transactionId, int accountNumber, String btnType, double amount, Integer toAccountNumber) {
		super();
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.btnType = btnType;
		this.amount = amount;
		this.toAccountNumber = toAccountNumber;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBtnType() {
		return btnType;
	}

	public void setBtnType(String btnType) {
		this.btnType = btnType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Integer getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(Integer toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	
	
}
