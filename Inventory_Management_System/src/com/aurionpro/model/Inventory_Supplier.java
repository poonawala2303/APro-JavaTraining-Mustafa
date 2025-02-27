package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory_Supplier 
{
	private List<Supplier> suppliers;

	public Inventory_Supplier() 
	{
		suppliers = new ArrayList<>() ;
	}
	
	public void addSupplier(Supplier supplier)
	{
		suppliers.add(supplier);
	}
	
	public void updateSupplier(String supplierId,String contactInfo)
	{
		for (Supplier supplier: suppliers)
		{
			if(supplier.getSupplierId().equals(supplierId))
			{
				supplier.setSupplierId(contactInfo);
				break;
			}
		}
	}
	
	public void deleteSupplier(String supplierId)
	{
		suppliers.removeIf(supplier->supplier.getSupplierId().equals(supplierId));
	}
	
	public Supplier viewSupplier(String supplierId)
	{
		for(Supplier supplier: suppliers)
		{
			if(supplier.getSupplierId().equals(supplierId))
			{
				return supplier;
			}
			
		}
		return null;
	}
	
	public List<Supplier> viewAllSuppliers()
	{
		return suppliers;
	}
	
}
