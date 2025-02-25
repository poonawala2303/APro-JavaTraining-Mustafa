package com.aurionpro.model;

import java.util.Scanner;

public class StartProgram 
{
    static Scanner scanner = new Scanner(System.in);

    public void start() 
    {  
        while (true) 
        {
        	System.out.println("~~~~~~~~~~~~~ Welcome to College Management System ~~~~~~~~~~~~~");
            System.out.println("1. Student Operations");
            System.out.println("2. Subject Operations");
            System.out.println("3. Teacher Operations");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    StudentMenuDriven student = new StudentMenuDriven();
                    student.startStudentMenu();
                    break;
                case 2:
                    SubjectMenuDriven subject = new SubjectMenuDriven();
                    subject.startSubjectMenu();
                    break;
                case 3:
                    TeacherMenuDriven teacher = new TeacherMenuDriven();
                    teacher.startTeacherMenu();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();  // Close the scanner before exiting
                    System.exit(0);
                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }
}
