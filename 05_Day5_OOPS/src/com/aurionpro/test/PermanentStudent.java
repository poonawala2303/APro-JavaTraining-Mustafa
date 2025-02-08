package com.aurionpro.test;

import com.aurionpro.model.PermanentStudentCalculations;

public class PermanentStudent {
	public static void main(String[] args) {
		
//		PermanentStudentCalculations student1 = new PermanentStudentCalculations();
		PermanentStudentCalculations student2 = new PermanentStudentCalculations(123,"Mustafa",78,74,70);
		PermanentStudentCalculations student3 = new PermanentStudentCalculations(345,"Vatsal",75,78,80);
		PermanentStudentCalculations student4 = new PermanentStudentCalculations(789,"ABC",25,30,40);
		
		System.out.println("Student 2 Info\n");
		
		System.out.println("Student ID: " + student2.getStudentId()); 
		System.out.println("Student Name: " + student2.getName()); 
		System.out.println("Math Marks: " + student2.getMathMarks()); 
		System.out.println("Science Marks: " + student2.getScienceMarks()); 
		System.out.println("English Marks: " + student2.getEnglishMarks()); 
		System.out.println("Total Marks: " + student2.calculateTotalMarks()); 
		System.out.println("Percentage: " + student2.calculatePercentage()); 
		System.out.println("Grade: " + student2.getGrade());
		
		System.out.println("\nStudent 4 Info\n");
		
		System.out.println("Student ID: " + student4.getStudentId()); 
		System.out.println("Student Name: " + student4.getName()); 
		System.out.println("Math Marks: " + student4.getMathMarks()); 
		System.out.println("Science Marks: " + student4.getScienceMarks()); 
		System.out.println("English Marks: " + student4.getEnglishMarks()); 
		System.out.println("Total Marks: " + student4.calculateTotalMarks()); 
		System.out.println("Percentage: " + student4.calculatePercentage()); 
		System.out.println("Grade: " + student4.getGrade());
		
	}
}
