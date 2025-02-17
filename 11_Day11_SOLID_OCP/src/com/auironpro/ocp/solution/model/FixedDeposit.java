package com.auironpro.ocp.solution.model;

public class FixedDeposit 
{
	private int accountNumber;
	private String name;
	private double principalAmount;
	private int duration;
	
	public FixedDeposit(int accountNumber, String name, double principalAmount, int duration) {	
		this.accountNumber = accountNumber;
		this.name = name;
		this.principalAmount = principalAmount;
		this.duration = duration;
	}

	public FixedDeposit() {
		// TODO Auto-generated constructor stub
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
