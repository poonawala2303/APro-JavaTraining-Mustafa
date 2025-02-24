package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubjectOperations 
{
	private Connection conn = DatabaseConnection.getDatabseConnection().getConnection();

	public void createSubject(int subId, String subName, int teacherId) {
		try 
		{
			PreparedStatement statement = conn.prepareStatement("insert into subjects (subId , subName ,teacherId)values (?,?,?)");
			statement.setInt(1,subId);
			statement.setString(2,subName);
			statement.setInt(3,teacherId);
			statement.executeUpdate();
			System.out.println("Subject Created Successfully!");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	public void readSubject() 
	{
		try
		{
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from subjects");
			
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

	public void updateSubject(int subId, String subName) 
	{
		try 
		{
			PreparedStatement statement = conn.prepareStatement("update subjects set subName = ? where subId = ?");
			statement.setString(1,subName);
			statement.setInt(2,subId);
			statement.executeUpdate();
			System.out.println("Subjects Updated Successfully!");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void deleteSubject(int subId) 
	{
		try 
		{
			PreparedStatement statement = conn.prepareStatement("delete from stuents where subId = ?");
			statement.setInt(1,subId);
			statement.executeUpdate();
			System.out.println("Subject Deleted Successfully!");
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
