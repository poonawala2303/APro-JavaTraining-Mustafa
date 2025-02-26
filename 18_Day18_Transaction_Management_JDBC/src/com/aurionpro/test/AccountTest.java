package com.aurionpro.test;

import java.sql.SQLException;
import java.util.Scanner;


import com.aurionpro.model.TxnManager;

public class AccountTest 
{
	public static void main(String[] args) throws SQLException 
	{
				Scanner scanner = new Scanner(System.in);
				AccountCreate account = new AccountCreate();
				account.accCreation();
			 
		        System.out.println("Enter sender's account number:");
		        String fromAccount = scanner.nextLine();

		        System.out.println("Enter receiver's account number:");
		        String toAccount = scanner.nextLine();

		        System.out.println("Enter amount to transfer:");
		        double amount = scanner.nextDouble();

		        TxnManager.transferFunds(fromAccount, toAccount, amount);
		
	}
}