package com.aurionpro.model;

public class PermanentStudentCalculations {
	
	private int studentId;
	private String name;
	private int mathMarks;
	private int englishMarks;
	private int scienceMarks;
	
	public PermanentStudentCalculations()
	{
		System.out.println("Default Constructor called");
	}

	public PermanentStudentCalculations(int studentId, String name, int mathMarks, int englishMarks, int scienceMarks) {
		this.studentId = studentId;
		this.name = name;
		this.mathMarks = mathMarks;
		this.englishMarks = englishMarks;
		this.scienceMarks = scienceMarks;
	}

	// Getters and Setters
	
	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	
	// methods
	int totalMarks = 0;
	double percentage = 0.0;
	
	public int calculateTotalMarks()
	{
		totalMarks = mathMarks + scienceMarks + englishMarks;
		return totalMarks;
	}
	
	public double calculatePercentage()
	{
		percentage = ((double)totalMarks/300) * 100;
		return percentage;
	}
	
	char grade = '/';
	public char getGrade()
	{
		if(percentage>75)
		{
			grade = 'A';
		}
		
		else if(percentage > 60 && percentage <75)
		{
			grade = 'B';
		}
		
		else if(percentage > 40 && percentage <60)
			
		{
			grade = 'C';
		}
		
		else
		{
			grade = 'F';
		}
		
		return grade;
	}
	
}
