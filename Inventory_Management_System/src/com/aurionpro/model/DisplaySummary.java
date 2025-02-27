package com.aurionpro.model;

import java.util.List;

public class DisplaySummary 
{
	public void displaySummary(List<Product> products , List<Supplier> suppliers , List<Transaction> transactions) {
        System.out.println("Total Products: " + products.size());
        System.out.println("Total Suppliers: " + suppliers.size());
        System.out.println("Total Transactions: " + transactions.size());
    }
}
