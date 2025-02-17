package com.aurionpro.test;

import com.aurionpro.model.Shape;

public class ShapeTest 
{
	public static void main(String[] args)
	{
//		Shape circle = new Shape() {
//			
//			public void area()
//			{
//				System.out.println("Calculating area");
//			}
//		};
//		
//		circle.area();
		
		// Alternate short way using lambda expressions
		
		/* Shape circle = ()-> System.out.println("Calculating area of Circle");
		
		circle.area(); */
		
		// We can pass this "circle" to other fxn too as it is now a variable
		
		Shape circle = ()-> System.out.println("Calculating area of Circle");
		
		Shape rectangle = ()-> {
			
			int width = 20;
			int height = 30;
			System.out.println("Area of rectangle: " + width*height);
			
		};
		
		calculateArea(circle); 
		calculateArea(rectangle); 
		
	}
	
	public static void calculateArea(Shape shape)
	{
		shape.area();
	}
}
