package com.encapsulation.book;

public class MagazineModel {
	private String magazinrTitle;
	private String magazineName;
	private String magazineIssue;
	private double magazinePrice;
	
	public String getMagazinrTitle() {
		return magazinrTitle;
	}
	public void setMagazinrTitle(String magazinrTitle) {
		this.magazinrTitle = magazinrTitle;
	}
	public String getMagazineName() {
		return magazineName;
	}
	public void setMagazineName(String magazineName) {
		this.magazineName = magazineName;
	}
	public String getMagazineIssue() {
		return magazineIssue;
	}
	public void setMagazineIssue(String magazineIssue) {
		this.magazineIssue = magazineIssue;
	}
	public double getMagazinePrice() {
		return magazinePrice;
	}
	public void setMagazinePrice(double magazinePrice) {
		if(magazinePrice > 0) {
			this.magazinePrice = magazinePrice;
		}
		else {
			System.out.println("Invalid Price");
		}
		
	}
	public void magazineSell(int magQuantity) {
		System.out.println("Magazine Total Price: "+(magQuantity * magazinePrice));
	}
	
	
}
