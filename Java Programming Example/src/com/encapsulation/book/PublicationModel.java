package com.encapsulation.book;

public class PublicationModel {
	// Title of the publication.
    private String publicationTitle;
    // Price of the publication.
    private double publicationPrice;

    public String getTitle() {
        return this.publicationTitle;
    }

    public void setTitle(String publicationTitle) {
        this.publicationTitle = publicationTitle;
    }

    public void setPrice(double publicationPrice) {
        if (publicationPrice > 0) {
            this.publicationPrice = publicationPrice;
        } else {
            System.out.println("Invalid price");
        }
    }

    public double getPrice() {
        return this.publicationPrice;
    }

    public void sell(int qty) {
        System.out.println("Total: $" + (qty * publicationPrice));
    }
}
