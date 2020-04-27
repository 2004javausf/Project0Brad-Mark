package com.test.users;

import java.util.ArrayList;

import com.test.accounts.Account;

public class CustomerOne extends User {
	
		private static String userType = "Customer";
		private ArrayList<Account> accounts;
		
		public CustomerOne(String username, String password){
			super(password, password);
		}

		public static String getUserType() {
			return userType;
		}

		public ArrayList<Account> getAccounts() {
			return accounts;
		}

		public void setAccounts(ArrayList<Account> accounts) {
			this.accounts = accounts;
		}

		@Override
		public String toString() {
			//todo: retrieve all accounts with username pass in as accounts
			
			return "Customer Username: " +username+
					"\t Password: "+ password+
					"\t Accounts " + accounts +"\n";
		}

	}

