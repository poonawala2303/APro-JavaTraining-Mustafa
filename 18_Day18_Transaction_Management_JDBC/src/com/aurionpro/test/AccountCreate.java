package com.aurionpro.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.exceptions.NegativeAmountException;
import com.aurionpro.model.Account;
import com.aurionpro.model.DatabaseConnection;
import com.aurionpro.model.Savings;

public class AccountCreate{
    public void accCreation() {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        
        while (true) {
            System.out.println("\nBanking Application Menu:");
            System.out.println("Select one of the below options:\n");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Go to Transactions");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Holder's Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Balance (Min balance should be 500): ");
                    double balance = scanner.nextDouble();
                    if (balance < Savings.getMinimumBalance()) {
                        System.out.println("Initial balance must be at least 500");
                        break;
                    }
                    
                    Random rand = new Random();
                	String accNum = String.format("BOI" +"%010d" , rand.nextInt(1000000000));
                    
                    Account savingsAccount = new Savings(accNum, name, balance);
                    accounts.add(savingsAccount);
                    System.out.println("Savings Account Created! Account Number: " + savingsAccount.getAccountNumber());
                    
                    try (Connection connection = DatabaseConnection.getDatabseConnection().getConnection();)
            		{
            		String query = "INSERT into accounts (account_number,name,balance) values (?,?,?)";
            			
            			try(PreparedStatement prepareStatement = connection.prepareStatement(query))
            			{
            				prepareStatement.setString(1,savingsAccount.getAccountNumber());
            				prepareStatement.setString(2,name);
            				prepareStatement.setDouble(3,balance);
            				prepareStatement.executeUpdate();
            			}
            			
            			catch(NegativeAmountException e)
            			{
            				e.getMessage();
            			} 
            			
            			catch (SQLException e) 
            			{
            				System.out.println("SQL Exception occured");
            				e.getMessage();
            			}
            		
            		}
                    
                    catch (SQLException e1) 
                    {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
                    
                    break;
                    
                case 2:
                    System.out.println("Redirecting to Transactions Page....\n");
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
