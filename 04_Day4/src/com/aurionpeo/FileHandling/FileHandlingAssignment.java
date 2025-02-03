package com.aurionpeo.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssignment {
	public static void main(String[] args) {
		
		Scanner inputVariable = new Scanner(System.in);
		
		System.out.print("Enter the name of the file: ");
		String fileName = inputVariable.nextLine();
		
		int lineCount = 0;
		int charCount = 0;
		int wordCount = 0;
		
		try
		{
			File file = new File("D:\\AurionPro_Mustafa_Java\\" +fileName);
			FileReader fr = new FileReader("D:\\AurionPro_Mustafa_Java\\" +fileName);
			BufferedReader br = new BufferedReader(fr);
			
			if (file.exists())
			{
				String lines;
				while((lines = br.readLine()) != null)
				{
					
					// Counting the Lines
					
					lineCount++;
					
					// Splitting the line into words with the help of array.
					
					String[] words = lines.split(" ");
					wordCount += words.length ;
					
					// Counting the characters
					
					for(String word: words)
					{
						charCount += word.length();
					}
				}					
				
				System.out.println("Line Count: " + lineCount);
				System.out.println("Character Count: " + charCount);
				System.out.println("Word Count: " + wordCount);
				
			}
			
//			else
//			{
//				System.out.println("File not found. Enter valid name of the file");
//			}
		
		}
		
		catch (IOException e)
		{
			System.out.println("\nFile not found. Enter valid name of the file");
		}
		
		finally
		{
			System.out.println("\nProgram Over");
		}
		
	}
}