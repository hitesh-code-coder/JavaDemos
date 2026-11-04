package com.inher.quest3;

public class Cuboid extends Figures 
{

	@Override
	void volume(int x, int y) {

		super.volume(x, y);
		System.out.println("Enter the height of cuboid : ");
		int height = scanner.nextInt();
		System.out.println("Volube of cuboid is : "+ (x*y*height));
	}
		
}
