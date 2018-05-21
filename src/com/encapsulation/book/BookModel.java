package com.encapsulation.book;

public class BookModel {
	private String title;
	private String author;
	private double price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		if(price>0) {
			this.price = price;
		}
		System.out.println("Invalid Price");
		
	}
	public void bookSell(int quantity) {
		System.out.println("Total Book Price: "+(quantity * price));
	}
	
}
