package com.sristi.array;

public class nameArr {

	public static void main(String[] args) {
		
		String [] name = new String[4];
		name[0] = "hitesh";
		name[1] = "ram";
		name[2] = "sham";
		name[3] = "ravi";
		
		for(String names : name)
		{
			System.out.println("Hello " + names.toUpperCase());
		}	
	}
}
