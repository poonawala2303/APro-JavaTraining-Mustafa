package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	
	public static void main(String[] args) 
	{
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers);
		
		System.out.println(numbers.get(1));
		
		System.out.println("Using normal For Loop");
		
		for (int i = 0; i<numbers.size() ; i++)
		{
			System.out.print(numbers.get(i) + " ");
		}
		
		System.out.println("");
		
		System.out.println("Using advanced for loop");
		
		for(Integer nums: numbers)
		{
			System.out.print(nums + " ");
		}
		
		System.out.println("");
		
		System.out.println("Using Iterator");
		
		Iterator<Integer> numberIterator = numbers.iterator();
		
		while(numberIterator.hasNext())
		{
			System.out.print(numberIterator.next() + " ");
		}
		
		System.out.println("");
		
		System.out.println("Using list iterator ( hasNext() and next() method )");
		
		ListIterator<Integer> numberListIterator = numbers.listIterator();
		
		while(numberListIterator.hasNext())
		{
			System.out.print(numberListIterator.next() + " ");
		}
		
		System.out.println("");
		
		System.out.println("Using list iterator ( hasPrevious() and previous() method )");
		
		while(numberListIterator.hasPrevious())
		{
			System.out.print(numberListIterator.previous() + " ");
		}
		
	}

}
