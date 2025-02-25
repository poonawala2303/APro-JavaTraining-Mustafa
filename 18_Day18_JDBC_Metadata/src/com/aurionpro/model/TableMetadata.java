package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TableMetadata 
{
	public void connect()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("select * from students");
//			ResultSetMetaData rsmd = resultSet.getMetaData();
			DatabaseMetaData dbmd = connection.getMetaData();
			
//			int numberOfColumns = rsmd.getColumnCount();
//			System.out.println("Number of columns: " +numberOfColumns);
			
			ResultSet numberOfTables = dbmd.getTables("college", null, "%", new String[] {"Table"} );
			
			while(numberOfTables.next())
			{
				ResultSet resultSet = statement.executeQuery("select * from " +numberOfTables.getString("Table_NAME") );
				ResultSetMetaData rsmd = resultSet.getMetaData();
				 System.out.println("Table name: "+numberOfTables.getString("Table_NAME"));
		         System.out.println("Table type: "+numberOfTables.getString("TABLE_TYPE"));
		         System.out.println("Table catalog: "+numberOfTables.getString("TABLE_CAT"));
		         int column = rsmd.getColumnCount();
		         System.out.println("Column count: " + column);
		         System.out.println("");
		         for(int i=1 ; i<=column ; i++)
		         {
		        	 System.out.println("Column Name: " + rsmd.getColumnName(i));
			         System.out.println("Column type: " + rsmd.getColumnTypeName(i));
			         System.out.println("");
		         }
		         System.out.println(" ");
			}
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
}
