package com.lamb.basic;

public class CalculatoMain 
{
	public static void main(String[] args) {
		
		ICalculator add = (x,y) -> System.out.println("Sum is "+(x+y));
		add.Calculate(5, 4);
		
		ICalculator prod = (x,y) -> System.out.println("Product is "+(x*y));
		prod.Calculate(5, 4);
		
		ICalculator dif = (x,y) -> System.out.println("difference is "+(x-y));
		dif.Calculate(5, 4);
		
		ICalculator div = (x,y) -> System.out.println("division is "+(x/y));
		div.Calculate(8, 4);
		
		ICalculator rem = (x,y) -> System.out.println("reminder is "+(x%y));
		rem.Calculate(5, 4);
		
		Ishape sq = (x,y)->{ System.out.println("Area of square");
			return x*x;};
		double area =sq.area(4, 5);
			System.out.println(area);
			
			Ishape rec = (x,y)-> x*y;
			System.out.println("rectagle area is "+rec.area(10, 20));
			
			System.out.println("Showcourse....");
			System.out.println();
			
			ICourse backend = ()->new String[] {"java","C","C#"};
			String[] back = backend.showCourse();
			System.out.println("Backend courses");
			for(String ba:back)
			System.out.print( ba + ",");
			System.out.println();
			
			ICourse frontend = ()->new String[] {"JS","HTML","CSS"};
			String[] front = frontend.showCourse();
			System.out.println("Frontend courses");
			for(String fr:front)
			System.out.print(fr + ",");
			System.out.println();

			
			ICourse testing = ()->new String[] {"SELANIUM","JAVATEST"};
			String[] test = testing.showCourse();
			System.out.println("Testing courses");
			for(String te:test)
			System.out.print( te + ",");
			System.out.println();
			
		
	}

}
