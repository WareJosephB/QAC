package com.qa.TDDLibrary;

import java.util.ArrayList;

public class Film extends Item {

	private int length;
	private String director;
	private ArrayList<String> actors = new ArrayList<>();

	public Film(String title, String director, String releaseDate) {
		super(title, releaseDate);
		this.setDirector(director);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public ArrayList<String> getActors() {
		return actors;
	}

	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}

	public void addActor(String actor) {
		this.actors.add(actor);
	}

	public void removeActor(String name) {
		int i = 0;
		while (i < this.actors.size()) {
			if (this.actors.get(i) == name) {
				this.actors.remove(i);
				System.out.println(name + " removed");

			} else {
				i++;
			}

		}
		System.out.println("Could not find " + name);
	}

	public void removeActor(int number) {
		System.out.println(this.actors.get(number) + "removed");
		this.actors.remove(number);

	}

	public String toString() {
		String K = "; ";
		for (String actor : this.actors) {
			K = K.concat(actor + ", ");
		}
		K = K.substring(0, K.length() - 2);
		return this.getRefNumber() + ". " + this.getDirector() + "'s " + this.getTitle() + ": " + this.getPublishDate()
				+ K;
	}

}
