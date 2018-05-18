package com.encapsulation.book;

public class InheritData {

	public static void main(String[] args) {
		BookModel bookModel = new BookModel();
		MagazineModel model = new MagazineModel();
		Book book = new Book();
		
		// BookModel Object Data
		bookModel.setTitle("Harry Potter and the Philosopher's Stone ");
		bookModel.setAuthor("J. K. Rowling ");
		bookModel.setPrice(20);
		
		// Magazine Model Data
		model.setMagazineName("Play Boy");
		model.setMagazinePrice(230);
		//
		System.out.println("Book Title: "+bookModel.getTitle());
		System.out.println("Book Author: "+bookModel.getAuthor());
		System.out.println("Book Price: "+bookModel.getPrice());
		bookModel.bookSell(2);
		//
		System.out.println("Magazine Name: "+model.getMagazineName());
		System.out.println("Magazine Price: "+model.getMagazinePrice());
		model.magazineSell(5);
		//
		book.BookPublication(bookModel);
		book.MagazinePublication(model);

	}

}
