//package com.aurionpro.model;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.time.LocalDate;
//import java.util.List;
//
//public class FileIO 
//{
//	public void saveData(List<Product> products , List<Supplier> suppliers , List<Transaction> transactions)
//	{
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\AurionPro_Mustafa_Java\\Inventory_Management_System\\inventory_data.txt")))
//		{
//			
//			for (Product product : products) 
//			{
//                writer.write("PRODUCT:" + product.getProductId() + "," + product.getName() + "," + product.getDescription() + "," + product.getQuantity() + "," + product.getPrice());
//                writer.newLine();
//            }
//			
//            for (Supplier supplier : suppliers) 
//            {
//                writer.write("SUPPLIER:" + supplier.getSupplierId() + "," + supplier.getName() + "," + supplier.getContactNo());
//                writer.newLine();
//            }
//            
//            for (Transaction transaction : transactions) 
//            {
//                writer.write("TRANSACTION:" + transaction.getTransactionId() + "," + transaction.getProductId() + "," + transaction.getType() + "," + transaction.getQuantity() + "," + transaction.getDate());
//                writer.newLine();
//            }
//            
//		}
//		
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public void loadData(List<Product> products , List<Supplier> suppliers , List<Transaction> transactions)
//	{
//		try(BufferedReader reader = new BufferedReader(new FileReader("D:\\AurionPro_Mustafa_Java\\Inventory_Management_System\\inventory_data.txt")))
//		{
//			String line;
//			while((line = reader.readLine()) != null)
//			{
//				String[] parts = line.split(":");
//				String type = parts[0];
//				String[] data = parts[1].split(",");
//				
//				switch(type)
//				{
//				case "PRODUCT":
//					products.add(new Product(data[0],data[1],data[2],Integer.parseInt(data[3]),Double.parseDouble(data[4])));
//					break;
//				case "SUPPLIER":
//					suppliers.add(new Supplier(data[0],data[1],data[2]));
//					break;
//				case "TRANSACTION":
//					transactions.add(new Transaction(data[0],data[1],data[2],Integer.parseInt(data[3]),LocalDate.parse(data[4])));
//					break;
//				}
//				
//			}
//		}
//		
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	
//}


package com.aurionpro.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIO 
{

    public static <T> void saveToFile(String fileName, List<T> items) 
    {
        File file = new File(fileName);
        
        try 
        {
            if (!file.exists()) 
            {
                file.createNewFile();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(items);
            out.close();
        } 
        
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

	@SuppressWarnings("unchecked")
	public static List<Product> loadProducts() 
	{
        File file = new File("D:\\AurionPro_Mustafa_Java\\Inventory_Management_System\\products.txt");
        List<Product> products = new ArrayList<>();
        
        if (!file.exists()) 
        {
            return products;
        }
        
        try (ObjectInputStream in= new ObjectInputStream(new FileInputStream(file))) {
            return (List<Product>) in.readObject();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
			
		}
        return new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
	public static List<Supplier> loadSuppliers() 
    {
        File file = new File("D:\\AurionPro_Mustafa_Java\\Inventory_Management_System\\suppliers.txt");
        List<Supplier> suppliers = new ArrayList<>();
        if (!file.exists()) 
        {
            return suppliers;
        }
        
        try (ObjectInputStream in= new ObjectInputStream(new FileInputStream(file))) 
        {
            return (List<Supplier>) in.readObject();
        } 
        
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        
        catch (ClassNotFoundException e) 
        {
			System.out.println("Error: " + e.getMessage());
		}
        return new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
	public static List<Transaction> loadTransactions() {
        File file = new File("D:\\AurionPro_Mustafa_Java\\Inventory_Management_System\\transactions.txt");
        List<Transaction> transactions = new ArrayList<>();
        if (!file.exists()) {
            return transactions;
        }
        try (ObjectInputStream in= new ObjectInputStream(new FileInputStream(file))) {
            return (List<Transaction>) in.readObject();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
			
		}
        return new ArrayList<>();
    }
}



