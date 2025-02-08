package com.aurionpro.model;

public class Savings extends Account{
    
	private double interestRate;
    private double minimumBalance;

    public Savings()
    {

    }

    public Savings(String accountName , double accountBalance ,double interestRate,double minimumBakance)
    {
    	super(accountName,accountBalance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBakance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMinimumBakance() {
        return minimumBalance;
    }

    public void setMinimumBakance(double minimumBakance) {
        this.minimumBalance = minimumBakance;
    }
    
}

