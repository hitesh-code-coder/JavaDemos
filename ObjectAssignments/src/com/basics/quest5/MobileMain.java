package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) 
	{
		Mobile mobile1 = new Mobile("a","a",29000);
		Mobile mobile2 = new Mobile("b","b",39000);
		Mobile mobile3 = new Mobile("c","c",49000);
		Mobile mobile4 = new Mobile("d","d",59000);
		Mobile mobile5 = new Mobile("e","e",69000);
		
		Mobile [] array = new Mobile[5];
		array[0]=mobile1;
		array[1]=mobile2;
		array[2]=mobile3;
		array[3]=mobile4;
		array[4]=mobile5;

		for(Mobile mobile:array)
			mobile.getDetails();
		
		for(int i = 0; i<array.length;i++)
		{
			if(array[i].brand.equalsIgnoreCase("a"));
			System.out.print(array[i].model);
		}
	}

}
