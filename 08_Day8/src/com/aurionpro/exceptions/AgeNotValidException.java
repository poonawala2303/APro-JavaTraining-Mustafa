package com.aurionpro.exceptions;

public class AgeNotValidException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private int age;

	public AgeNotValidException(int age) 
	{
		this.age = age;
	}



	public String getMessage()
	{
		return "Age not valid. Age is less than 18. The entered age was: " + age;
	}
	
}
