package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Shape;

public class ShapeTest 
{
	public static void main(String[] args) 
	{
		Shape shape = new Circle();
		
		Circle cirlce = new Circle();
		
		shape.area();
		
		Shape.display();
		shape.show();
		
		cirlce.display();
		
	}
}
