package com.inher.quest3;

public class Oval extends Figures 
{

	@Override
	void volume(int x, int y) {
		super.volume(x, y);
		System.out.println("Need one more paramenter for volume of oval, that is semi- axis : ");
		int z = scanner.nextInt();
		double vol = ((4/3)*Math.PI*x*y*z);
		System.out.println("Volume of oval is : " + vol);
		scanner.close();
	}	
	

}
