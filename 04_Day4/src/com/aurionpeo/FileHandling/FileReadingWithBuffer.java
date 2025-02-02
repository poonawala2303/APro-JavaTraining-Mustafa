package com.aurionpeo.FileHandling;

import java.io.*;

public class FileReadingWithBuffer 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader file = new FileReader("D:\\AurionPro_Mustafa_Java\\text.java");
			BufferedReader buffer = new BufferedReader(file);
			
			try
			{
				int i;
				while ((i=buffer.read())!= -1)
				{
					System.out.print((char)i);
				}
			}
						
			finally
			{
				System.out.println("\n\nBuffer Read Done");
			}

			
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
