package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.DatabaseConnection;
import com.aurionpro.model.StudentMenuDriven;
import com.aurionpro.model.SubjectMenuDriven;
import com.aurionpro.model.TeacherMenuDriven;

public class DatabaseTest 
{
	static Scanner scanner = new Scanner(System.in);
	DatabaseConnection conn1 = DatabaseConnection.getDatabseConnection();
	
	public static void main(String[] args) 
	{
        while (true) 
        {
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
                    System.exit(0);
                default:
                    System.out.println("Invalid Option! Try again.");
            }
	}
	
}
	}
