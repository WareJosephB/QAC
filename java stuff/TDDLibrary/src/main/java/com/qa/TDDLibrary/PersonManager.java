package com.qa.TDDLibrary;

import java.util.ArrayList;

public class PersonManager {

	private static ArrayList<Person> personList = new ArrayList<Person>();

	public static void add(Person person) {

		personList.add(person);

	}

	public static void add(String name, int age) {

	}

	public static void ban(Person person) {

		personList.remove(person);
	}

	public void show() {

		System.out.println(getPersonList());
	}

	public static ArrayList<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<Person> List) {
		personList = List;
	}

	private static boolean remove(String name) {
		int i = 0;
		while (i < personList.size()) {
			if (personList.get(i).getName() == name) {
				personList.remove(i);
				return true;

			} else {
				i++;
			}

		}
		return false;
	}

	public static void ban(String name) {

		if (remove(name)) {
			System.out.println(name + " removed!");
		} else {
			System.out.println("Person not found.");
		}
	}

}
