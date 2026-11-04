package com.abs.quest1;

public abstract class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) 
	{
		super(empName, salary, empId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calcBonus(double amount) 
	{
		System.out.println("Final bonus amount is : "+ amount*amount);
	}

	void corporateServices()
	{
		System.out.println("Corporate service by Teamleads ");
	}
}
