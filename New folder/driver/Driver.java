package com.revature.driver;

import java.util.ArrayList;

import com.revature.accounts.Account;
import com.revature.user.Customer;

public class Driver {
	public static void main(String[] args) {
		Customer c1 = new Customer("bobby","password");
		Customer c2 = new Customer("Susan","password");
		ArrayList<Customer> l1 = new ArrayList<>();
		l1.add(c1);
		l1.add(c2);
		Account a1 = new Account(100.00,l1);
		Account a2 = new Account(100.00,l1);
		System.out.println(a2);
		
		
	}
}
