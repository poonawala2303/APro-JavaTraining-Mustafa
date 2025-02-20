package com.aurionpro.iterator.model;

import java.util.List;

public class SalaryIterator implements IIterator 
{
	
	private List<Employee> sortedList;
    private int index;

	public SalaryIterator()
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
