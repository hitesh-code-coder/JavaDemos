package com.sristi.oops;

public class Course 
{
	String title;
	int courseId;
	String [] categories;

	public static void main(String[] args) 
	{
		
		Course course = new Course();
		course.title = "Java";
		course.courseId = 1;
        course.categories = new String[]{"backend", "fullstack"};

        System.out.println("The tital is : " +course.title);
        System.out.println("The course ID id : "+course.courseId);
        System.out.println("The categories of the course are : ");
        for(String s :course.categories)
        	System.out.println(s);

	}

}
