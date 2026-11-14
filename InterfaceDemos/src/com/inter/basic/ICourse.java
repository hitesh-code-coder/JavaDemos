package com.inter.basic;

public interface ICourse 
{
	
	void showCourses();
	void courseDetails();

	static void interviewSupport()
	{
		System.out.println("Provide interview support");
	}
	
	default void jobSupport()
	{
		System.out.println("check on job support");
	}
}
