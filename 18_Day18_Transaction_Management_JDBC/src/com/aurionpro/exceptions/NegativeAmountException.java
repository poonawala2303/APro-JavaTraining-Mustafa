package com.aurionpro.exceptions;

public class NegativeAmountException extends RuntimeException
{

	private static final long serialVersionUID = 1L;
	
	public String getMessage()
	{
		return "Amount entered is in Negative. Please enter positive amount";
	}
}
