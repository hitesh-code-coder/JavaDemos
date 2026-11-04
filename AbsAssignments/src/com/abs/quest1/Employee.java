package com.abs.quest1;

public abstract class Employee 
{
	String empName;
	double salary;
	int empId;
	final String COMPANYNAME="SRISTI";
	
	public Employee(String empName, double salary, int empId) 
	{
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}
	
	void printDetails()
	{
		System.out.println("The employee name is "+empName +" salary is "+salary+" and employee ID is : "+empId);
	}
	
	abstract  void calcBonus(double amount);
	
	String[] showCourses()
	{
		String[] course = {"java","JS","Mecanical","EC"};
		return course;
	} 
	
	abstract  void showProjects(); 
	
	final void showRules()
	{ 
	      officeHours();   // call the private method 
	      System.out.println("leave policies"); 
	      System.out.println("od policies"); 
	} 
	
	private void officeHours()
	{
		System.out.println("14 hours per day");
	}

}
