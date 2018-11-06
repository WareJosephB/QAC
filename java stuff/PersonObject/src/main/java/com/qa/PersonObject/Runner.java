package com.qa.PersonObject;

import java.util.Arrays;
import java.util.List;

public class Runner {
	public static void main(String[] args) {

		Person warejoseph = new Person("Joseph Ware", 24, "CEO");
		Person taylorben = new Person("Ben Taylor", 25, "CTO");
		Person cliffordgareth = new Person("Gareth Clifford", 23, "CHRO");
		Person witharanagevinul = new Person("Vinul Witharanage", 23, "CFO");
		Person groomeharrison = new Person("Harrison Groome", 21, "CIO");
		List<Person> branchConsulting = Arrays.asList(warejoseph, taylorben, cliffordgareth, witharanagevinul,
				groomeharrison);

		printBFs(branchConsulting);
		System.out.println("---");
		findInfo(branchConsulting, "Ben Taylor");

	}

	public static void printBFs(List<Person> firm) {
		firm.stream().filter(s -> s.getAge() > 23).forEach(System.out::println);

	}

	public static void findInfo(List<Person> firm, String name) {
		firm.stream().filter(s -> s.name() == name).forEach(System.out::println);
	}

} //