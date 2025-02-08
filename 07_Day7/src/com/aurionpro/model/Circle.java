package com.aurionpro.model;

//public class Circle extends Shape {
//	
//	double radius;
//
//	public Circle(double radius) {
//		this.radius = radius;
//	}
//
//	@Override
//	public void area() {
//		System.out.println("Area of circle is: " + (3.14*radius*radius));
//	}
//	
//}

public class Circle implements Shape {
	
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void area() {
		System.out.println("Area of circle is: " + (3.14*radius*radius));
	}
	
}
