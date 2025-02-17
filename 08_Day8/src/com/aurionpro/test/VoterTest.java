package com.aurionpro.test;

import com.aurionpro.exceptions.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest 
{
	
	public static void main(String[] args) 
	{
		try
		{
			Voter voter1 = new Voter("Mustafa" , "MU1234",17);
			
			System.out.println(voter1);
		}
		
		catch(AgeNotValidException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
