package com.aurionpro.model;

import java.util.Scanner;

public class StudentMenuDriven {
    Scanner scanner = new Scanner(System.in);
    StudentOperations operation = new StudentOperations();

    public void startStudentMenu() 
    {  
        while (true) {
            System.out.println("1. Create Student");
            System.out.println("2. Read Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();

                    System.out.print("Enter Name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    operation.createStudent(rollNumber, name, age);
                    break;
                case 2:
                    operation.readStudent();
                    break;
                case 3:
                    System.out.print("Enter Roll Number: ");
                    rollNumber = scanner.nextInt();

                    System.out.print("Enter Name to Update: ");
                    scanner.nextLine(); // Consume newline
                    name = scanner.nextLine();
                    operation.updateStudent(rollNumber, name);
                    break;
                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    rollNumber = scanner.nextInt();
                    operation.deleteStudent(rollNumber);
                    break; // Add missing break statement
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }
}
