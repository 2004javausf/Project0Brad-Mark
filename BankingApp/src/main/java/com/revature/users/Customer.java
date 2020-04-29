package com.revature.users;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import com.revature.accounts.Account;
import com.revature.bank.Bank;

public class Customer implements Serializable{

	private static final long serialVersionUID = -4681026638434820379L;
	private static String userType = "Customer";
	private String username;
	private String password;
	

	public Customer(String username, String password){
		this.username = username;
		this.password = password;
	}

	public static String getUserType() {
		return userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private ArrayList<Account> findCustomerAccounts() {
		Iterator<Account> itr = Bank.getAccounts().iterator();
		ArrayList<Account> customerAccounts = new ArrayList<>();
		while(itr.hasNext()) {
			Account account = itr.next();
			Iterator<Customer> customer = account.getAccountHolder().iterator();
			while(customer.hasNext()) {
				if(customer.next().getUsername().equals(this.getUsername())) {
					customerAccounts.add(account);
				}
			}
		}
		return customerAccounts;
	}

	@Override
	public String toString() {
		ArrayList<Account> accounts = findCustomerAccounts();
		return "Customer Username: " +username+
				", Password: "+ password+
				", Accounts " + accounts +"\n";
	}

}