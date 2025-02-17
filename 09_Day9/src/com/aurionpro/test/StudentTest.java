package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.comparator.AgeComparator;
import com.aurionpro.comparator.RollNumberComparator;
import com.aurionpro.model.Student;

public class StudentTest 
{
	
	public static void readStudents(List<Student> studentsList , Scanner inputVariable)
	{
		new ArrayList<Student>();
		
		System.out.println("How many students ? ");
		
		int size = inputVariable.nextInt();
		
		for(int i = 0; i<size ; i++)
		{
			System.out.println("Enter Roll Number of student: ");
			int rollNumber = inputVariable.nextInt();
			
			System.out.println("Enter Name of student: ");
			inputVariable.nextLine();
			String name = inputVariable.nextLine();
			
			System.out.println("Enter Age of student: ");
			int age = inputVariable.nextInt();
			
			studentsList.add(new Student(rollNumber,name,age));
		}
		
	}
	
	public static void printStudents(List<Student> studentsList)
	{
		
		for(int i = 0 ; i<studentsList.size(); i++)
		{
			System.out.println(studentsList);
		}
		
	}
	
	public static void main(String[] args) 
	{
		List<Student> studentsList = new ArrayList<Student>();
		Scanner inputVariable = new Scanner(System.in);
		
		readStudents(studentsList,inputVariable);
		printStudents(studentsList);
				
		System.out.println("After sorting according to Roll Number");
		
		Collections.sort(studentsList , new RollNumberComparator());
		printStudents(studentsList);
		
		System.out.println("After sorting according to Age");
		
		Collections.sort(studentsList , new AgeComparator());
		printStudents(studentsList);
	}
}
