package com.aurionpro.exceptions;

public class MinimumBalanceException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public String getMessage()
	{
		return "Amount cant be withdrawn because the minimum Balance must be maintained";
	}

}
