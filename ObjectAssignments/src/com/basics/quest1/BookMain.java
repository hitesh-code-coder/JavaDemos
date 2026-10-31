package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) 
	{
		Book book = new Book("How are you","Ram",1000.00,"life,birth,help");
		book.getDetails();
		book.checkBookType();
		
		System.out.println();
		
		Book book1 = new Book("above","Sham",100.00,"help");
		book1.getDetails();
		book1.checkBookType();


	}

}
