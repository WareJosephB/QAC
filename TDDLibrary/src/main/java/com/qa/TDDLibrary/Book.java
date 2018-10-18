package com.qa.TDDLibrary;

public class Book extends Item {

	private String author;
	private int numPages;

	public Book(String title, String author, String publishDate) {
		super(title, publishDate);
		this.setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public String toString() {
		return this.getRefNumber() + ". " + this.getAuthor() + "'s " + this.getTitle() + ": " + this.getPublishDate();
	}

}
