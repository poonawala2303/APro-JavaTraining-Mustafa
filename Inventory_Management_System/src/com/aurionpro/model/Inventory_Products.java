package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.exceptions.InvalidProductException;

public class Inventory_Products 
{
	private List<Product> products;
	
	public Inventory_Products()
	{
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product)
	{
		products.add(product);
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
	
}
