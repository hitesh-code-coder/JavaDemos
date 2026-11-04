package com.oops.assignment;

public class Course 
{
	String title;
	double fees;
	public Course(String title, double fees) {
		super();
		this.title = title;
		this.fees = fees;
	}
	
	void printDetails()
	{
		System.out.println("The title of the course is : "+title+" and the fee for the course is "+fees);
	}

}
