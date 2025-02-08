package com.aurionpro.test;
import java.io.*;

import com.aurionpro.model.Student;

public class Deserialization {
	public static void main(String[] args) {
		
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
			Student s = (Student)in.readObject();
			
			System.out.println(s.id + " " + s.name);
			
			in.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Error " + e);
		}
		
	}
}
