package com.sristi.oops;

public class StudentMain {

	public static void main(String[] args) 
	{
		Student student = new Student("Hari",100,"Java");
		student.printDetails();
		String hello = student.greetMessage();
		System.out.println(hello);
		
		String[] courses = student.showCourses();

        for (String course : courses) 
        {
            System.out.println(course);
        }

	}

}
