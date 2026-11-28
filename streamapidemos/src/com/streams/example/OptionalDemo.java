package com.streams.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Raju","Jack","Kumaran","Rakesh","John","Raja","Anu");
		
		Optional <String> opt = names.stream()
		.filter(str->str.startsWith("N"))
		.findFirst();
		
		if(opt.isPresent())
		System.out.println(opt.get());
		else
			System.out.println("no value");
		
		String str1 = names.stream()
		.filter(str->str.startsWith("R"))
		.findFirst()
		.get();
		
		System.out.println(str1);
		
		String str2 = names.stream()
				.filter(str->str.startsWith("Q"))
				.findFirst()
				.orElse("No name presnet");
		
		System.out.println(str2);
				
	}

}
