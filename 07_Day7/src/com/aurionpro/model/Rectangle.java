package com.aurionpro.model;

//public class Rectangle extends Shape{
//	double length;
//	double width;
//	
//	public Rectangle(double length, double width) {
//		this.length = length;
//		this.width = width;
//	}
//
//	@Override
//	public void area() {
//		System.out.println("Area of rectangle is: " + (length*width));		
//	}
//	
//	
//}

public class Rectangle implements Shape{
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void area() {
		System.out.println("Area of rectangle is: " + (length*width));		
	}
	
	
}
