package com.aurionpro.srp.solution.model;

public class Invoice 
{
	private int id;
	private String description;
	private int amount;
	private double tax;
	
	public Invoice()
	{
		
	}
	
	public Invoice(int id, String description, int amount, double tax) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
