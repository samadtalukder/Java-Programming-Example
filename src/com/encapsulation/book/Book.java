package com.encapsulation.book;

public class Book extends PublicationModel{
	
	public void BookPublication(BookModel bookModel) {
		if(bookModel.getPrice()>10) {
			System.out.println("Treatment C1");
		}else {
			System.out.println("Treatment C2");
		}
	}
//	
	public void MagazinePublication(MagazineModel magazineModel) {
		if(magazineModel.getMagazinePrice()>10) {
			System.out.println("Treatment Magazine");
		}else {
			System.out.println("Treatment Magazine2");
		}
	}
}
