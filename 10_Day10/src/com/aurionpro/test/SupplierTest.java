package com.aurionpro.test;

import java.util.function.Supplier;

public class SupplierTest 
{
	
	public static void main(String[] args) 
	{
		Supplier<Integer> randomSupplier = ()-> (int) (Math.random()*1000);
		
		System.out.println(randomSupplier.get());
	}
	
}
