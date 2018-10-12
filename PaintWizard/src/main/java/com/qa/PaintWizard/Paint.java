package com.qa.PaintWizard;

public class Paint {

	private int cost;
	private int volume;
	private int coverageLitre;
	private int moneyCoverage;

	public Paint(int cost, int volume, int coverage) {
		this.cost = cost;
		this.volume = volume;
		this.coverageLitre = coverage;
		this.moneyCoverage = cost / (volume * coverage);
	}

	public int wastage(int roomSize) {
		return roomSize % (coverageLitre * volume);
	}

	public int costage(int roomSize) {
		int temp = (this.coverageLitre * this.volume) / roomSize;
		return (temp + 1) * this.cost;
	}

}
