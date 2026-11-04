package com.inher.quest1;

public class CompanyMain 
{
	public static void main(String args[])
	{
		Project project = new TeamOne();
		project.doTask();
		
		TeamOne teamone = (TeamOne)project;
		teamone.softwaresUsed(args);
		
		Project project1 = new TeamTwo();
		project1.doTask();
		
		TeamTwo teamtwo = (TeamTwo) project1;
		String[] ar = teamtwo.getTechStack();
		
		for(String sr : ar)
			System.out.print(sr + ",");
	}

}
