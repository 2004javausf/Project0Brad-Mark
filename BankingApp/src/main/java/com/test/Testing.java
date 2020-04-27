package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.test.users.Customer;

class Testing {

	@Test
	void test() {
		Map<String,String> users = new HashMap<>();
		users.put("bob","bob");
		users.put("man","man");
		String ExpectedValue = "man";
		String ActualValue;
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		
		if (users.containsKey(username)) {
			System.out.println("Your username is: "+username);
			System.out.print("Please enter your password: ");
			String password = sc.nextLine();
			if ((users.get(username)).equals(password)) {
				ActualValue = password;
				assertEquals(ActualValue,ExpectedValue);
			}else {
			for(int i = 0;i<=3;i++) {
				if (users.containsValue(password)) {
					Customer c = new Customer(username,password);
					c.accountMenu();
				}
				System.out.println("The password you entered was incorrect. Try again.");
				password = sc.nextLine();
				if (i == 3) {
					System.out.println("The account is locked.");
					System.exit(0);
					break;
				}
			}
		}
		}
			
	}
	}


