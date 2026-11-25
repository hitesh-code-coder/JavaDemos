package com.inter.examples;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunDemo 
{
	public static void main(String[] args) 
	{
		
		Consumer<String> ref = (str) -> System.out.println(str);
		ref.accept("Hitesh");
		
		
		Supplier<String> sup = () -> "Have a greate day !!";
		System.out.println(sup.get());
		
		Consumer<Integer> sq = (num)->System.out.println(num*num);
		sq.accept(5);
		
		Supplier<Double> dob = ()-> 100.45;
		System.out.println(dob);
		
		
		Function<String, Integer> fun1 = str -> str.length();
		int res= fun1.apply("hello");
		System.out.println(res);
		
		Function<String, String> fun2 = str1 -> {return str1.substring(7).toUpperCase();};
		String str = fun2.apply("have a nice day");
		System.out.println(str);
		
		
	}
}
