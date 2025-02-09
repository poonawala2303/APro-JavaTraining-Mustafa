package com.aurionpro.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager 
{
	private List<Movie> movies;
	private static final String filePath = "D:\\AurionPro_Mustafa_Java\\movies.txt";
	
	public MovieManager()
	{
		movies = new ArrayList<Movie>();
		loadMovies();
	}
	
	public void addMovie(Movie movie)
	{
		if (movies.size() < 5)
		{
			movies.add(movie);
	        System.out.println("\nMovie added successfully!");
	        saveMovies();
		}
		
		else
		{
			System.out.println("App can only accomodate up to 5 movies");
		}
	}
	
	public List<Movie> getMovies()
	{
		return movies;
	}
	
	public int getMovieId()
	{
		return movies.size() + 1;
	}
	
	public void loadMovies()
	{
		File file = new File(filePath);
		
		if (!file.exists()) 
		{
            return; // If no file exists, we will start with an empty list
        }
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file)))
		{
			movies = (List<Movie>) in.readObject();
			System.out.println("Movies loaded successfully");
		}
		
		catch (Exception e)
		{
			System.out.println("Error");
		}
		
	}
	
	public void saveMovies()
	{
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath)))
		{
			out.writeObject(movies);
		}
		
		catch (Exception e)
		{
			System.out.println("Error");
		}
		
	}
	
	public void deleteAllMovies()
	{
		movies.clear();
        saveMovies();
        System.out.println("All movies deleted.");
	}
	
}
