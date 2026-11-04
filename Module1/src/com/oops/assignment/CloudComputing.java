package com.oops.assignment;

public class CloudComputing extends Course 
{

	public CloudComputing(String title, double fees) 
	{
		super(title, fees);
		// TODO Auto-generated constructor stub
	}
	
	String category= "SAAS";
	
	void getTypes(String[] type)
	{
		for(String ty:type)
			System.out.println(ty+",");
	}

}
