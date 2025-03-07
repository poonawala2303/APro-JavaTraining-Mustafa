package com.aurionpeo.FileHandling;

import java.io.File;

public class FileInformation {
	public static void main(String[] args) 
	{
		File file = new File("D:\\AurionPro_Mustafa_Java\\text.txt");
		
		if(file.exists())
		{
			System.out.println("File Name: " + file.getName());
			System.out.println("Can be Read : " + file.canRead());
			System.out.println("Can Write : " + file.canWrite());
			System.out.println("Exists : " + file.exists());
			System.out.println("File Path : " + file.getPath());
			System.out.println("Absolute Path : " + file.getAbsolutePath());
			System.out.println("Is Hidden?: " + file.isHidden());
			System.out.println("Can Execute?: " + file.canExecute());
			
		}
		
		else
		{
			System.out.println("File does not Exist");
		}
		
	}
}
