package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {

	Operations operations;
	
	@BeforeEach
	void init()
	{
		operations = new Operations();
	}
	
	@Test
	void testAddition() {
		int actual = operations.addition(10, 30);
		
		assertEquals(40,actual,"This performs addition");
	}

	@Test
	void testSubtraction() {
		int actual = operations.subtraction(30, 20);
		
		assertEquals(10,actual,"This performs subtraction");
	}

	@Test
	void testMultiplicarion() {
		int actual = operations.multiplicarion(10, 30);
		
		assertEquals(300,actual,"This performs multiplication");
	}

	@Test
	void testDivision() {
		
//		int actual = operations.division(30, 0);
//		assertEquals(3,actual,"This performs division");
		
		assertThrows(ArithmeticException.class, ()->{operations.division(30, 0);});
		assertDoesNotThrow(()->{operations.division(30, 10);});
	}
	
	@Test
	void testIsEven()
	{
		assertTrue(operations.isEven(10));
		assertFalse(operations.isEven(5));
	}
	
}
