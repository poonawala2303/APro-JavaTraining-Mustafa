package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentOperations
{
	
	private Connection conn = DatabaseConnection.getDatabseConnection().getConnection();

	public void createStudent(int rollNumber , String name , int age) 
	{
		try 
		{
			PreparedStatement statement = conn.prepareStatement("insert into students (rollNumber , name ,age)values (?,?,?)");
			statement.setInt(1,rollNumber);
			statement.setString(2,name);
			statement.setInt(3,age);
			statement.executeUpdate();
			System.out.println("Student Created Successfully!");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void readStudent() 
	{
		try
		{
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from students");
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
			}
			
		}
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateStudent(int rollNumber , String name) 
	{
	
		try 
		{
			PreparedStatement statement = conn.prepareStatement("update students set name = ? where rollNumber = ?");
			statement.setString(1,name);
			statement.setInt(2,rollNumber);
			statement.executeUpdate();
			System.out.println("Student Updated Successfully!");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	public void deleteStudent(int rollNumber) 
	{
		try 
		{
			PreparedStatement statement = conn.prepareStatement("delete from students where rollNumber = ?");
			statement.setInt(1,rollNumber);
			statement.executeUpdate();
			System.out.println("Student Deleted Successfully!");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
