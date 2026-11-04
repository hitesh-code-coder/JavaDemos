package com.over.quest1;

public class Employee 
{
	String empName;
	String empDesignation;
	
	public Employee(String empName, String empDesignation) 
	{
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	
	void calcBonus(double basicAllowance)
	{
		System.out.println("The basic allowance is : "+basicAllowance);
	}
	
	void calcBonus(double basicAllowance, String gift)
	{
		System.out.println("The basic allowance is : "+ basicAllowance + " gift amount is : "+gift);
	}

	void calcBonus(double basicAllowance, String gift , double houseAllowance)
	{
		System.out.println("The basic allowance is : "+ basicAllowance + " gift amount is : "+gift + " and the house alloance is "+houseAllowance);
	}
	
}
