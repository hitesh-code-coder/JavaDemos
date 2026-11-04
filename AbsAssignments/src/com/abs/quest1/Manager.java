package com.abs.quest1;

public abstract class Manager extends Employee {
	
	public Manager(String empName, double salary, int empId) 
	{
		super(empName, salary, empId);
		// TODO Auto-generated constructor stub
	}

	String activity = "Managing as a manager";
	
	

	@Override
	void printDetails() {
		System.out.println("The employee name is "+empName +" salary is "+salary+" and employee ID is : "+empId +" .Details from manager");
	}

	@Override
	String[] showCourses() {
		String[] course = {"Managment","hiering","Firing","Hike"};
		return course;
	}

	void funClub()
	{
		System.out.println("Activity "+activity);
	}

}
