package com.auironpro.ocp.violation.model;

public class FixedDeposit 
{
	private int accountNumber;
	private String name;
	private double principalAmount;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposit(int accountNumber, String name, double principalAmount, int duration, FestivalType festival) {	
		this.accountNumber = accountNumber;
		this.name = name;
		this.principalAmount = principalAmount;
		this.duration = duration;
		this.festival = festival;
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
	
	private double getInterestRates()
	{
		double interest=0;
		
		if(festival.equals(FestivalType.NEWYEAR))
		{
			interest = 8;
		}
		
		if(festival.equals(FestivalType.HOLI))
		{
			interest = 7.5;
		}
		
		if(festival.equals(FestivalType.DIWALI))
		{
			interest = 8.5;
		}
		
		if(festival.equals(FestivalType.OTHERS))
		{
			interest = 6.5;
		}
		
		return interest;
		
	}
	
	public double calculateSimpleInterest(FestivalType festivalType)
	{
		double simpleInterest = 0;
		
		simpleInterest = principalAmount*duration*getInterestRates()/100;
		
		return simpleInterest;
	}
	
}
