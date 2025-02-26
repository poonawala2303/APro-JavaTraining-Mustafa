package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.aurionpro.exceptions.MinimumBalanceException;

public class TxnManager 
{
    
    public static void transferFunds(String fromAccount, String toAccount, double amount) throws SQLException 
    {
        Connection conn = null;
        
        try 
        {
            conn = DatabaseConnection.getDatabseConnection().getConnection();
            conn.setAutoCommit(false);  // Start transaction

            // Check balance in sender's account
            double senderBalance = getBalance(conn, fromAccount);
            if (senderBalance - amount < Savings.getMinimumBalance()) 
            {
                throw new MinimumBalanceException();
            }

            // Debiting from sender
            updateBalance(conn, fromAccount, -amount);

            // Crediting to receiver
            updateBalance(conn, toAccount, amount);

            // Commiting the  transaction
            conn.commit();
            System.out.println("Transaction successful! Amount transferred: " + amount);
            
        } 
        
        catch (MinimumBalanceException e) 
        {
            if (conn != null) 
            {
                try 
                {
                    conn.rollback();
                    System.out.println("Transaction failed! Rolling back...");
                    e.getMessage();
                } 
                
                catch (SQLException rollbackEx) 
                {
                    rollbackEx.printStackTrace();
                }
            }
        } 
        
        finally 
        {
            if (conn != null) 
            {
                try 
                {
                    conn.setAutoCommit(true);
                    conn.close();
                } 
                
                catch (SQLException closeEx) 
                {
                    closeEx.printStackTrace();
                }
            }
        }
    }

    private static double getBalance(Connection conn, String accountNumber) throws SQLException 
    {
        String query = "SELECT balance FROM accounts WHERE account_number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) 
        {
            pstmt.setString(1, accountNumber);
            try (ResultSet rs = pstmt.executeQuery()) 
            {
                if (rs.next()) 
                {
                    return rs.getDouble("balance");
                }
            }
        }
        throw new SQLException("Account not found!");
    }

    private static void updateBalance(Connection conn, String accountNumber, double amount) throws SQLException 
    {
        String query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) 
        {
            pstmt.setDouble(1, amount);
            pstmt.setString(2, accountNumber);
            pstmt.executeUpdate();
        }
    }
}
