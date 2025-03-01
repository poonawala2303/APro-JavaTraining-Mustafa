package com.aurionpro.model;

import java.util.List;

public class DisplaySummary 
{
	
	public static int getTotalNumberOfProducts(Inventory_Products productManager) {
        List<Product> products = productManager.viewAllProducts();
        return products.size();
    }

    public static double getTotalStockValue(Inventory_Products productManager) {
        List<Product> products = productManager.viewAllProducts();
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getQuantity() * product.getPrice();
        }
        return totalValue;
    }
    
    public static int getTotalNumberOfSuppliers(Inventory_Supplier supplierManager) {
        List<Supplier> suppliers = supplierManager.viewAllSuppliers();
        return suppliers.size();
    }
    
}
