package com.inter.basic;

public class InterClient {

	public static void main(String[] args) 
	{

		ICourse backend = new BackendCourse();
		backend.courseDetails();
		backend.showCourses();
		backend.jobSupport();
		System.out.println();
		
		backend = new MeanCourse();
		backend.courseDetails();
		backend.showCourses();
		backend.jobSupport();
		
		
		ICourse.interviewSupport();
		
		
	}

}
