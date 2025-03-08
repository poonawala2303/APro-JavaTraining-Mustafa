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
import java.util.stream.Collectors;

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
	
	public void insertUser(Users user) 
	{
	    connect();
	    try 
	    {
	        String query = "INSERT INTO users (username, password, Role) VALUES (?, ?, ?)";
	        PreparedStatement statement = connection.prepareStatement(query);
	        statement.setString(1, user.getUsername());
	        statement.setString(2, user.getPassword());
	        statement.setString(3, user.getRole().toString());

	        int rowsInserted = statement.executeUpdate();
	        if (rowsInserted > 0) 
	        {
	            System.out.println("User inserted successfully");
	        } 
	        
	        else 
	        {
	            System.out.println("Failed to insert user");
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
	
	public Customer getCustomerByEmail(String email) 
	{
	    connect();
	    Customer customer = null;

	    try 
	    {
	        String query = "SELECT * FROM customers WHERE email = ?";
	        PreparedStatement statement = connection.prepareStatement(query);
	        statement.setString(1, email);
	        ResultSet resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            int customerId = resultSet.getInt("customerId");
	            String firstName = resultSet.getString("firstName");
	            String lastName = resultSet.getString("lastName");
	            String password = resultSet.getString("password");

	            customer = new Customer(customerId, firstName, lastName, email, password);
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

	    return customer;
	}

	
	public void insertCustomer(Customer customer) 
	{
	    connect();
	    try {
	       
	        
	            String query = "insert into customers (FirstName, LastName, Email, Password) values (?, ?, ?, ?)";
	            PreparedStatement statement = connection.prepareStatement(query);

	            statement.setString(1, customer.getFirstName());
	            statement.setString(2, customer.getLastName());
	            statement.setString(3, customer.getEmail());
	            statement.setString(4, customer.getPassword());

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
	
	public List<Integer> getAccountNumbersByCustomerId(int customerId) 
	{
	    connect();
	    List<Integer> accountNumbers = new ArrayList<>();

	    try {
	        String query = "SELECT accountNumber FROM bank_account WHERE customerId = ?";
	        PreparedStatement statement = connection.prepareStatement(query);
	        statement.setInt(1, customerId);
	        ResultSet resultSet = statement.executeQuery();

	        while (resultSet.next()) 
	        {
	            int accountNumber = resultSet.getInt("accountNumber");
	            accountNumbers.add(accountNumber);
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

	    return accountNumbers;
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
	
//	public List<Transaction> getTransactionsByAccountNumbers(List<Integer> accountNumbers)
//	{
//		 connect();
//		 List<Transaction> transactions = new ArrayList<>();
//		 
//		 try 
//		 {
//		    
//		        String accountNumbersStr = accountNumbers.stream()
//		                                                .map(String::valueOf)
//		                                                .collect(Collectors.joining(","));
//
//		        String query = "SELECT * FROM transactions WHERE accountNumber IN (" + accountNumbersStr + ")";
//		        PreparedStatement statement = connection.prepareStatement(query);
//		        ResultSet resultSet = statement.executeQuery();
//
//		        while (resultSet.next()) 
//		        {
//		            int transactionId = resultSet.getInt("transactionId");
//		            int accountNumber = resultSet.getInt("accountNumber");
//		            String txnType = resultSet.getString("txnType");
//		            double amount = resultSet.getDouble("amount");
//		            Integer toAccountNumber = resultSet.getInt("toAccountNumber");
//		            if (resultSet.wasNull()) {
//		                toAccountNumber = null; // Handle null values for toAccountNumber
//		            }
//
//		            Transaction transaction = new Transaction(transactionId, accountNumber, txnType, amount, toAccountNumber);
//		            transactions.add(transaction);
//		        }
//		    } 
//		 
//		 catch (SQLException e) 
//		 {
//		        e.printStackTrace();
//		 } 
//		 
//		 finally 
//		 {
//		        try 
//		        {
//		            if (connection != null) {
//		                connection.close();
//		            }
//		        } catch (SQLException e) {
//		            e.printStackTrace();
//		        }
//		    }
//
//		 return transactions;
//		 
//	}
	
	public double getAccountBalance(int accountNumber) {
        connect();
        double balance = 0;
        try {
            String query = "SELECT balance FROM bank_account WHERE accountNumber = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, accountNumber);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                balance = rs.getDouble("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
        return balance;
    }

    // Update account balance
    public boolean updateAccountBalance(int accountNumber, double amount, String transactionType) {
        connect();
        boolean success = false;
        try {
            double currentBalance = getAccountBalance(accountNumber);
            double newBalance = transactionType.equals("credit") ? currentBalance + amount : currentBalance - amount;
            if (newBalance < 0) {
                return false; // Insufficient funds
            }

            String query = "UPDATE bank_account SET balance = ? WHERE accountNumber = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setDouble(1, newBalance);
            stmt.setInt(2, accountNumber);
            int rowsUpdated = stmt.executeUpdate();
            success = rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            closeConnection();
        }
        return success;
    }

    // Check if account exists
    public boolean accountExists(int accountNumber) {
        connect();
        boolean exists = false;
        try {
            String query = "SELECT COUNT(*) FROM bank_account WHERE accountNumber = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, accountNumber);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                exists = rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            closeConnection();
        }
        return exists;
    }

    public boolean insertTransaction(Transaction transaction) {
        connect();
        boolean success = false;
        try {
            String query = "INSERT INTO transactions (accountNumber, txnType, amount, toAccountNumber) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, transaction.getAccountNumber());
            stmt.setString(2, transaction.getBtnType());
            stmt.setDouble(3, transaction.getAmount());
            if (transaction.getToAccountNumber() != null) {
                stmt.setInt(4, transaction.getToAccountNumber());
            } else {
                stmt.setNull(4, java.sql.Types.INTEGER);
            }
            int rowsInserted = stmt.executeUpdate();
            success = rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
        }
        return success;
    }
    
    public boolean updateCustomer(Customer customer)
    {
    	connect();
    	boolean success = false;
    	
    	try
    	{
    		String query = "update customers set firstName = ? , lastName = ? , password= ? where customerId=?";
    		PreparedStatement statement = connection.prepareStatement(query);
    		statement.setString(1, customer.getFirstName());
    		statement.setString(2, customer.getLastName());
    		statement.setString(3, customer.getPassword());
    		statement.setInt(4, customer.getCustomerId());
    		
    		int rowsUpdated = statement.executeUpdate();
            success = rowsUpdated > 0;
              
    	}
    	
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    	
    	return success;
    }
    
    public boolean updateUserPassword(String username, String password) 
    {
        connect();
        boolean success = false;
        try 
        {
            String query = "UPDATE users SET password = ? WHERE username = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, password);
            stmt.setString(2, username);

            int rowsUpdated = stmt.executeUpdate();
            success = rowsUpdated > 0;
        } 
        
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return success;
    }
    
    public List<Transaction> getFilteredTransactions(List<Integer> accountNumbers, String transactionType, Integer accountNumber, Double minAmount, Double maxAmount) 
    {
        connect();
        List<Transaction> transactions = new ArrayList<>();
        try 
        {
            StringBuilder query = new StringBuilder("SELECT * FROM transactions WHERE accountNumber IN (");
            query.append(accountNumbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
            query.append(")");

            List<Object> params = new ArrayList<>();
            int paramIndex = 1;

            if (transactionType != null && !transactionType.isEmpty()) 
            {
                query.append(" AND txnType = ?");
                params.add(transactionType);
            }
            
            if (accountNumber != null) 
            {
                query.append(" AND accountNumber = ?");
                params.add(accountNumber);
            }
            
            if (minAmount != null) 
            {
                query.append(" AND amount >= ?");
                params.add(minAmount);
            }
            
            if (maxAmount != null) 
            {
                query.append(" AND amount <= ?");
                params.add(maxAmount);
            }

            PreparedStatement stmt = connection.prepareStatement(query.toString());
            for (int i = 0; i < params.size(); i++) 
            {
                stmt.setObject(i + 1, params.get(i));
            }

            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) 
            {
                int transactionId = resultSet.getInt("transactionId");
                int acctNumber = resultSet.getInt("accountNumber");
                String txnType = resultSet.getString("txnType");
                double amount = resultSet.getDouble("amount");
                Integer toAcctNumber = resultSet.getInt("toAccountNumber");
                if (resultSet.wasNull()) 
                {
                    toAcctNumber = null;
                }

                Transaction transaction = new Transaction(transactionId, acctNumber, txnType, amount, toAcctNumber);
                transactions.add(transaction);
            }
        } 
        
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return transactions;
    }
    
    public List<Transaction> getFilteredTransactions(String transactionType, Integer accountNumber, Double minAmount, Double maxAmount) {
        connect();
        List<Transaction> transactions = new ArrayList<>();
        try {
            StringBuilder query = new StringBuilder("SELECT * FROM transactions");
            List<Object> params = new ArrayList<>();
            List<String> conditions = new ArrayList<>();

            if (transactionType != null && !transactionType.isEmpty()) {
                conditions.add("txnType = ?");
                params.add(transactionType);
            }
            if (accountNumber != null) {
                conditions.add("accountNumber = ?");
                params.add(accountNumber);
            }
            if (minAmount != null) {
                conditions.add("amount >= ?");
                params.add(minAmount);
            }
            if (maxAmount != null) {
                conditions.add("amount <= ?");
                params.add(maxAmount);
            }

            if (!conditions.isEmpty()) {
                query.append(" WHERE ");
                query.append(String.join(" AND ", conditions));
            }

            PreparedStatement stmt = connection.prepareStatement(query.toString());
            for (int i = 0; i < params.size(); i++) {
                stmt.setObject(i + 1, params.get(i));
            }

            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int transactionId = resultSet.getInt("transactionId");
                int acctNumber = resultSet.getInt("accountNumber");
                String txnType = resultSet.getString("txnType");
                double amount = resultSet.getDouble("amount");
                Integer toAcctNumber = resultSet.getInt("toAccountNumber");
                if (resultSet.wasNull()) {
                    toAcctNumber = null;
                }

                Transaction transaction = new Transaction(transactionId, acctNumber, txnType, amount, toAcctNumber);
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
	
}
