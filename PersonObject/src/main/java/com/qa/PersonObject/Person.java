package com.qa.PersonObject;

public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public Person(String name, int age) {
		this.name = name;
		this.setAge(age);
	}

	public Person(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJob(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	private String Title() {
		return this.jobTitle;
	}

	private int age() {
		return this.getAge();
	}

	String name() {
		return this.name;
	}

	public void printInfo() {
		System.out.print(this.name);
		if (this.getAge() != 0) {
			System.out.print(": " + this.getAge());
		}
		if (this.jobTitle != null) {
			System.out.print("; " + this.jobTitle);
		}
		System.out.println("");

	}

	@Override
	public String toString() {
		return this.name + ": " + Integer.toString(this.getAge()) + "; " + this.jobTitle;
	}

	public int getAge() {
		return this.age;
	}

}
