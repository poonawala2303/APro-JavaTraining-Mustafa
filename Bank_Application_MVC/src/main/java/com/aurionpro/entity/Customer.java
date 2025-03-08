package com.aurionpro.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer 
{
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int userid;
	private List<BankAccount> accounts;
	
	public Customer() 
	{
		this.accounts = new ArrayList<>();
	}

	public Customer(int customerid , String firstName, String lastName, String email) 
	{
		this();
		this.customerId = customerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	public Customer(int customerid , String firstName, String lastName, String email,String password) 
	{
		this();
		this.customerId = customerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public Customer(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public Customer(String firstName, String lastName, String email, int userid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userid = userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getuserid() {
		return userid;
	}

	public void setuserid(int userid) {
		this.userid = userid;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerid(int customerid) {
		this.customerId = customerid;
	}
	
	public List<BankAccount> getAccounts() 
	{
	    return accounts;
	}

	public void addAccount(BankAccount account) 
	{
	    this.accounts.add(account);
	}
	
}
