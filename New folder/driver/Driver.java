package com.revature.driver;

import java.util.ArrayList;

import com.revature.accounts.Account;
import com.revature.bank.Bank;
import com.revature.user.Customer;

public class Driver {
	public static void main(String[] args) {
		//example customer
		Customer exampleCustomer = new Customer("customerName","Password");
		
		//example account
		ArrayList<Customer> accountHolders = new ArrayList<>();
		accountHolders.add(exampleCustomer);
		double initialBalance = 100.00;
		Account exampleAccount = new Account(initialBalance, accountHolders);
		
		//example customer services
//		Bank.addCustomer(exampleCustomer);
//		Bank.listAllCustomers();
//			String userProperty = "username";
//			String newValue = "newCustomerName";
//		Bank.editCustomerInfo(exampleCustomer, userProperty, newValue);
//		Bank.listAllAccounts();
//		Bank.removeCustomer(Bank.getCustomerByUsername("newCustomerName"));
//		Bank.listAllCustomers();
		
		//example account services
//		Bank.addPendingAccount(exampleAccount);
//		Bank.listAllAccounts();
//		Bank.approvePendingAccount(exampleAccount);
//		Bank.listAllAccounts();
//		Bank.removeAccount(exampleAccount);
//		Bank.listAllAccounts();
		
	}
}
