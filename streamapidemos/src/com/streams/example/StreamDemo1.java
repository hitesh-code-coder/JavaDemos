package com.streams.example;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("raju","jack","kumar","ram","sham","haha","baba");
		names.stream()
		.filter(str->str.startsWith("r")).forEach(str->System.out.println(str.toUpperCase()));
		
		System.out.println();
		
		names.stream()
		.filter(str->str.contains("a")).sorted().limit(3).forEach(str->System.out.println(str));
		
		names.stream().map(str->str.length()).forEach(inti->System.out.println(inti));
		
	}

}


