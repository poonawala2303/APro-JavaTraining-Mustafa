package com.aurionpro.exceptions;

public class InvalidProductException extends RuntimeException
{

	private static final long serialVersionUID = 1L;
	
	String message;
	
	public InvalidProductException(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return "Invalid product Id entered";
	}
}
