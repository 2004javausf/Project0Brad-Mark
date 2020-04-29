package com.test.users;

import java.util.ArrayList;
import java.util.Scanner;

import com.test.accounts.Account;
import com.test.accounts.Checkings;
import com.test.accounts.Savings;


public class Customer extends User {
	
	private String userType = "Customer";
	private ArrayList<Account> accounts;
	
	public Customer(String username, String password) {
		this.username=username;
		this.password=password;
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
