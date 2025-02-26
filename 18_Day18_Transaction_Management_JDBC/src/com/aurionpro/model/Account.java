package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aurionpro.exceptions.NegativeAmountException;

public abstract class Account 
{
	// Variable Declarations 
	
	private String accountNumber;
	private String name;
	protected double balance;

	// Parametrized constructor 
	
	public Account(String accountNumber ,String name, double balance) 
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	// Getters
	
	public String getAccountNumber() 
	{
		return accountNumber;
	}

	public String getName() 
	{
		return name;
	}

	public double getBalance() 
	{
		return balance;
	}
	
	// Deposit fxn

	public void deposit(double amount) throws SQLException
	{
		if (amount<=0)
		{
			throw new NegativeAmountException();
		}

		try (Connection connection = DatabaseConnection.getDatabseConnection().getConnection();)
		{
		String query = "UPDATE accounts set balance = balance + ? where account_number =?";
			
			try(PreparedStatement prepareStatement = connection.prepareStatement(query))
			{
				prepareStatement.setDouble(1,amount);
				prepareStatement.setString(2,accountNumber);
				prepareStatement.executeUpdate();
			}
			
			catch(NegativeAmountException e)
			{
				e.getMessage();
			} 
			
			catch (SQLException e) 
			{
				System.out.println("SQL Exception occured");
				e.getMessage();
			}
		
		} 
		System.out.println("Deposit successful! New balance: " + (balance + amount));
		 
	
	}

	public abstract void debit(double amount) throws SQLException;
}