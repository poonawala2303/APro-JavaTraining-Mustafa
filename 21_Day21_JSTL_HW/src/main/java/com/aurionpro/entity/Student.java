package com.aurionpro.entity;

public class Student 
{

	private int rollNumber;
	private String name;
	private int age;
	
	public Student()
	{
		
	}
	
	public Student(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + "]";
	}

}
