package com.aurionpro.test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.aurionpro.model.Book;

public class BookTest
{
	static Scanner input = new Scanner(System.in);
	
	public static void readBooks(Set<Book> bookSet , int numBooks)
	{
		
		for(int i = 0 ; i<numBooks ; i++)
		{
		
			System.out.println("Enter Book ISBN");
			String ISBN = input.nextLine();
			
			System.out.println("Enter Book Title");
			String title = input.nextLine();
			
			System.out.println("Enter Book Author");
			String author = input.nextLine();
			
			bookSet.add(new Book(ISBN,title,author));
			
		}
	}
	
	public static void main(String[] args) 
	{
		Set<Book> bookSet = new TreeSet<Book>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of books to input: ");
		String numBooks = input.nextLine();
		
		readBooks(bookSet , numBooks);
	}
}
