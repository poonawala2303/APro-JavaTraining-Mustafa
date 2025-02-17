package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentTest 
{
	static Scanner input = new Scanner(System.in);
	static Map<Integer,String> students = new HashMap<Integer,String>();
	
	public static void main(String[] args) 
	{
		
		while(true)
		{
			System.out.println("Choose the following options: ");
			System.out.println("Enter 1 to add data ");
			System.out.println("Enter 2 to update data ");
			System.out.println("Enter 3 to delete data");
			System.out.println("Enter 4 to search for data");
			System.out.println("Enter 5 to display data");
			System.out.println("Enter 6 to exit");
			
			int choice = input.nextInt();
			
			if(choice == 6)
			{
				System.out.println("Thanks ");
				break;
			}
			
			switch(choice)
			{
			case 1:
				addData();
				break;
			case 2:
				updateData();
				break;
			case 3:
				deleteData();
				break;
			case 4:
				searchData();
				break;
			case 5:
				displayData();
				break;
			}
			
		}
		
	}
	
	public static void addData()
	{
      
		System.out.print("Enter the key: ");
		int key = input.nextInt();
		
		System.out.println("Enter the value corresponding to the key: ");
		input.nextLine();
		String value = input.nextLine();
		
		if (students.containsKey(key)) 
		{
	        System.out.println("Error: Employee ID already exists!");
		}
		
		students.put(key,value);
	}
	
	public static void updateData()
	{
		System.out.print("Enter ID to update: ");
		int key = input.nextInt();
		
		if (students.containsKey(key)) 
		{
            System.out.print("Enter New Employee Name: ");
            input.nextLine();
            String newName = input.nextLine();
            students.put(key, newName);
            System.out.println("Employee updated successfully.");
        } 
		
		else 
		{
            System.out.println("Error: Employee ID not found.");
        }
		
	}
	
	public static void deleteData() 
	{
        System.out.print("Enter Student ID to delete: ");
        int id = input.nextInt();

        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Student deleted successfully.");
        } 
        
        else 
        {
            System.out.println("Error: Student ID not found.");
        }
    }
	
	public static void searchData() {
        System.out.print("Enter Student ID to search: ");
        int id = input.nextInt();

        if (students.containsKey(id)) {
            System.out.println("Student ID: " + id + ", Name: " + students.get(id));
        } else {
            System.out.println("Error: Student ID not found.");
        }
    }

    public static void displayData() {
        if (students.isEmpty()) {
            System.out.println("No student found.");
        } else {
            System.out.println("\nStudent List:");
            for (Entry entry : students.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
                System.out.println("");
            }
        }
    }
	
}
