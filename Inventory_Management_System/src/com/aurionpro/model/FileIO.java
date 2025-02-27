package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class FileIO 
{
	public void saveData(List<Product> products , List<Supplier> suppliers , List<Transaction> transactions)
	{
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("inventory_data.txt")))
		{
			
			for (Product product : products) 
			{
                writer.write("PRODUCT:" + product.getProductId() + "," + product.getName() + "," + product.getDescription() + "," + product.getQuantity() + "," + product.getPrice());
                writer.newLine();
            }
			
            for (Supplier supplier : suppliers) 
            {
                writer.write("SUPPLIER:" + supplier.getSupplierId() + "," + supplier.getName() + "," + supplier.getContactNo());
                writer.newLine();
            }
            
            for (Transaction transaction : transactions) 
            {
                writer.write("TRANSACTION:" + transaction.getTransactionId() + "," + transaction.getProductId() + "," + transaction.getType() + "," + transaction.getQuantity() + "," + transaction.getDate());
                writer.newLine();
            }
            
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void loadData(List<Product> products , List<Supplier> suppliers , List<Transaction> transactions)
	{
		try(BufferedReader reader = new BufferedReader(new FileReader("inventory_data.txt")))
		{
			String line;
			while((line = reader.readLine()) != null)
			{
				String[] parts = line.split(":");
				String type = parts[0];
				String[] data = parts[1].split(",");
				
				switch(type)
				{
				case "PRODUCT":
					products.add(new Product(data[0],data[1],data[2],Integer.parseInt(data[3]),Double.parseDouble(data[4])));
					break;
				case "SUPPLIER":
					suppliers.add(new Supplier(data[0],data[1],data[2]));
					break;
				case "TRANSACTION":
					transactions.add(new Transaction(data[0],data[1],data[2],Integer.parseInt(data[3]),LocalDate.parse(data[4])));
					break;
				}
				
			}
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
}
