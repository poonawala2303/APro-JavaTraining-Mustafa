package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.exceptions.InsufficientStockException;

public class ProductMenu 
{
	Scanner scanner = new Scanner(System.in);
	Inventory_Products inventoryprod = new Inventory_Products();

	public void productMenu()
	{
		
		while(true)
		{
			System.out.println("\n========== Welcome to Products Menu !!! ==========\n");
			System.out.println("Enter 1 to Add Product");
			System.out.println("Enter 2 to Update Product");
			System.out.println("Enter 3 to Delete Product");
			System.out.println("Enter 4 to View Product");
			System.out.println("Enter 5 to View All Products");
			System.out.println("Enter 6 to Add Stock");
			System.out.println("Enter 7 to Remove Stock");
			System.out.println("Enter 8 to View Transaction History");
			System.out.println("Enter 9 to Exit");
			
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1: // Adding Product
				System.out.print("Enter Product Id: ");
				scanner.nextLine();
				String productId = scanner.nextLine();
				System.out.print("Enter name of Product: ");
				String name = scanner.nextLine();
				System.out.print("Enter description: ");
				String description = scanner.nextLine();
				System.out.print("Enter Quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();
                inventoryprod.addProduct(new Product(productId,name,description,quantity,price));
				break;
			case 2:
				System.out.print("Enter Product ID: ");
				scanner.nextLine();
                String updateProductId = scanner.nextLine();
                System.out.print("Enter New Quantity: ");
                int newQuantity = scanner.nextInt();
                System.out.print("Enter New Price: ");
                double newPrice = scanner.nextDouble();
                inventoryprod.updateProduct(updateProductId, newQuantity, newPrice);
				break;
			case 3:
				System.out.print("Enter Product ID: ");
				scanner.nextLine();
				String deleteProductId = scanner.nextLine();
				inventoryprod.deleteProduct(deleteProductId);
				break;
			case 4:
				System.out.print("Enter Product ID: ");
				scanner.nextLine();
				String viewProductId = scanner.nextLine();	
				Product product = inventoryprod.viewProduct(viewProductId);
				if (product != null) 
				{
                     System.out.println(product);
                } 
				 
				else 
				{
                     System.out.println("Product not found.");
                }
				break;
			case 5:
				System.out.println("All Products: ");
				for(Product p : inventoryprod.viewAllProducts())
				{
					System.out.println(p);
				}
				break;
			
			case 6:
				addStock();
				break;
				
			case 7:
				removeStock();
				break;
				
			case 8:
				System.out.print("Enter Product Id: ");
				scanner.nextLine();
				String viewTxnProdId = scanner.nextLine();
				inventoryprod.viewTransactionHistory(viewTxnProdId);
				break;
				
			case 9:
				System.out.println("Exiting Products Menu !!!!");
				return;
				
				default:
					System.out.println("Invalid Choice. Please enter valid choice!!");
			}
		}
	}
	
	public void addStock() 
	{
		System.out.println("Adding Stock menu");
        System.out.print("Enter Product ID: ");
        scanner.nextLine();
        String id = scanner.nextLine();
        System.out.print("Enter Quantity to Add: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        inventoryprod.addStock(id, quantity);
    }
	
	public void removeStock()
	{
		System.out.print("Enter Product ID: ");
		scanner.nextLine();
        String id = scanner.nextLine();
        System.out.print("Enter Quantity to remove: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        try 
        {
			inventoryprod.removeStock(id, quantity);
		} 
        
        catch (InsufficientStockException e) 
        {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
