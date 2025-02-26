package com.aurionpro.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionManagement 
{
	public void connect()
	{
		try 
		{
			Scanner scanner = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/account_db","root","root");
			
			System.out.println("Connection Established\n");
			
			connection.setAutoCommit(false);
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into users (id,name,salary) values (?,?,?)");  
			
			while(true)
			{
				System.out.print("Enter Roll Number: ");
				int id = scanner.nextInt();
				System.out.print("Enter Name: ");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.print("Enter Age: ");
				int salary = scanner.nextInt();
				
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setInt(3, salary);
				preparedStatement.executeUpdate();
				
				System.out.print("Commit / Rollback: ");
				scanner.nextLine();
				String answer = scanner.nextLine();
				
				if(answer.equalsIgnoreCase("commit"))
				{
					connection.commit();
				}
				
				if(answer.equalsIgnoreCase("rollback"))
				{
					connection.rollback();
				}
				
				System.out.println("Want to add more records y/n");  
				String ans=scanner.nextLine();  
				if(ans.equals("n"))
				{  
				break;  
				}  
				
			}
			
			connection.commit();
			System.out.println("record successfully saved");  
			
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
