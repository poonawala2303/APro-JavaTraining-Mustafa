package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherOperations
{
	
	private Connection conn = DatabaseConnection.getDatabseConnection().getConnection();

	public void createTeacher(int teacherId, String name, String qualification) {
		try 
		{
			PreparedStatement statement = conn.prepareStatement("insert into teacher (teacherId , name ,qualification)values (?,?,?)");
			statement.setInt(1,teacherId);
			statement.setString(2,name);
			statement.setString(3,qualification);
			statement.executeUpdate();
			System.out.println("Teacher Created Successfully!\n");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	public void readTeacher() 
	{
		try
		{
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from teacher");
			
			System.out.println("");
			System.out.println("TId" + "\t" + "Name" + "\t" + "Qualification");
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
			}
			System.out.println("");
			
		}
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateTeacher(int teacherId, String name) 
	{
		try 
		{
			PreparedStatement statement = conn.prepareStatement("update teacher set name = ? where teacherId = ?");
			statement.setString(1,name);
			statement.setInt(2,teacherId);
			statement.executeUpdate();
			System.out.println("Teacher Updated Successfully!\n");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void deleteTeacher(int rollNumber) 
	{
		try 
		{
			PreparedStatement statement = conn.prepareStatement("delete from teacher where teacherId = ?");
			statement.setInt(1,rollNumber);
			statement.executeUpdate();
			System.out.println("Teacher Deleted Successfully!\n");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
