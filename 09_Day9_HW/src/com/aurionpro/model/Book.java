package com.aurionpro.model;

public class Book implements Comparable<Book>
{
	private String ISBN;
	private String title;
	private String author;
	
	public Book(String ISBN, String title, String author) 
	{
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + "]";
	}

	public int compareTo(Book book) {
		
		return this.title.compareToIgnoreCase(book.title);
	}
	
}
