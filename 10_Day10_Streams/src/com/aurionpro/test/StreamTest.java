package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Aadit","Mustafa","Vatsal","Akshat"); 
		
//		List<String> names = new ArrayList<>();
//		
//		names.add("Aadit");
//		names.add("Mustafa");
//		names.add("Vatsal");
//		names.add("Akshat");
		
		System.out.println("Old List\n");
		
		names.stream().forEach((name)->{
			name = "BE " + name;
			System.out.println(name);
		});
		
		System.out.println("\nUpdated List\n");
		
		List<String> updatedNames = names.stream()
				.map((name)-> "B.Tech " + name)
				.collect(Collectors.toList()); 
		
		updatedNames.stream().forEach((name)-> System.out.println(name));
		
		List<Integer> numbers = Arrays.asList(20,30,15,25,40);
		
		// Sum of all numbers
		
		int sum = numbers.stream()
				.reduce(0,(x,y)-> x+y);
		
		System.out.println("\nSum of all numbers of List: " + sum);
		
		// Sum of even numbers
		
		int evenSum = numbers.stream()
			.filter((number) -> number%2==0)
			.reduce(0,(x,y)-> x+y);
		
		System.out.println("Sum of Even numbers: " + evenSum );
		
		// Sum of even numbers but only taking first 3 elements
		
		int evenUpTo3Sum = numbers.stream()
				.limit(3)
				.filter((number) -> number%2==0)
				.reduce(0,(x,y)-> x+y);
			
			System.out.println("Sum of Even numbers up to 1st three elements: " + evenUpTo3Sum );
	}
}
