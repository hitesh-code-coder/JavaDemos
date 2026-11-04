package com.empapp;

public class Manager extends Employee 
{
	String department;

	public Manager(String empName, int empId, double salary,String department) {
		super(empName, empId, salary);
		this.department=department;
	}

	@Override
	double calBonus(double amount) 
	{
		System.out.println("bonus calculation for manager");
		return (amount*5);
	}
	
	String[] showProject()
	{
		String[] showProjecy = {"H&M","Honda","Dominos"};
		return showProjecy;
	}
	

}
