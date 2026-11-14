package com.inter.basic;

public class BackendCourse implements ICourse{

	@Override
	public void showCourses() {
		System.out.println("Java backend Developer");	
		System.out.println("Python backend Developer");		

	}

	@Override
	public void courseDetails() {
		System.out.println("Spring, microservices, java");				
		
	}

	@Override
	public void jobSupport() {
		// TODO Auto-generated method stub
		System.out.println("job support in backendcourse");
	}
	
	
	

}
