package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.exceptions.NegativeAmountException;

public class Savings extends Account 
{
	
	// Variable declarations
	
	private static double minimumBalance = 500.0;
	
	// Parameterized Constructor

	public Savings(String accountNumber , String name, double balance) 
	{
		super(accountNumber , name, balance);
	}
	
	// Getter

	public static double getMinimumBalance() 
	{
		return minimumBalance;
	}

	// Debit fxn
	
	public void debit(double amount) throws SQLException
	{
		if (amount<=0)
		{
			throw new NegativeAmountException();
		}
		
		if(balance-amount<minimumBalance)
		{
			throw new MinimumBalanceException();
		}
		
		try (Connection connection = DatabaseConnection.getDatabseConnection().getConnection();)
		{
		String query = "UPDATE accounts set balance = balance - ? where account_number =?";
			
			try(PreparedStatement prepareStatement = connection.prepareStatement(query))
			{
				prepareStatement.setDouble(1,amount);
				prepareStatement.setString(2,getAccountNumber());
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
		System.out.println("Debit successful! New balance: " + (balance - amount));
		
	}
}