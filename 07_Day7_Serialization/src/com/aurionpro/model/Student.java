package com.aurionpro.model;
import java.io.Serializable; // interface for serialization

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public int id;
	public transient String name; // transient means we dont want to serialize it
	
	public Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}
