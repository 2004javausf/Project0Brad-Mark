package com.test.driver;

import java.util.HashMap;
import java.util.Map;

import com.test.menu.Menu;

public class Driver {
	static Map<String,String> users = new HashMap<>();
	public static void main(String[] args) {
		users.put("bob","bob");
		users.put("man","man");
		Menu m = new Menu();
		m.runMenu();
	}
}
