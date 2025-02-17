package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameStreamTest 
{
	
	
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh");
		
		// First 3 students sorted in ascending order
		
		List<String> ascendingList = names.stream()
										.sorted()
										.limit(3)
										.collect(Collectors.toList());
		
		System.out.println("First 3 students sorted in ascending order\n");
		ascendingList.stream().forEach((name)-> System.out.println(name));
		
		// First 3 students sorted in ascending order if it contains 'a'
		
		List<String> ascendingListContainA = names.stream()
				.sorted()
				.filter((name)->name.contains("a"))
				.limit(3)
				.collect(Collectors.toList());

		System.out.println("\nFirst 3 students sorted in ascending order if it contains 'a'\n");
		ascendingListContainA.stream().forEach((name)-> System.out.println(name));
		
		// Descending order
		
		List<String> descendingList = names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println("\nStudents sorted in desscending order\n");
		descendingList.stream().forEach((name)-> System.out.println(name));
		
		// First 3 characters of all names
		
		System.out.println("\nFirst 3 characters of all names\n");
		names.stream()
			 .forEach((name)-> System.out.println(name.substring(0,3)));
		
		// Names of students less than 4 chars
		
		List<String> lessThanFour = names.stream()
				.filter((name)->name.length()<=4)
				.collect(Collectors.toList());
		
		System.out.println("\nNames of students less than 4 chars\n");
		lessThanFour.stream().forEach((name)-> System.out.println(name));
		
	}
}
