package com.revature.driver;

import java.util.ArrayList;

import com.revature.accounts.Account;
import com.revature.bank.Bank;
import com.revature.services.AccountServices;
import com.revature.services.CustomerServices;
import com.revature.users.Customer;

public class Driver {

	public static void main(String[] args) {
		//Create bank object and pull all bank info from documents
		Bank bank = new Bank();
		bank.pullAllBankInfo();
		
		//example customer
		Customer exampleCustomer = new Customer("customerName","Password");
		
		//example account
//		ArrayList<Customer> accountHolders = new ArrayList<>();
//		accountHolders.add(exampleCustomer);
//		double initialBalance = 100.00;
//		Account exampleAccount = new Account(initialBalance, accountHolders);
		
		System.out.println(CustomerServices.getCustomer("customerName"));
		
		
	}

}
