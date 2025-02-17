package com.aurionpro.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates 
{
    
	public static void main(String[] args) 
	{
        
		Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<String>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) 
        {
            stringList.add(scanner.nextLine());
        }
        
        ArrayList<String> uniqueList = removeDuplicates(stringList);

        System.out.println("\nList after removing duplicates:");
        
        for (String str : uniqueList) 
        {
            System.out.println(str);
        }

        scanner.close();
    }

    private static ArrayList<String> removeDuplicates(ArrayList<String> list) 
    {
        return new ArrayList<String>(new LinkedHashSet<String>(list));
    }
}
