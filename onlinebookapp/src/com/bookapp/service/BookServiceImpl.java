package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		List<Book> books = BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
	    List<Book> booksByAuthor = new ArrayList<Book>();

	    for (Book book : books) {

	        if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
	            booksByAuthor.add(book);
	        }
	    }

	    if (booksByAuthor.isEmpty()) {
	        throw new BookNotFoundException("No books found for author: " + author);
	    }

	    return booksByAuthor;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		List<Book> booksbycategory = new ArrayList<Book>();
		for(Book book : books)
		{
			if(book.getCategory().equals(category))
				booksbycategory.add(book);
		}
		
		 if (booksbycategory.isEmpty()) {
		        throw new BookNotFoundException("No books found in category: " + category);
		    }
		
		return booksbycategory;

	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		 List<Book> books = BookDetails.showBooks();
		    List<Book> booksByPrice = new ArrayList<Book>();

		    for (Book book : books) {
		        if (book.getPrice() < price) {
		            booksByPrice.add(book);
		        }
		    }
		    
		    if (booksByPrice.isEmpty()) {
		        throw new BookNotFoundException("No books found below price: " + price);
		    }

		    return booksByPrice;
	}

	@Override
	public List<Book> getByDatePublished(int year) throws BookNotFoundException {
		 List<Book> books = BookDetails.showBooks();

		    List<Book> booksByYear = new ArrayList<Book>();

		    for (Book book : books) {

		    	  if (book.getDatepublish() != null &&
		    	            book.getDatepublish().getYear() == year)  
		    	  {
		            booksByYear.add(book);
		        }
		    }
		    
		    if (booksByYear.isEmpty()) {
		        throw new BookNotFoundException("No books found for year: " + year);
		    }

		    return booksByYear;	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		 List<Book> books = BookDetails.showBooks();
		    List<Book> booksByAuthorCategory = new ArrayList<Book>();

		    for (Book book : books) {
		        if (book.getAuthor().toLowerCase().contains(author.toLowerCase())
		                && book.getCategory().equalsIgnoreCase(category)) {

		            booksByAuthorCategory.add(book);
		        }
		    }
		    
		    if (booksByAuthorCategory.isEmpty()) {
		        throw new BookNotFoundException("No books found for author: " + author
		                + " and category: " + category);
		    }

		    return booksByAuthorCategory;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {

		   List<Book> books = BookDetails.showBooks();

		    for (Book book : books) {
		        if (book.getBookID() == bookId) {
		            return book;
		        }
		    }

		    throw new BookNotFoundException();
	}

}
