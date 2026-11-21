package com.bookapp.model;

import java.time.LocalDate;

public class Book 
{
	
	private String title;
	private Integer bookID;
	private String author;
	private double price;
	private String category;
	private LocalDate datepublish;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Book(String title, Integer bookID, String author, double price, String category, LocalDate datepublish) {
		super();
		this.title = title;
		this.bookID = bookID;
		this.author = author;
		this.price = price;
		this.category = category;
		this.datepublish = datepublish;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getBookID() {
		return bookID;
	}
	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getDatepublish() {
		return datepublish;
	}
	public void setDatepublish(LocalDate datepublish) {
		this.datepublish = datepublish;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", bookID=" + bookID + ", author=" + author + ", price=" + price + ", category="
				+ category + ", datepublish=" + datepublish + "]";
	}
	
	
	
	
}
