package com.sristi.oops;

public class Student 
{
	String studentName;
	int studentId;
	String Department;
	
	public Student(String studentName, int studentId, String department) 
	{
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		Department = department;
	}
	
	void printDetails()
	{
		System.out.println("Student name is  : "+studentName);
		System.out.println("Student ID is  : "+studentId);
		System.out.println("Student Department is  : "+Department);
	}
	
	String greetMessage()
	{
		String result = "Welcome " + studentName;
		return result;
	}
	
	 String[] showCourses() 
	 {

	        return new String[]{"Java", "Python", "Spring Boot"};

	 }

}
