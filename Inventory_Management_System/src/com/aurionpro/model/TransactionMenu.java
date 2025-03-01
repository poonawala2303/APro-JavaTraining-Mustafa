package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.exceptions.InsufficientStockException;

public class TransactionMenu 
{
	public void transactionMenu()
	{
		Scanner scanner = new Scanner(System.in);
		Inventory_Transactions inventorytxn = new Inventory_Transactions();
		
		List<Product> products = new ArrayList<>();
	    List<Supplier> suppliers = new ArrayList<>();
	    List<Transaction> transactions = new ArrayList<>();
		
		while(true)
		{
			System.out.println("\n========== Welcome to Transaction Menu !!! ==========\n");
			System.out.println("Enter 1 to Add Stock");
			System.out.println("Enter 2 to Remove Stock");
			System.out.println("Enter 3 to View Transation History");
			System.out.println("Enter 4 to View Summary");
			System.out.println("Enter 5 to Exit");
			
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			
			case 1:
				System.out.print("Enter Product Id: ");
				scanner.nextLine();
				String addStockProdId = scanner.nextLine();
				System.out.print("Enter Quantity to Add: ");
				int addQuantity = scanner.nextInt();
                inventorytxn.addStock(products,addStockProdId, addQuantity);
                
				break;
			
			case 2:
				System.out.print("Enter Product ID: ");
				scanner.nextLine();
                String removeStockProdId = scanner.nextLine();
                System.out.print("Enter Quantity to Remove: ");
                int removeQuantity= scanner.nextInt();
                try
                {
//                	inventorytxn.removeStock(removeStockProdId, removeQuantity);
                }
                catch(InsufficientStockException e)
                {
                	System.out.println(e.getMessage());
                }
				break;
			
			case 3:
				System.out.print("Enter Product Id: ");
				String transactionProductId = scanner.nextLine();
				List<Transaction> history = inventorytxn.viewTransactionHistory(transactionProductId);
				for (Transaction transaction : history) 
				{
                    System.out.println(transaction);
                }
				break;
			
			case 4:
				System.out.println("Summary");
				inventorytxn.displaySummary(products, suppliers, transactions);
				break;
				
			case 5:
				System.out.print("Exiting Transaction Menu!!!\n ");
				return;
				
			default:
					System.out.println("Invalid Choice. Please enter valid choice!!");
			}
		}
		
	}
}
