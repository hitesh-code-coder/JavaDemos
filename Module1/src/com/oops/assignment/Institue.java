package com.oops.assignment;

public class Institue {

	public static void main(String[] args) 
	{

		Course course = new Course("Hello", 1000);
		course.printDetails();
		
		WebCourse webcourse = new WebCourse("Test",101);
		String[] arr = webcourse.showTopics();
		for(String ar:arr)
			System.out.println(ar+",");
		
		CloudComputing cloud = new CloudComputing("Jain",102);
		cloud.getTypes(arr);
	}

}
