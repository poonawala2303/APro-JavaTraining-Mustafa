package com.aurionpro.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.adapter.model.Biscuit;
import com.aurionpro.adapter.model.Chocolate;
import com.aurionpro.adapter.model.HatAdapter;
import com.aurionpro.adapter.model.Iitem;

public class ShoppingCart 
{
	public static void main(String[] args) 
	{
		List<Iitem> items = new ArrayList<>();
		
		items.add(new HatAdapter("Dam","Dammer",130,30));
		items.add(new Biscuit("ParleG",50));
		items.add(new Chocolate("Cadbury",130));
		
		System.out.println("Shopping Cart:\n ");
		System.out.println("Name         Price");
		
		for(Iitem item : items)
		{
			System.out.println(item.displayName() + "    " + item.displayFinalPrice());
		}
		
		double grandTotal = items.stream().mapToDouble((item)-> item.displayFinalPrice()).sum();
		
		System.out.println("\nGrand Total: " +grandTotal);
	}
}
