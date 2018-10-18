package com.qa.TDDLibrary;

import java.util.ArrayList;

import org.junit.Test;

public class TestLibrary {

	@Test
	public void canCheckOut() {

		Person steve = new Person("Steve", 42);
		Book amnd = new Book("A Midsomer's Night's Dream", "Shakespeare", "1595");
		steve.checkOut(amnd);
		assert (steve.checked().size() == 1);
	}

	@Test
	public void canCheckIn() {

		Person steve = new Person("Steve", 42);
		Book amnd = new Book("A Midsomer's Night's Dream", "Shakespeare", "1595");

		steve.checkOut(amnd);
		steve.checkIn(amnd);
		assert (steve.checked().size() == 0);

	}

	@Test
	public void canAdd() {

		Film avp = new Film("Alien vs. Predator", "Paul W. S. Anderson", "22 October 2004");
		Book amnd = new Book("A Midsomer's Night's Dream", "Shakespeare", "1595");
		Map OS1 = new Map("Shepton Mallet", 1, "1964");
		avp.addActor("Lance Henriksen");
		avp.addActor("Peepee Poopoo");
		avp.removeActor("Peepee Poopoo");
		ArrayList<Item> inventory = InventoryManager.getItemList();
		System.out.println(avp.getActors());
		inventory.add(amnd);
		int P = inventory.size();
		inventory.add(avp);
		inventory.add(OS1);
		System.out.println(inventory);
		assert (inventory.size() == P + 2);

	}

	@Test
	public void canRemove() {

		ArrayList<Item> inventory = InventoryManager.getItemList();
		Book amnd = new Book("A Midsomer's Night's Dream", "Shakespeare", "1595");

		inventory.add(amnd);
		int K = inventory.size();
		inventory.remove(amnd);

		assert (inventory.size() == K - 1);

	}

	@Test
	public void canUpdate() {
		Book amnd = new Book("A Midsomer's Night's Dream", "Shakespeare", "1595");

		InventoryManager.add(amnd);
		assert (InventoryManager.getItemList().get(0).getTitle().toString() == "A Midsomer's Night's Dream");
		InventoryManager.getItemList().get(0).updateTitle("A Midsummer's Night's Dream");
		assert (InventoryManager.getItemList().get(0).getTitle().toString() == "A Midsummer's Night's Dream");

	}

	@Test
	public void canRegister() {
		int M = PersonManager.getPersonList().size();

		Person joe = new Person("Joe Bloggs", 42);
		PersonManager.add(joe);

		assert (PersonManager.getPersonList().size() == M + 1);

	}

	@Test
	public void canBan() {
		ArrayList<Person> customers = PersonManager.getPersonList();
		Person joe = new Person("Joe Bloggs", 42);
		Person loudy = new Person("Loud Talker", 21);
		Person niceLady = new Person("Greta", 67);

		customers.add(joe);
		customers.add(loudy);
		customers.add(niceLady);

		int N = customers.size();
		PersonManager.ban("Loud Talker");
		assert (customers.size() == N - 1);

	}

	@Test
	public void canUpdatePerson() {

		Person joe = new Person("Joe Bloggs", 42);
		ArrayList<Person> customers = PersonManager.getPersonList();
		customers.add(joe);
		customers.get(0).update(43);
		customers.get(0).update("John Bloggs");
		assert (customers.get(0).getAge() == 43);
		assert (customers.get(0).getName() == "John Bloggs");

	}

}
