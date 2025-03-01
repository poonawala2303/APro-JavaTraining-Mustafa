package com.aurionpro.model;
import java.util.Scanner;

public class StartProgram 
{
	Inventory_Products inventoryProducts;
	Inventory_Supplier inventorySuppliers;
	
	public StartProgram()
	{
		this.inventoryProducts = new Inventory_Products();
		this.inventorySuppliers = new Inventory_Supplier();
	}
	
	public void start()
	{
		ProductMenu productMenu = new ProductMenu();
		SupplierMenu supplierMenu = new SupplierMenu();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("~~~~~~~~~~Inventory Management System~~~~~~~~~~\n");
			System.out.println("Enter 1 for Product Operations");
			System.out.println("Enter 2 for Supplier Operations");
			System.out.println("Enter 3 for Generating Reports");
			System.out.println("Enter 3 to Exit");
			System.out.print("\nEnter your choice: ");
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
				generateReports();
				break;
			case 4:
				System.out.println("Exiting the application. Thank You!!");
				System.exit(0);
				
				default:
					System.out.println("Invalid Choice. Enter valid choice!!!");
			}
		}
		
	}
	
	private void generateReports() {
        System.out.println("\nGenerating Reports...");
        int totalProducts = DisplaySummary.getTotalNumberOfProducts(inventoryProducts);
        int totalSuppliers = DisplaySummary.getTotalNumberOfSuppliers(inventorySuppliers);
        double totalStockValue = DisplaySummary.getTotalStockValue(inventoryProducts);
        System.out.println("Total Products: " + totalProducts);
        System.out.println("Total Suppliers: " + totalSuppliers);
        System.out.println("Total Stock Value: " + totalStockValue);
    }
}
