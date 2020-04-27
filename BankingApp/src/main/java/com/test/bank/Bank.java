package com.test.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.test.accounts.Account;
import com.test.users.Customer;

public class Bank {
	ArrayList<Customer> customers;
	ArrayList<Account> accounts;
	
	public Bank(ArrayList<Customer> customers, ArrayList<Account> accounts) {
		super();
		this.customers = customers;
		this.accounts = accounts;
	}
	public void addCustomer() {
		//create a new Customer object and store it
	}
	public void addAccount() {
		
	}
	public void removeAccount() {
		
	}
	public void selectAccount() {
		
	}
	@Override
	public String toString() {
		return "Bank [customers=" + customers + ", accounts=" + accounts + "]";
	}
	
}