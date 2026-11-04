package com.abs.quest1;

public abstract class Developer extends Employee {
	 String hobbies[] = {"coding","PR"};



	public Developer(String empName, double salary, int empId) 
	{
		super(empName, salary, empId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void showProjects() 
	{
		System.out.println("The project is ZCMS");
	}

	void showHobbies()
	{
		System.out.print("Hobies are :");
		for(String hobi :hobbies)
			System.out.print(hobi);
	}
}
