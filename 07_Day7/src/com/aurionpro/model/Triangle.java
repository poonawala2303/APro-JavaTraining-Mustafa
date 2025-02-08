package com.aurionpro.model;

//public class Triangle extends Shape {
//	double height ;
//	double base;
//	
//	public Triangle(double height, double base) {
//		super();
//		this.height = height;
//		this.base = base;
//	}
//
//	@Override
//	public void area() {
//		System.out.println("Area of Triangle is: " + (0.5*height*base));		
//	}
//		
//}

public class Triangle implements Shape {
	double height ;
	double base;
	
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

	public void area() {
		System.out.println("Area of Triangle is: " + (0.5*height*base));		
	}
		
}
