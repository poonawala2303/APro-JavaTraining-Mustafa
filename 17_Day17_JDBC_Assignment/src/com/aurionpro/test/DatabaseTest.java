package com.aurionpro.test;

import com.aurionpro.model.DatabaseConnection;
import com.aurionpro.model.StartProgram;

public class DatabaseTest 
{
	DatabaseConnection conn1 = DatabaseConnection.getDatabseConnection();
	
	public static void main(String[] args) 
	{
		StartProgram startProgram = new StartProgram();
		startProgram.start();
	}
}