package com.aurionpro.model;

import com.aurionpro.exceptions.AgeNotValidException;

public class Voter {
	private String name;
	private String voterId;
	private int age;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getVoterId() 
	{
		return voterId;
	}
	
	public void setVoterId(String voterId) 
	{
		this.voterId = voterId;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		
		if(age<18)
			throw new AgeNotValidException(age);
		this.age = age;
		
	}
	
	public Voter(String name, String voterId, int age) 
	{
		
		this.name = name;
		this.voterId = voterId;
		
		if(age<18)
			throw new AgeNotValidException(age);
		this.age = age;
		
	}
	
	public String toString() 
	{
		return "Name = " + name + ", Voter Id = " + voterId + ", Age = " + age + "]";
	}
	
	
}
