package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory 
{
	private List<Product> products;
	private List<Supplier> suppliers;
	private List<Transaction> transactions;
	
	public Inventory()
	{
		products = new ArrayList<>();
		suppliers = new ArrayList<>();
		transactions = new ArrayList<>();
	}
}
