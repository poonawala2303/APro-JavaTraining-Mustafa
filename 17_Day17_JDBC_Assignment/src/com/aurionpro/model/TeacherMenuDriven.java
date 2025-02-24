package com.aurionpro.model;

import java.util.Scanner;

public class TeacherMenuDriven {
    Scanner scanner = new Scanner(System.in);
    TeacherOperations operation = new TeacherOperations();

    public void startTeacherMenu() 
    {  
        while (true) {
            System.out.println("1. Create Teacher");
            System.out.println("2. Read Teacher");
            System.out.println("3. Update Teacher");
            System.out.println("4. Delete Teacher");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Teacher Id: ");
                    int teacherId = scanner.nextInt();

                    System.out.print("Enter Teacher Name: ");
                    scanner.nextLine();
                    String teacherName = scanner.nextLine();

                    System.out.print("Enter Qualification: ");
                    String qualification = scanner.nextLine();

                    operation.createTeacher(teacherId, teacherName, qualification);
                    break;
                case 2:
                    operation.readTeacher();
                    break;
                case 3:
                    System.out.print("Enter Teacher Id: ");
                    teacherId = scanner.nextInt();

                    System.out.print("Enter Subject Name to Update: ");
                    scanner.nextLine();
                    teacherName = scanner.nextLine();
                    operation.updateTeacher(teacherId, teacherName);
                    break;
                case 4:
                    System.out.print("Enter Teacher Id to delete: ");
                    teacherId = scanner.nextInt();
                    operation.deleteTeacher(teacherId);
                    break; 
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