package com.training.quest1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter:\ns for Student \ne for Employee");
		String c = scr.nextLine().toLowerCase();
		
		
		switch(c)
		{
		case "s":{
					IInstitute student = new StudentCourses();
					String studcourse[] = student.showCourses();
					System.out.println("Student courses are :");
					for(String course:studcourse)
						System.out.print(course+",");
					break;
				}
		
		case "e":{
					IInstitute employee = new EmployeeCourses();
					String empcourse[]=employee.showCourses();
					System.out.println("Employee courses are :");
					for(String course:empcourse)
						System.out.print(course+",");

					break;
				 }
		
		default : System.out.println("Invalid option.");
		}
		scr.close();
	}

}
