package com.inher.quest3;

public class Cube extends Figures 
{

	@Override
	void volume(int x, int y) 
	{
		super.volume(x, y);
		System.out.println("Volume of cube is : " + x*x );
		
	}
	

}
