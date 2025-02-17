package com.aurionpro.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.aurionpro.model.Student;

public class SetTest 
{
	public static void main(String[] args) 
	{
		Set<Integer> rollNumber= new HashSet<Integer>();
		
		rollNumber.add(11);
		rollNumber.add(21);
		rollNumber.add(1);
		rollNumber.add(41);
		
		System.out.println(rollNumber);
		
		Set<Integer> rollNumber1= new LinkedHashSet<Integer>();
		
		rollNumber1.add(11);
		rollNumber1.add(21);
		rollNumber1.add(1);
		rollNumber1.add(41);
		
		System.out.println(rollNumber1);
		
		Set<Student> student= new TreeSet<Student>();
		
		student.add(new Student(1,"abc",34));
		student.add(new Student(3,"pqr",24));
		student.add(new Student(2,"lmn",25));
		
		System.out.println(student);
	}
}
