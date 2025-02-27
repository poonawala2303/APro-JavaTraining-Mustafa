package com.aurionpro.model;
import com.aurionpro.exceptions.InsufficientStockException;
import com.aurionpro.exceptions.InvalidProductException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Inventory_Transactions 
{
	private List<Transaction> transactions;
	private List<Product> products;
	
	public Inventory_Transactions()
	{
		products = new ArrayList<>();
		transactions = new ArrayList<>();
	}
	
	public String generateUniqueId(String type)
	{
		return type + "-" + UUID.randomUUID().toString();
	}
	
	public void addStock(List<Product> products,String productId,int quantity)
	{
		for(Product product : products)
		{
			if(product.getProductId().equals(productId))
			{
				product.setQuantity(product.getQuantity() + quantity);
				transactions.add(new Transaction(generateUniqueId("TXN"),productId,"ADD",quantity,LocalDate.now()));
				System.out.println("Stock added successfully!!");
				break;
			}
			
			else
			{
				throw new InvalidProductException("Invalid Product Entered");
			}
		}
	}
	
	public void removeStock(String productId,int quantity)
	{
		for(Product product : products)
		{
			if(product.getProductId().equals(productId))
			{
				checkQuantity(product,productId,quantity);
				break;
			}
			
			else
			{
				throw new InvalidProductException("Invalid Product Entered");
			}
		}
		
	}
	
	public void checkQuantity(Product product,String productId,int quantity)
	{
		if (product.getQuantity() >= quantity) 
		{
            product.setQuantity(product.getQuantity() - quantity);
            transactions.add(new Transaction(generateUniqueId("TXN"),productId,"REMOVE",quantity,LocalDate.now()));
            System.out.println("Stock removed successfully!");
        } 
		
		else 
		{
            throw new InsufficientStockException("Insufficient stock for product: " + productId);
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
			}
		}
		return history;
		
	}
	
	public void displaySummary(List<Product> products , List<Supplier> suppliers , List<Transaction> transactions) {
        System.out.println("Total Products: " + products.size());
        System.out.println("Total Suppliers: " + suppliers.size());
        System.out.println("Total Transactions: " + transactions.size());
    }
	
}
