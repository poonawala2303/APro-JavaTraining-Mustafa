package com.aurionpro.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.aurionpro.exceptions.InsufficientStockException;
import com.aurionpro.exceptions.InvalidProductException;

public class Inventory_Products 
{
	private List<Product> products;
	private List<Transaction> transactions;
	private static String filePath = "D:\\AurionPro_Mustafa_Java\\Inventory_Management_System\\products.txt";
	private static String txnFilePath = "D:\\AurionPro_Mustafa_Java\\Inventory_Management_System\\transactions.txt";
	
	
	public Inventory_Products()
	{
		products = new ArrayList<>();
		products = FileIO.loadProducts();
		transactions = new ArrayList<>();
		transactions = FileIO.loadTransactions();
	}
	
	public void addProduct(Product product)
	{
		products.add(product);
		saveProducts();
	}
	
	public void updateProduct(String productId, int quantity, double price)
	{
		for(Product product : products)
		{
			try
			{
				if(product.getProductId().equals(productId))
				{
					product.setQuantity(quantity);
					product.setPrice(price);
					saveProducts();
					break;
				}
			}
			
			catch(InvalidProductException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		
	}
	
	public void deleteProduct(String productId)
	{
		products.removeIf(product -> product.getProductId().equals(productId));
		saveProducts();
	}
	
	public Product viewProduct(String productId)
	{
		for(Product product : products)
		{
			if(product.getProductId().equals(productId))
			{
				return product;
			}
		}
		return null;
	}
	
	public List<Product> viewAllProducts()
	{
		return products;
	}
	
	public String generateUniqueId(String type)
	{
		return type + "-" + UUID.randomUUID().toString();
	}
	
	public void addStock(String productId,int quantity)
	{
		for(Product product : products)
		{
			if(product.getProductId().equals(productId))
			{
				product.setQuantity(product.getQuantity()+quantity);
				transactions.add(new Transaction(generateUniqueId("TXN"),productId,"ADD",quantity,LocalDate.now()));
				System.out.println("Stock added successfully!!");
				saveProducts();
				saveTransactions();
				break;
			}
			
//			else
//			{
//				throw new InvalidProductException("Invalid Product Entered");
//			}
		}
	}
	
	public void removeStock(String productId,int quantity)
	{
		for(Product product : products)
		{
			if(product.getProductId().equals(productId))
			{
				if (product.getQuantity() >= quantity) 
				{
		            product.setQuantity(product.getQuantity() - quantity);
		            transactions.add(new Transaction(generateUniqueId("TXN"),productId,"REMOVE",quantity,LocalDate.now()));
		            System.out.println("Stock removed successfully!");
		            saveProducts();
		            saveTransactions();
		        } 
				
				else 
				{
		            throw new InsufficientStockException("Insufficient stock for product: " + productId);
		        }
				break;
			}
			
		}
		
	}
	
	public List<Transaction> viewTransactionHistory(String productId)
	{
		List<Transaction> history = new ArrayList<>();
		
		for(Transaction transaction : transactions)
		{
			if(transaction.getProductId().equals(productId))
			{
				history.add(transaction);
				saveTransactions();

			}
		}
		System.out.println(history);
		return history;
		
	}
	
	public void saveProducts() 
	{
        FileIO.saveToFile(filePath, products);
    }
	
	public void saveTransactions() {
        FileIO.saveToFile(txnFilePath, transactions);
    }
	
}
