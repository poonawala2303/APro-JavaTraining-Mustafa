package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentDetails {
	
	public static void main(String[] args) 
	{
		
		// Comment the below code out only if variables in Student class are public
		
//		Student s1 = new Student();
//		s1.name = "Mustafa";
//		s1.rollNumber = 83;
//		s1.marksScored = 165;
//		Student.displayDetails(s1.name , s1.rollNumber,s1.marksScored);
		
		// Follow the below code if variables of Student class are private
		
//		Student s1 = new Student();
//		
//		s1.setName("Mustafa");
//		System.out.println("Name is: " + s1.getName());
//		
//		s1.setRollNumber(83);
//		System.out.println("Roll Number is: " + s1.getRollNumber());
//		
//		s1.setMarksScored(275);
//		System.out.println("Marks Scored is: " + s1.getMarksScored());
		
		
		// Constructors concept
		
//		Student s1 = new Student("Mustafa");
//		
//		s1.displayDetails();
		
		// Copy constructors concept
		
		Student s1 = new Student("Mustafa" , 83 , 450);
		Student s2 = new Student(s1);
		
		s1.displayDetails();
		System.out.println("");
		s2.displayDetails();
	}
	
	
}
