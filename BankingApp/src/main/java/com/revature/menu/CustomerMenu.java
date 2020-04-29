package com.revature.menu;

import java.util.Scanner;

import com.revature.accounts.Account;

public class CustomerMenu {
	boolean exit;
	Scanner sc = new Scanner(System.in);
	private String password;
	private String username;
	
	public CustomerMenu(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	public void accountMenu(){
		System.out.println("\nWelcome to your account " + username);
		while(!exit) {
		printAMenu();
		int option = userAInput();
		optionASelect(option);
		}
	}
	
	

	private void printAMenu() {
		System.out.println("Type the number for which option you would like");
		System.out.println("1 Access accounts");
		System.out.println("2 Apply for a new account");
		System.out.println("3 Apply for a joint account");
	}
	
	private int userAInput() {
		int option = 2000;
		int i = 0;
		do {
		try {
			option = Integer.parseInt(sc.nextLine());
		}
		catch(Exception e) {
			i++;
			if(i>5) {
				System.out.println("Too many invalid attempts, you will be exited from the application");
				System.exit(0);
			}
			if(i>2) {
				System.out.println("Press an integer please");
			}
		}
		if(1>option||option>3) {
			System.out.println("Please enter one of the three options. 1 for Access accounts, 2 for Apply for a new account or, 3 Apply for a joint account");
		}
		
	}while ((1>option||option>3));
		return option;
	}
	
	
	private void optionASelect(int option) {
		boolean a = false;
		int accType = 0;
		int i = 0;
		double deposit = 0;
		Account acc;
		switch (option) {
		case 1: 
			//Account((ArrayList<Customer> accountHolder, double balance);
			System.out.println("Welcome to your account page");
			break;
		case 2:
			while (!a) {
			System.out.println("What type of account would you like to apply for?");
			System.out.println("1 Checkings");
			System.out.println("2 Savings");
			
				try {
					accType = Integer.parseInt(sc.nextLine());
				}catch(NumberFormatException e){
					i++;
					if(i>5) {
						System.out.println("Too many invalid attempts, you will be exited from the application");
						System.exit(0);
					}
					if(i>2) {
						System.out.println("Press an integer please");
					}
				}
//				if (accType == 1) {
//					System.out.println("Please enter an inital deposit ammount to your checkings account");
//					acc = new Checkings(deposit);
//				}else if(accType == 2){
//					System.out.println("Please enter an initial deposit amount to your savings account");
//					acc = new Savings(deposit);
//				}else {
//					System.out.println("Please enter a valid option\n");
//				}
			}
			
			break;
		case 3: 
			System.out.println("do something for joint accounts");
			break;
		default:
			System.out.println("how?");
			break;
		}
	}
}
