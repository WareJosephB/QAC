package com.qa.OOP;

public class Results {
	private int physics;
	private int biology;
	private int chemistry;
	private int total;
	private double percentage;
	private double physcentage;
	private double chemcentage;
	private double biocentage;

	public Results(int phys, int bio, int chem) {
		total = phys + bio + chem;
		physics = phys;
		double physcent = physics / 1.5;
		physcentage = physcent - physcent % 0.1;
		biology = bio;
		double biocent = biology / 1.5;
		biocentage = biocent - biocent % 0.1;
		chemistry = chem;
		double chemcent = chemistry / 1.5;
		chemcentage = chemcent - chemcent % 0.1;
		double physio = physics;
		double biolio = biology;
		double chemio = chemistry;
		double percent = (100 * (physio + biolio + chemio) / 450);
		percentage = percent - percent % 0.1;

	}

	public void getResults() {

		System.out.println("From a total possible of 150 each:");
		System.out.println("Your score in Biology was " + biology);
		System.out.println("Your score in Chemistry was " + chemistry);
		System.out.println("Your score in Physics was " + physics);
		System.out.println("Your total score was " + total + " out of 450");

	}

	public void getPercents() {
		boolean M = true;
		int N = 0;
		double[] P = { physcentage, biocentage, chemcentage };
		for (double i : P) {
			if (i < 60) {
				N++;
			}
		}
		System.out.println("Your total percentage for the year was " + percentage);
		if (percentage < 60) {
			System.out.println("Meaning you have failed the year.");
			M = false;
		}
		System.out.println("Your percentages in Biology, Chemistry and Physics respectively were " + biocentage + ", "
				+ chemcentage + " and " + physcentage);
		System.out.println("Meaning that you failed " + N + " modules");
		if (N == 0) {
			System.out.println("Congratulations!");
		}
		if (N > 0 && M) {
			System.out.println("And therefore the year");
		}
		System.out.println("Our condolences.");
	}
}
