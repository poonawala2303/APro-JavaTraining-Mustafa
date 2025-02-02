package com.aurionpeo.FileHandling;

import java.util.*;
import java.io.*;

public class FileCreation {
	public static void main(String[] args)  
	{
		File file = new File("D:\\AurionPro_Mustafa_Java\\text.java");
		
		try 
		{
			if(file.createNewFile())
			{
				System.out.println("File created Succesfully");
			}
			
			else
			{
				System.out.println("File already Exists");
			}
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
			
		}
		
	}
}
