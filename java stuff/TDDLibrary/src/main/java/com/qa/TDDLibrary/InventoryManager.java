package com.qa.TDDLibrary;

import java.util.ArrayList;

public class InventoryManager {

	private static ArrayList<Item> itemList = new ArrayList<Item>();

	public static void add(Item item) {

		itemList.add(item);

	}

	public void remove(Item item) {

		itemList.remove(item);
	}

	public void show() {

		System.out.println(getItemList());
	}

	public static ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> list) {
		itemList = list;
	}

}
