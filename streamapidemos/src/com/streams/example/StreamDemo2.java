package com.streams.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) 
	{
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> even = nums.stream()
		.filter(num->num%2 ==0).map(num->num*num).collect(Collectors.toList());
		
		even.stream().forEach(n->System.out.println(n));
	}

}
