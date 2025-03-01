package com.aurionpro.model;

import java.io.Serializable;

public class Supplier implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
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

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name + ", contactNo=" + contactNo + "]";
	}
		
}
