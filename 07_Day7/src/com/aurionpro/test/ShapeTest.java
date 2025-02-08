package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Circle circle = new Circle(10);
		circle.area();
		
		Triangle triangle = new Triangle(32,44);
		triangle.area();
		
		Rectangle rectangle = new Rectangle(20,45);
		rectangle.area();
	}
}
