package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Movie;
import com.aurionpro.model.MovieManager;

public class MovieController {
	
	private MovieManager manager;
	Movie movie = null;
	
	public MovieController()
	{
		manager = new MovieManager();
	}
	
	public void start() 
	{
		displayMenu();
	}
	
	private void displayMenu() 
	{
		Scanner inputVariable = new Scanner(System.in);
		
		while(true)
		{
            System.out.println("\nMovie Store Menu:");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Delete All Movies");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            int choice = inputVariable.nextInt();
            inputVariable.nextLine();  // Consume newline
            
            switch (choice) 
            {
            
            case 1:
                setMovieDetails(inputVariable);
                break;
            case 2:
                displayMovies();
                break;
            case 3:
                manager.deleteAllMovies();
                break;
            case 4:
                System.out.println("Exiting application.");
                inputVariable.close();
                return;
            default:
                System.out.println("Invalid choice. Try again.");
            }
            
		}
		
	}
	
	private void setMovieDetails(Scanner inputVariable)
	{
        int id = manager.getMovieId();
        
        System.out.print("Enter Movie Name: ");
        String name = inputVariable.nextLine();

        System.out.print("Enter Release Year: ");
        int year = inputVariable.nextInt();
        inputVariable.nextLine();  

        System.out.print("Enter Genre: ");
        String genre = inputVariable.nextLine();

        movie = new Movie(id, name, year, genre);
        manager.addMovie(movie);
    }
	
	private void displayMovies() 
	{
        System.out.println("\nMovies List:");
        for (Movie movie : manager.getMovies()) 
        {
            System.out.println(movie);
        }
    }
	
	
	public static void main(String[] args) throws Exception 
	{
		 new MovieController().start();
	}
}
