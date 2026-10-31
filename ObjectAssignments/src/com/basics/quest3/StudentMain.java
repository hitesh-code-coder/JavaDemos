package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student name , ID,department and marks");
		
		String name = scanner.nextLine();
		int id = scanner.nextInt();
		scanner.nextLine();
		String department = scanner.nextLine();
		int marks[] = new int[5];
		for(int i =0; i<marks.length;i++)
			marks[i] = scanner.nextInt();
		
		Student student = new Student(name, department);
		student.printDetails();
		String grade = student.getGrades(marks);
		System.out.println("The grade of the student is "+ grade);
		
		scanner.close();
	}

}
