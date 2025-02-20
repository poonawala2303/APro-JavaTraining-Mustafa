package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialCalculatorTest {

	FactorialCalculator fact = new FactorialCalculator();
	
	@Test
	void testFactorial() 
	{
		int actual = fact.factorial(5);
		
		assertEquals(120, actual,"Factorial function");
	}

}
