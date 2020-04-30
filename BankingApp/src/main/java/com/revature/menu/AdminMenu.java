package com.revature.menu;

import java.util.Scanner;

import com.revature.services.AccountServices;

public class AdminMenu {

	static boolean exit;
	static Scanner sc = new Scanner(System.in);
	
	public static void runAdminMenu() {
		while (!exit) {
			printAdminMenu();
			int option = userInput();
			optionSelect(option);
		}
	
		
	}

	private static void printAdminMenu() {
		System.out.println("=====================================");
		System.out.println("\nWelcome to the Admin menu\n");
		System.out.println("=====================================");
		System.out.println("Would you like to \n1 Access all customer information \n2 Review pending accounts \n3 Exit");
		
	}

	private static int userInput() {
		int option = 2000;
		int i = 0;
		do {
		try {
			option = Integer.parseInt(sc.nextLine());
		}
		catch(Exception e) {
			i++;
			if(i>4) {
				System.out.println("You have entered too many invalid attempts, the application will now close");
				System.exit(0);
			}
			if(i>2) {
				System.out.println("Press. An. Integer.");
			}
		}
		if(1>option||option>3) {
			System.out.println("Please enter one of the three options. 1 for Access all customer information, 2 for Review pending accounts, or 3 for Exit");
		}
		
	}while ((1>option||option>3));
		return option;
	}

	
	
	private static void optionSelect(int option) {
		switch (option) {
		case 1: 
			//call all customer info like how it is in customer menu for one
			System.out.println("Would you like to 1 Edit an account or 2 Return to admin menu");
			int i = 0;
			int choice  = 200;
			try {
				choice = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e) {
				i++;
				if(i>4) {
					System.out.println("You have entered too many invalid attempts, the application will now close");
					System.exit(0);
				}
				if(i>2) {
					System.out.println("Press. An. Integer.");
				}
			}
			if(1>option||option>2) {
				System.out.println("Please enter one of the two options. 1 for edit an account or 2 return to main menu");
			}
			switch(choice) {
			case 1:
				// all the stuff we can do in account and add delete method
				System.out.println("admin Choice 1!");
				break;
			case 2:
				runAdminMenu();
				break;
			default:
				runAdminMenu();
			}
			break;
		case 2:
			AccountServices.listAllAccounts();
			break;
		case 3:
			System.out.println("Thank you, have a nice day");
			System.exit(0);
		default:
			System.out.println("how?");
			break;
		}
		
	}
}
