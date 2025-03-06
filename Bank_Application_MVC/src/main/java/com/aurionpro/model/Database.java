package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aurionpro.entity.BankAccount;
import com.aurionpro.entity.Customer;
import com.aurionpro.entity.Role;
import com.aurionpro.entity.Transaction;
import com.aurionpro.entity.Users;

public class Database 
{
	private Connection connection;
	private Statement statement;
	
	public void connect()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication","root","root");
			
			System.out.println("Connection Established\n");
		} 
		
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Users validateUser(String username, String password) 
	{
	    connect();
	    Users user = null;

	    try {
	        statement = connection.createStatement();
	        String query = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
	        ResultSet result = statement.executeQuery(query);

	        if (result.next()) 
	        {
	            user = new Users(result.getString(2), result.getString(3), Role.valueOf(result.getString(4)));
	        }
	    } 
	    
	    catch (SQLException e) 
	    {
	        e.printStackTrace();
	    }
	    
	    return user;
	}
	
	public void insertCustomer(Customer customer) 
	{
	    connect();
	    try {
	       
	        
	            String query = "insert into customers (FirstName, LastName, Email, Password, userid) values (?, ?, ?, ?, ?)";
	            PreparedStatement statement = connection.prepareStatement(query);

	            statement.setString(1, customer.getFirstName());
	            statement.setString(2, customer.getLastName());
	            statement.setString(3, customer.getEmail());
	            statement.setString(4, customer.getPassword());
	            statement.setInt(5, 1);

	            int rowsInserted = statement.executeUpdate();
	            
	            if (rowsInserted > 0) 
	            {
	                System.out.println("Customer inserted successfully");
	            } 
	            
	            else 
	            {
	                System.out.println("Failed to insert customer");
	            }
	        
	    } 
	    
	    catch (SQLException e) 
	    {
	        e.printStackTrace();
	    } 
	    
	    finally 
	    {
	        try 
	        {
	            if (connection != null) 
	            {
	                connection.close();
	            }
	        } 
	        
	        catch (SQLException e) 
	        {
	            e.printStackTrace();
	        }
	        
	    }
	}
	
	public List<Customer> getAllCustomers()
	{
		connect();
		List<Customer> customers = new ArrayList<>();
		
		try 
		{
			String query = "SELECT c.customerId, c.firstName, c.lastName, c.email, b.accountNumber, b.balance " +
                    "FROM customers c " +
                    "LEFT JOIN bank_account b ON c.customerId = b.customerId";
	        PreparedStatement statement = connection.prepareStatement(query);
	        ResultSet resultSet = statement.executeQuery();
	        
	        Map<Integer, Customer> customerMap = new HashMap<>();

	        while (resultSet.next()) 
	        {
	            int customerId = resultSet.getInt("customerId");

	            Customer customer = customerMap.get(customerId);
	            
	            if (customer == null) 
	            {
	                
	                String firstName = resultSet.getString("firstName");
	                String lastName = resultSet.getString("lastName");
	                String email = resultSet.getString("email");

	                customer = new Customer(customerId, firstName, lastName, email);
	                customerMap.put(customerId, customer);
	                customers.add(customer);
	            }

	           
	            int accountNumber = resultSet.getInt("accountNumber");
	            if (!resultSet.wasNull()) 
	            { 
	                double balance = resultSet.getDouble("balance");
	                BankAccount account = new BankAccount(accountNumber, balance);
	                customer.addAccount(account);
	            }
	        }
		}
	    
		catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }
		
		return customers;
	}
	
	public Customer getCustomerById(int customerId)
	{
		connect();
		Customer customer = null;
		
		try
		{
			String query = "Select * from customers where customerId = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, customerId);
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next())
			{
	            String firstName = resultSet.getString("firstName");
	            String lastName = resultSet.getString("lastName");
	            String email = resultSet.getString("email");
	            
	            customer = new Customer(customerId, firstName, lastName, email);
			}
			
		}
		
		catch(SQLException e)
		{
			e.getMessage();
		}
		
		finally 
		{
	        try 
	        {
	            if (connection != null) 
	            {
	                connection.close();
	            }
	        } 
	        
	        catch (SQLException e) 
	        {
	            e.printStackTrace();
	        }
	    }
		
		return customer;
		
	}
	
	public boolean insertBankAccount(int accountNumber, int customerId, double balance)
	{
		connect();
		boolean success = false;
		
		try
		{
			String query = "insert into bank_account(accountNumber,customerId,balance) values (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, accountNumber);
			statement.setInt(2, customerId);
			statement.setDouble(3, balance);
			
			int rowsInserted = statement.executeUpdate();
			success = rowsInserted > 0;
			
			
		}
		
		catch(SQLException e)
		{
			e.getMessage();
		}
		
		finally 
		{
	        try 
	        {
	            if (connection != null) 
	            {
	                connection.close();
	            }
	        } 
	        
	        catch (SQLException e) 
	        {
	            e.printStackTrace();
	        }
	    }
		
		return success;
	}
	
	public List<Transaction> getAllTransactions()
	{
		connect();
		List<Transaction> transactions = new ArrayList<>();
		
		try
		{
			String query = "select transactionId, accountNumber, txnType, amount, toAccountNumber from transactions";
			PreparedStatement statement = connection.prepareStatement(query);
	        ResultSet resultSet = statement.executeQuery();
	        
	        while(resultSet.next())
	        {
	        	int transactionId = resultSet.getInt("transactionId");
	        	int accountNumber = resultSet.getInt("accountNumber");
	            String btnType = resultSet.getString("txnType");
	            double amount = resultSet.getDouble("amount");
	            Integer toAccountNumber = resultSet.getInt("toAccountNumber");
	            
	            if (resultSet.wasNull()) 
	            {
	                toAccountNumber = null; // Handle null values for toAccountNumber
	            }
	            
	            Transaction transaction = new Transaction(transactionId, accountNumber, btnType, amount, toAccountNumber);
	            transactions.add(transaction);
	            
	        }
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
	        try 
	        {
	            if (connection != null) 
	            {
	                connection.close();
	            }
	        } 
	        
	        catch (SQLException e) 
	        {
	            e.printStackTrace();
	        }
	    }
	
		return transactions;
	}
	
	
}
