package com.aurionpro.exceptions;

public class InsufficientStockException extends RuntimeException
{

	private static final long serialVersionUID = 1L;
	
	String message;
	
	public InsufficientStockException(String message)
	{
		this.message=message;
	}
	
	public String getMessage()
	{
		return "Insufficient Stock. Cant remove";
	}

}
