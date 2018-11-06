package com.qa.TDDLibrary;

import java.util.ArrayList;

public class Person {

	private int age;
	private String name;
	private static int N = 1;
	private int idNum;
	private ArrayList<Item> checkedOut;

	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
		this.idNum = N;
		this.checkedOut = new ArrayList<Item>();
		N += 1;
	}

	public int getIdNum() {
		return idNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Birthday() {
		this.age += 1;
	}

	public void checkOut(Item item) {

		this.checkedOut.add(item);
	}

	public ArrayList<Item> checked() {
		return this.checkedOut;
	}

	public void checkIn(Item item) {

		this.checkedOut.remove(item);

	}

	public void update(int age) {
		this.age = age;
	}

	public void update(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + ": " + this.age;
	}

}