package com.streams.example;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4 {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Raju","Jack","Kumaran","Rakesh","John","Raja","Anu");
		
		names.stream()
		.map(name->name.toUpperCase())
		.forEach(System.out::println);
		
		int sum = names.stream()
		.mapToInt(str ->str.length())
		.sum();
		System.out.println(sum);
		
	}

}
