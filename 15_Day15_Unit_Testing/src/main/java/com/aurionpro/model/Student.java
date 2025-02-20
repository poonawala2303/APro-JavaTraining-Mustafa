package com.aurionpro.model;

public class Student 
{
	
	StudentMarksService studentMarksService;
	
	public Student(StudentMarksService studentMarksService) 
	{
		this.studentMarksService = studentMarksService;
	}

	public double getAverageMarks()
	{
		return studentMarksService.getTotalMarks() / studentMarksService.getTotalSubjects();
	}
	
}
