package com.inher.quest3;

import java.util.Scanner;

public class OverMain {
	

	public static void main(String[] args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Finding the volumes of Cube,Cuboid,Oval and Cylinder:");
		
		System.out.println("Enter one side value for cube : ");
		int x = scr.nextInt();
		Figures cube = new Cube();
		cube.volume(x, x);
		
		System.out.println("Enter length, bredth and height for cuboid : ");
		int length = scr.nextInt();
		int bredth = scr.nextInt();
		Figures cuboid = new Cuboid();
		cuboid.volume(length, bredth);
		
		System.out.println("Enter semi access side of oval ");
		int s1 = scr.nextInt();
		int s2 = scr.nextInt();
		Figures oval = new Oval();
		oval.volume(s1, s2);
		
		System.out.println("Enter radius and height of cylinder ");
		int r = scr.nextInt();
		int h = scr.nextInt();
		
		Figures cylinder = new Cylinder();
		cylinder.volume(r, h);
		
		scr.close();
		
		
	}

}
