package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection 
{
	public void connect()
	{
		try 
		{
			// Register Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establish Connection
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bstudent_d","root","root");
			
			System.out.println("Connection established");
			
			// Create a statement 
			
			Statement statement = connection.createStatement();
			
			// Insert Data using statement
			
//			int insertSet = statement.executeUpdate("insert into students values (6,'LMN',88,21)");
//			
//			System.out.println(insertSet + " row/s affected");
			
			// Insert Data using PreparedStatement
			
			int studentId = 10;
			String name = "Kiran";
			int rollNumber = 38;
			int age = 23;
			
//			PreparedStatement preparedStatement = connection.prepareStatement("insert into students values (?,?,?,?)");
//			preparedStatement.setInt(1, studentId);
//			preparedStatement.setString(2, name);
//			preparedStatement.setInt(3, rollNumber);
//			preparedStatement.setInt(4, age);
//			
//			preparedStatement.executeUpdate();
			
			// Updating Data using PreparedStatement
			
//			String nameUpdate = "Hiran";
//			PreparedStatement preparedStatement = connection.prepareStatement("update students set name= ? where studentId = ?");
//			preparedStatement.setString(1, nameUpdate);
//			preparedStatement.setInt(2, studentId);
//			
//			preparedStatement.executeUpdate();
			
			// Deleting data 
			
			PreparedStatement preparedStatement = connection.prepareStatement("delete from students where name= ?");
			preparedStatement.setString(1, "LMN");
			
			preparedStatement.executeUpdate();
			
			// Execute query
			
			ResultSet resultSet = statement.executeQuery("select * from students");
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getInt("age"));
			}
			
			connection.close();
		
			
		} 
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
