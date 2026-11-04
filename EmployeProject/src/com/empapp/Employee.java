package com.empapp;

public class Employee 
{
	
	String empName;
	int empId;
	double salary;
	
	static String companyName ="ABC Tech";
	
	public Employee(String empName, int empId, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
	
	void printDetails()
	{
		System.out.println("Employee name is "+empName+" with ID "+empId+" and the salary is "+salary);
	}

	double calBonus(double amount)
	{
		System.out.println("Bonus calculation");
		return 0.0;
	}
}
