package com.aurionpro.decorator.test;

import com.aurionpro.decorator.model.CarInspection;
import com.aurionpro.decorator.model.ICarService;
import com.aurionpro.decorator.model.OilChange;
import com.aurionpro.decorator.model.WheelAlign;

public class CarServiceTest 
{
	public static void main(String[] args) 
	{
		ICarService car = new CarInspection();
		OilChange carOil = new OilChange(car);
		WheelAlign wheel = new WheelAlign(carOil);
		
		System.out.println(wheel.getCost());
	} 
}
