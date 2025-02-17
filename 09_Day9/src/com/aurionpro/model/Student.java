package com.aurionpro.model;

public class Student implements Comparable<Student>
{
	private int rollNumber;
	private String name;
	private int age;
	
	public Student()
	{
		
	}
	
	public Student(int rollNumber, String name, int age) 
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Roll Number = " + rollNumber + ", Name = " + name + ", Age = " + age + "\n";
	}

	public int compareTo(Student student) {
	
		return this.rollNumber - student.rollNumber;
	}
	
}
