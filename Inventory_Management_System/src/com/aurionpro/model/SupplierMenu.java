package com.aurionpro.model;

import java.util.Scanner;

public class SupplierMenu 
{
	public void supplierMenu()
	{
		Inventory_Supplier inventorysupplier = new Inventory_Supplier();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n========== Welcome to Supplier Menu !!! ==========\n");
			System.out.println("Enter 1 to Add Supplier");
			System.out.println("Enter 2 to Update Supplier");
			System.out.println("Enter 3 to Delete Supplier");
			System.out.println("Enter 4 to View Supplier");
			System.out.println("Enter 5 to View All Suppliers");
			System.out.println("Enter 6 to Exit");
			System.out.print("\nEnter your choice: ");
			
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter Supplier Id: ");
				scanner.nextLine();
				String supplierId = scanner.nextLine();
				System.out.print("Enter Name of Supplier: ");
				String name = scanner.nextLine();
				System.out.print("Enter Contact Info: ");
				String contact = scanner.nextLine();
                inventorysupplier.addSupplier(new Supplier(supplierId,name,contact));
                
				break;
			case 2:
				System.out.print("Enter Supplier ID: ");
				scanner.nextLine();
                String updateSupplierId = scanner.nextLine();
                System.out.print("Enter New Contact Info: ");
                String newContactInfo = scanner.nextLine();
                inventorysupplier.updateSupplier(updateSupplierId, newContactInfo);
				break;
			case 3:
				System.out.print("Enter Supplier ID: ");
				String deleteSupplierId = scanner.nextLine();
				inventorysupplier.deleteSupplier(deleteSupplierId);
				break;
			case 4:
				System.out.print("Enter Supplier ID: ");
				scanner.nextLine();
				String viewSupplierId = scanner.nextLine();	
				Supplier supplier = inventorysupplier.viewSupplier(viewSupplierId);
				if (supplier != null) 
				{
                     System.out.println(supplier);
                } 
				 
				else 
				{
                     System.out.println("Supplier not found.");
                }
				break;
			case 5:
				System.out.println("All Suppliers: ");
				for(Supplier s : inventorysupplier.viewAllSuppliers())
				{
					System.out.println(s);
				}
				break;
			case 6:
				System.out.println("Exiting Suppliers Menu !!!!");
				return;
				
				default:
					System.out.println("Invalid Choice. Please enter valid choice!!");
			}
		}
	}
}
