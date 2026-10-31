package com.sristi.oops;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		//object creation
		Employee employee = new Employee();
		
		//print name and salary
		System.out.println(employee.empName+ " " + employee.empId);
		
		//assign values
		employee.empName = "Ravi";
		employee.empId = 100;
		employee.salary = 1000;
		
		System.out.println(employee.empName + "  " +employee.empId + "    " + employee.salary);
		
		
		Employee employee1 = new Employee();
		employee1.empName = "Rama";
		employee1.empId = 110;
		employee1.salary = 1050500;
		
		System.out.println(employee1.empName + "  " +employee1.empId + "    " + employee1.salary);

		
	}


}
