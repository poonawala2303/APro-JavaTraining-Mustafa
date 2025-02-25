package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection 
{
	private static DatabaseConnection instance;
	private static Connection connection;
	
	public DatabaseConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
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

	public static DatabaseConnection getDatabseConnection() 
	{
		if(instance == null)
			instance = new DatabaseConnection();
		return instance;
	}
	
	public Connection getConnection() {
        return connection;
    }
	
	
}
