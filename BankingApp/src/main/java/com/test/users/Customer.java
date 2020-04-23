package com.test.users;

import java.util.ArrayList;

import com.test.accounts.Account;

public class Customer extends User {
	private String userType = "Customer";
	private ArrayList<Account> accounts;
	
	public Customer(String username, String password) {
		this.username=username;
		this.password=password;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [userType=" + userType + ", accounts=" + accounts + ", username=" + username + ", password="
				+ password + "]";
	}
	
}
