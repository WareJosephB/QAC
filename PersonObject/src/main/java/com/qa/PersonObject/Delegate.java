package com.qa.PersonObject;

public class Delegate {

	private int techSkills;
	private int softSkills;
	private int UID;
	private String name;
	private String phoneNumber;
	private Trainer trainer;

	public Delegate(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public Delegate() {

	};

	public void remove() {
		System.out.println("Delegate removed.");
	}

}
