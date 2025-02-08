package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Student;

public class Serialization {
	public static void main(String[] args) {
		
		try
		{
			Student s1 = new Student(83,"Mustafa");
			
			// Creating stream and writing text
			FileOutputStream fout = new FileOutputStream("file.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			
			out.close();
			System.out.println("Success");
		}
		
		catch (Exception e)
		{
			System.out.println("Error" + e);
		}
		
	}
}
