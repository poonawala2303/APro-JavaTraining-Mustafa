package com.aurionpro.model;

import java.io.Serializable;

public class Movie implements Serializable
{
	
	// Variables
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int year;
	private String genre;
	
	// Constructors
	
	public Movie() 
	{
		
	}
	
	public Movie(int id, String name, int year, String genre) 
	{
		this.id = id;
		this.name = name;
		this.year = year;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie Id= " + id + ", Movie Name= " + name + ", Year of Release= " + year + ", Genre= " + genre + "]";
	}
	
}
