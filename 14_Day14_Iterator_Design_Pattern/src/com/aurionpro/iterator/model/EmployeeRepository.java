package com.aurionpro.iterator.model;

import java.util.List;

public class EmployeeRepository implements IContainer 
{
	
	private List<Employee> employees;

	public EmployeeRepository(List<Employee> employees) 
	{
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public IIterator getNameIterator() 
	{
		return new NameIterator();
	}

	@Override
	public IIterator getSalaryIterator() 
	{
		return new SalaryIterator();
	}

}
