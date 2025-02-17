package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest 
{
	public static void main(String[] args) 
	{
		
		Map<Integer,String> students = new HashMap<Integer,String>();
		
		students.put(1,"Abc");
		students.put(2,"Xyz");
		students.put(3,"Lmn");
		students.put(4,"Pqr");
		
		System.out.println(students);
		
		Set< Entry <Integer,String> > studentEntries = students.entrySet();
		
		for (Entry entry : studentEntries)
		{
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
	}
}
