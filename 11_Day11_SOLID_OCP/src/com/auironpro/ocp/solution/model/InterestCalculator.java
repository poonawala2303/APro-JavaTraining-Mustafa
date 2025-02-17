package com.auironpro.ocp.solution.model;

public class InterestCalculator 
{
	FixedDeposit fixed = new FixedDeposit();
	
	Holi holi = new Holi();
	
	public double calculateInterest()
	{
		double interest = 0;
		
		interest = fixed.getPrincipalAmount() * fixed.getDuration() * holi.getInterestRates() / 100;
		
		return interest;
	}
}
