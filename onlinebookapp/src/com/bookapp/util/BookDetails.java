package com.bookapp.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails 
{
	
	public static List<Book> showBooks()
	{
		return Arrays.asList(
				
				new Book("Java",1,"Katty",890,"tech",LocalDate.of(1998,10,20)),
				new Book("Java1",2,"Ram",990,"tech",LocalDate.of(2000,10,20)),
				new Book("Java2",3,"Katty",1890,"tech",LocalDate.of(1998,10,20)),
				new Book("Java3",4,"sham",800,"tech",LocalDate.of(1854,10,20)),
				new Book("Java4",5,"Katty",690,"tech",LocalDate.of(1998,10,20)),
				new Book("Java5",6,"prium",90,"tech",LocalDate.of(2026,10,20)),
				new Book("Java6",7,"sari",190,"tech",LocalDate.of(1111,10,20))	
				
				);
	}

}
