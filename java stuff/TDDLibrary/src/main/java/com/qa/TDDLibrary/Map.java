package com.qa.TDDLibrary;

public class Map extends Item {

	private int scaleFactor;

	public Map(String title, int scaleFactor, String publishDate) {
		super(title, publishDate);
		this.setScaleFactor(scaleFactor);
	}

	public int getScaleFactor() {
		return scaleFactor;
	}

	public void setScaleFactor(int scaleFactor) {
		this.scaleFactor = scaleFactor;
	}

	public String toString() {
		return this.getRefNumber() + ". " + this.getTitle() + " @ 1:" + this.getScaleFactor() + "; "
				+ this.getPublishDate();
	}
}
