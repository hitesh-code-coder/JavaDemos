package com.util.listcompair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		
		List <Employee> employees = Arrays.asList(
				new Employee("Hitesh",1,200,"Bangalore"),
				new Employee("Ram",2,2100,"Bangalore"),
				new Employee("Sham",3,2200,"Bangalore"),
				new Employee("Tam",4,2003,"Bangalore"),
				new Employee("hash",5,2004,"Bangalore")	
				);
		
		
		System.out.println("sorting by name");
		Comparator<Employee> com = new NameSort();
		Collections.sort(employees,com);
		
		for(Employee employee:employees)
			System.out.println(employee);
		
		System.out.println();
		System.out.println("sorting by salary");
		Collections.sort(employees, new SalarySort());
		
		for(Employee employee:employees)
			System.out.println(employee);
				
	}

}
