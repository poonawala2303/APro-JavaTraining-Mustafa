package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest 
{
	Circle circle;
	
	@BeforeEach
	void init()
	{
		circle = new Circle();
	}
	
	@Test
	void calculateArea()
	{
		assertEquals(3.14, circle.calculateAreaOfCircle(1));
	}
	
}
