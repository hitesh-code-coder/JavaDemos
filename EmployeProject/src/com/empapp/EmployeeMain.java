package com.empapp;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		System.out.println(Employee.companyName);
		Employee manager = new Manager("Tom",2000,1,"IT");
		manager.printDetails();
		System.out.println(manager.calBonus(100));
		
		Manager man = (Manager)manager;
		String[] project = man.showProject();
		for(String pro:project)
			System.out.println(pro+",");
		
		
		Employee developer = new Developer("Jack",1000,10,"Honda");
		developer.printDetails();
		System.out.println(developer.calBonus(2000));
		
		Developer dev = (Developer) developer;
		dev.courseTaken("java","HTML","JS");
		
	}

}
