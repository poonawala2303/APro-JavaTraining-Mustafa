package com.aurionpro.singleton.model;

public class DatabaseConnection 
{
	private static DatabaseConnection connection = null;
	
	private DatabaseConnection()
	{
		
	}
	
	public static DatabaseConnection getDatabaseConnection()
	{
		if(connection == null)
			connection = new DatabaseConnection();
		return connection;
	}
}
