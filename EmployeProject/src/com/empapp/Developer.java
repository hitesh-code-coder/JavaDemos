package com.empapp;

public class Developer extends Employee 
{
	
	String Project;

	public Developer(String empName, int empId, double salary,String project) {
		super(empName, empId, salary);
		this.Project = project;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calBonus(double amount) {
		System.out.println("bonus calculation for developer");
		return (amount*2);
	}
	
	void courseTaken(String... course)
	{
		System.out.println("courses takem ny the developer are : ");
		for(String cour:course)
			System.out.print(cour+",");
	}

}
