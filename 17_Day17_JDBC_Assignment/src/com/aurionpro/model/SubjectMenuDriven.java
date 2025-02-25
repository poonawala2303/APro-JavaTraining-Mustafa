package com.aurionpro.model;

import java.util.Scanner;

public class SubjectMenuDriven {
    Scanner scanner = new Scanner(System.in);
    SubjectOperations operation = new SubjectOperations();

    public void startSubjectMenu() 
    {  
        while (true) {
            System.out.println("1. Create Subject");
            System.out.println("2. Read Subject");
            System.out.println("3. Update Subject");
            System.out.println("4. Delete Subject");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Subject Id: ");
                    int subId = scanner.nextInt();

                    System.out.print("Enter Subject Name: ");
                    scanner.nextLine(); // Consume newline
                    String subName = scanner.nextLine();

                    System.out.print("Enter Teacher Id: ");
                    int teacherId = scanner.nextInt();

                    operation.createSubject(subId, subName, teacherId);
                    break;
                case 2:
                    operation.readSubject();
                    break;
                case 3:
                    System.out.print("Enter Subject Id: ");
                    subId = scanner.nextInt();

                    System.out.print("Enter Subject Name to Update: ");
                    scanner.nextLine();
                    subName = scanner.nextLine();
                    operation.updateSubject(subId, subName);
                    break;
                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    subId = scanner.nextInt();
                    operation.deleteSubject(subId);
                    break; 
                case 5:
                    System.out.println("Thank You...\n");
                    return;
                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }
}
