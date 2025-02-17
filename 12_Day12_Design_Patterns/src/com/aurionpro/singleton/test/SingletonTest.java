package com.aurionpro.singleton.test;

import com.aurionpro.singleton.model.DatabaseConnection;

public class SingletonTest 
{
	public static void main(String[] args) 
	{
		DatabaseConnection conn1 = DatabaseConnection.getDatabaseConnection();
		System.out.println(conn1.hashCode());
		
		DatabaseConnection conn2 = DatabaseConnection.getDatabaseConnection();
		System.out.println(conn2.hashCode());
		
		DatabaseConnection conn3 = DatabaseConnection.getDatabaseConnection();
		System.out.println(conn3.hashCode());
		
		DatabaseConnection conn4 = DatabaseConnection.getDatabaseConnection();
		System.out.println(conn4.hashCode());
		
		DatabaseConnection conn5 = DatabaseConnection.getDatabaseConnection();
		System.out.println(conn5.hashCode());
		
	}
}
