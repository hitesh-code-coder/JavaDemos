package com.basics.quest3;

public class Student 
{
	String studentName;
	String department;
	
	public Student(String studentName, String department) {
		super();
		this.studentName = studentName;
		this.department = department;
	}

	
	
	void printDetails()
	{
		System.out.println("The student name is "+studentName+ " and the depaertment is "+department);
	}

	String getGrades(int[] marks)
	{	
		String grade = null;
		int sum =0;
	
		for(int i =0;i<marks.length;i++)
		{
			sum = sum + marks[i];
		}
		
		int avg = sum/marks.length;;
		
		if(avg >= 90 && avg <= 100)
		    grade = "A";
		else if(avg >= 80)
		    grade = "B";
		else if(avg >= 70)
		    grade = "C";
		else if(avg >= 60)
		    grade = "D";
		else if(avg >= 50)
		    grade = "E";
		else
		    grade = "Fail";
		
		return grade;
		
	}
	
}
