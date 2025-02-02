package com.aurionpeo.FileHandling;

import java.io.*;

public class FileReading 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader file = new FileReader("D:\\AurionPro_Mustafa_Java\\text.java");
			
			try
			{
				int i = 1;
				while ((i=file.read())!= -1)
				{
					System.out.print((char)i);
				}
			}
						
			finally
			{
				System.out.println("\n\nFile Read Done");
			}

			
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
