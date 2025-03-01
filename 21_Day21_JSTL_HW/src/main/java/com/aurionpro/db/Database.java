package com.aurionpro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Student;

public class Database 
{
	private Connection connection;
	private Statement statement;
	
	public void connect()
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
	
	public List<Student> readAllStudents()
	{
		List<Student> students = new ArrayList<>();
		connect();
		try
		{
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from students");
			while(resultSet.next())
			{
				Student student = new Student(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3));
				students.add(student);
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return students;
	}
	
	
	
}
