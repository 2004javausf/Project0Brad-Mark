package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.revature.menu.CustomerMenu;
import com.revature.users.Customer;

class Testing {

	@Test
	@DisplayName("Menu Testing")
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
				if ((users.get(username)).equals(password)) {
					CustomerMenu c = new CustomerMenu(username,password);
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
	@Test
	@DisplayName("Withdrawl Test")
	void test1() {
		Boolean Expected = true;
		Boolean Actual = false;
		double Balance = 1000;
		double Withdraw = 0;
		Boolean t = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("How much money would you like to withdraw");
		while(!t) {
			try {
				Withdraw = Double.parseDouble(sc.nextLine());
				if(Withdraw<0) {
					System.out.println("Please enter a positive number to withdraw");
				}else {
					Actual = true;
					Balance -= Withdraw;
					t = true;
				}
			}catch(Exception e){
				System.out.println("Please enter a number to withdraw");
			}
		}
		assertEquals(Expected,Actual);
		System.out.println(Balance);
	}
	
	@Test
	@DisplayName("Deposit Test")
	void test2() {
		Boolean Expected = true;
		Boolean Actual = false;
		double Balance = 1000;
		double Deposit = 0;
		Boolean t = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("How much money would you like to deposit");
		while(!t) {
			try {
				Deposit = Double.parseDouble(sc.nextLine());
				if(Deposit<0) {
					System.out.println("Please enter a positive number to deposit");
				}else {
					Actual = true;
					Balance += Deposit;
					t = true;
				}
			}catch(Exception e){
				System.out.println("Please enter a number to deposit");
			}
		}
		assertEquals(Expected,Actual);
		System.out.println(Balance);
	}

	}


