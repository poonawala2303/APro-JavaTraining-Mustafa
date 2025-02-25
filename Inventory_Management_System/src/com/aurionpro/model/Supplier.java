package com.aurionpro.model;

public class Supplier 
{
	private String supplierId;
	private String name;
	private String contactNo;
	
	public Supplier(String supplierId, String name, String contactNo) 
	{
		this.supplierId = supplierId;
		this.name = name;
		this.contactNo = contactNo;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	
}
