package com.qa.TDDLibrary;

public class Item {

	private static int N = 1; // For ID

	private String title;
	private String publishDate;
	private int refNumber;

	Item(String title) {
		this.setTitle(title);
		this.setPublishDate("");
		this.refNumber = N;
		N += 1;
	}

	Item(String title, String publishDate) {
		this(title);
		this.setPublishDate(publishDate);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public int getRefNumber() {
		return refNumber;
	}

	public void updateTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title + ": " + publishDate;
	}

	public void updateName(String title) {
		this.setTitle(title);
	}

	public void updatePublish(String publishDate) {
		this.setPublishDate(publishDate);
	}

}
