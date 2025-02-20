package com.aurionpro.iterator.model;

import java.util.List;

public class NameIterator implements IIterator 
{
	private List<Employee> sortedList;
	int index;
	
	public NameIterator() 
	{
		
	}

	@Override
	public boolean hasNext() 
	{
		return true;
	}

	@Override
	public Employee next() 
	{
		return null;	
	}

}
