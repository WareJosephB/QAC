package com.qa.TDDLibrary;

import java.awt.List;
import java.util.Date;
import org.junit.Test;

public class TestLibrary {

	@Test
	public void canCheckOut() {
		
		Person steve = new Person();
		steve.checkOut("A Midsomer's Night Dream", "Shakespeare")
		System.out.println(steve.checkedOut());
		assert(steve.checkedOut.length() == 1);
	}

	@Test
	public void canCheckIn() {
		
		Person steve = new Person();
		steve.checkOut("A Midsomer's Night Dream", "Shakespeare"));
		System.out.println(steve.checkedOut());
		steve.checkIn("A Midsomer's Night's Dream");
		assert(steve.checkedOut.length() == 0)
		
	}

	@Test
	public void canAdd() {

		List<Item> inventory = new InventoryManager.itemList();
		inventory.add((Book) "A Midsomer's Nights Dream", "Shakespeare");
		assert (inventory.length() == 1);

	}

	@Test
	public void canRemove() {

		List<Item> inventory = new InventoryManager.itemList();
		inventory.add((Book) "A Midsomer's Nights Dream", "Shakespeare");
		assert (inventory.length() == 1);
		inventory.remove("A Midsomer's Nights Dream");
		assert (inventory.length() == 0);

	}

	@Test
	public void canUpdate() {

		List<Item> inventory = new InventoryManager.itemList();
		inventory.add((Book) "A Midsomer's Nights Dream", "Shakespeare");
		assert (inventory[0].name() == "A Midsomer's Nights Dream");
		inventory[0].update("A Midsummer's Nights Dream", "Shakespeare");
		assert (inventory[0].name() == "A Midsummer's Nights Dream");

	}

	@Test
	public void canRegister() {

		List<Person> customers = new PersonManager.customerList;
		customers.add("Joe Bloggs", 42);
		assert(customers.length() == 1);
		
	}

	@Test
	public void canBan() {
		List<Person> customers = new PersonManager.customerList;
		customers.add("Joe Bloggs", 42);
		customers.add("Loud Talker", 21);
		customers.add("Nice old Lady", 67);
		customers.ban("Loud Talker");
		assert(customers.length() == 2);
		System.out.println(customers);
		
		
		
		
	}

	@Test
	public void canUpdatePerson() {
		
		List<Person> customers = new PersonManager.customerList;
		customers.add("Joe Bloggs", 42);
		customers[0].update(43);
		assert(customers[0].age == 43);
		

	}

}
