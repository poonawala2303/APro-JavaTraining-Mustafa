package com.aurionpeo.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter file = new FileWriter("D:\\AurionPro_Mustafa_Java\\text.txt");
			
			try
			{
				file.write("Java is the best");
				file.close();
			}
			
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally
			{
				System.out.println("File Write Done");
			}

			
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
