package com.aurionpro.model;

public class Student
{
	
//	public String name;
//	public int rollNumber;
//	public int marksScored;
	
	private String name;
	private int rollNumber;
	private double marksScored;
	
	public void displayDetails()
	{
		System.out.println(name);
		System.out.println(rollNumber);
		System.out.println(marksScored);
	}
	
	// Copy constructors
	
	// default one 
	public Student()
	{
		this.name = "";
		this.rollNumber = 0;
		this.marksScored = 0;
	}
	
	// one with the parameters
	public Student(String name , int rollNumber , double marksScored)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.marksScored = marksScored;
	}
	
	// the copied one
	public Student(Student other)
	{
		this.name = other.name;
		this.rollNumber = other.rollNumber;
		this.marksScored = other.marksScored;
	}
	
// Declaring constructors
	
//	public Student() 
//	{
//		System.out.println("Default Constructor Called");
//	}
	
	public Student(String name) 
	{
		this.name = name;
	}
	
	public Student(int rollNumber) 
	{
		this.rollNumber = rollNumber;
	}

	public Student(double marksScored) 
	{
		this.marksScored = marksScored;
	}
	
	public Student(String name , int rollNumber)
	{
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public Student(int rollNumber , int marksScored)
	{
		this.rollNumber = rollNumber;
		this.marksScored = marksScored;
	}
	
	public Student(String name , double marksScored)
	{
		this.name = name;
		this.marksScored = marksScored;
	}
	
	public Student(String name , int rollNumber , int marksScored)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.marksScored = marksScored;
	}
	
	// Getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public double getMarksScored() {
		return marksScored;
	}

	public void setMarksScored(int marksScored) {
		this.marksScored = marksScored;
	}
	
}
