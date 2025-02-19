package com.aurionpro.composite.test;

import com.aurionpro.composite.model.ComplexComponent;
import com.aurionpro.composite.model.IComponent;
import com.aurionpro.composite.model.LeafComponent;

public class ComponentTest 
{
	public static void main(String[] args) 
	{
		IComponent hdd = new LeafComponent("HDD",4000);
		IComponent keyboard = new LeafComponent("Keyboard",500);
		IComponent mouse = new LeafComponent("Mouse",700);
		IComponent ram = new LeafComponent("RAM",4500);
		IComponent processor = new LeafComponent("Processor",7000);
		
		ComplexComponent computer = new ComplexComponent("Computer");
		
		ComplexComponent motherboard = new ComplexComponent("Motherboard");
		motherboard.add(ram);
		motherboard.add(processor);
		
		ComplexComponent cabinet = new ComplexComponent("Cabinet");
		cabinet.add(hdd);
		cabinet.add(motherboard);
		
		ComplexComponent peripherals = new ComplexComponent("Peripherals");
        peripherals.add(keyboard);
        peripherals.add(mouse);
        
        computer.add(cabinet);
        computer.add(peripherals);
        
        computer.showPrice();
	}
}
