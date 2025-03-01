package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory_Supplier 
{
	private List<Supplier> suppliers;
	private static String filePath = "D:\\AurionPro_Mustafa_Java\\Inventory_Management_System\\suppliers.txt";

	public Inventory_Supplier() 
	{
		suppliers = new ArrayList<>() ;
		suppliers = FileIO.loadSuppliers();
	}
	
	public void addSupplier(Supplier supplier)
	{
		suppliers.add(supplier);
		saveSuppliers();
	}
	
	public void updateSupplier(String supplierId,String contactInfo)
	{
		for (Supplier supplier: suppliers)
		{
			if(supplier.getSupplierId().equals(supplierId))
			{
				supplier.setSupplierId(contactInfo);
				saveSuppliers();
				break;
			}
		}
	}
	
	public void deleteSupplier(String supplierId)
	{
		suppliers.removeIf(supplier->supplier.getSupplierId().equals(supplierId));
		saveSuppliers();
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
	
	public void saveSuppliers() {
        FileIO.saveToFile(filePath, suppliers);
    }

	
}
