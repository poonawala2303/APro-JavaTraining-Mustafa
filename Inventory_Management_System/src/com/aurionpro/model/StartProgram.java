package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartProgram 
{
	public void start()
	{
		ProductMenu productMenu = new ProductMenu();
		SupplierMenu supplierMenu = new SupplierMenu();
		Scanner scanner = new Scanner(System.in);
		FileIO file = new FileIO();
		
		List<Product> products = new ArrayList<>();
		List<Supplier> suppliers = new ArrayList<>();
		List<Transaction> transactions = new ArrayList<>();
		
		while(true)
		{
			System.out.println("~~~~~~~~~~Inventory Management System~~~~~~~~~~\n");
			System.out.println("Enter 1 for Product Operations");
			System.out.println("Enter 2 for Supplier Operations");
			System.out.println("Enter 3 to Exit");
			
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				productMenu.productMenu();
				break;
			case 2:
				supplierMenu.supplierMenu();
				break;
			case 3:
				System.out.println("Exiting the application. Thank You!!");
				System.exit(0);
				
				default:
					System.out.println("Invalid Choice. Enter valid choice!!!");
			}
		}
		
	}
}
