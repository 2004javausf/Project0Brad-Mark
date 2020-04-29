package com.test.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.test.bank.Bank;
import com.test.users.Customer;

public class Menu {
	static Map<String,String> users = new HashMap<>();
	
	
	Scanner sc = new Scanner(System.in);
	Bank bank;
	boolean exit;
	
	public static void main(String[] args) {
		users.put("bob","bob");
		users.put("man","man");
		Menu m = new Menu();
		m.runMenu();
	}
	
	
	
	public void runMenu() {
		while (!exit) {
			printMenu();
			int option = userInput();
			optionSelect(option);
		}
	}



	private void printMenu() {
		System.out.println("Do you have an account with us?");
		System.out.println("For yes press 1");
		System.out.println("For no press 2");
	}


	private int userInput() {
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
		if(1>option||option>2) {
			System.out.println("Please enter one of the two options. 1 for yes or 2 for no");
		}
		
	}while ((1>option||option>2));
		return option;
	}
			private void optionSelect(int option) {
					switch (option) {
					case 1: 
						logIn();
						break;
					case 2:
						while(!exit) {
							askMakeAccount();
							int option2 = userinput2();
							optionSelect2(option2);
						}
					default:
						System.out.println("how?");
						break;
		}
	
	}

			
			
			private void logIn() {
				int i1 = 0;
				while (!exit) {
				System.out.print("Please enter your username: ");
				String username = sc.nextLine();
				i1++;
				if (users.containsKey(username)) {
					System.out.println("Your username is: "+username);
					if (username.equals("Admin")) {
						System.out.print("Please enter your password: ");
						String password = sc.nextLine();
						if((users.get(username)).equals(password)) {
								CustomerMenu c = new CustomerMenu(username,password);
								c.accountMenu();
						}
					}
					if (username.equals("Employee")) {
						System.out.print("Please enter your password: ");
						String password = sc.nextLine();
						if((users.get(username)).equals(password)) {
								CustomerMenu c = new CustomerMenu(username,password);
								c.accountMenu();
						}
					}
					
					System.out.print("Please enter your password: ");
					String password = sc.nextLine();
					if ((users.get(username)).equals(password)) {
						CustomerMenu c = new CustomerMenu(username,password);
						c.accountMenu();
					}else {
					for(int i = 0;i<=3;i++) {
						if ((users.get(username)).equals(password)) {
							CustomerMenu c = new CustomerMenu(username,password);
							c.accountMenu();
						}
						System.out.println("The password you entered was incorrect. Try again.");
						password = sc.nextLine();
						if (i == 3) {
							System.out.println("The account is locked.");
							System.exit(0);
							break;
						}
					}
				}
				}
				else if(username.equals("exit")) {
					System.exit(0);
				}
				else {
					if (i1>3) {
						System.out.println("Too many invalid attempts.");
						System.exit(0);
					}
					System.out.println("You have not enetered a valid username, please try again, if you would like to exit type 'exit'");
				}
				
			}
			}

			
			
			
			
			
			


					private void askMakeAccount() {
							System.out.println("Would you like to have an account with us?");
							System.out.println("For yes press 1");
							System.out.println("For no press 2");

}
					private int userinput2() {
						int option2 = 2000;
						int i2 = 0;
						do {
						try {
							option2 = Integer.parseInt(sc.nextLine());
						}
						catch(Exception e) {
							i2++;
							if(i2>5) {
								System.out.println("Too many invalid attempts made, app will be exited now");
								System.exit(0);
							}
							if(i2>2) {
								System.out.println("You know the drill.");
							}
						}
						if(1>option2||option2>2) {
							System.out.println("Please enter one of the two options. 1 for yes or 2 for no");
						}}while ((1>option2||option2>2));
						return option2;
			}
					
					private void optionSelect2(int option2) {
						if (option2 == 2) {
						System.out.println("Thank you have a good day.");
						System.exit(0);
						}
						else {
							createAccount();
						}
							
			}



					private void createAccount() {
						int i = 0;
						boolean taken = false;
						while(!taken) {
							System.out.print("Please enter your preferred username: ");
							String username = sc.nextLine();
							//if the username is in our list make a statement saying it is a taken username
							if(users.containsKey(username)) {
								System.out.println("Sorry this username is taken");
							}else {
							System.out.println("Your chosen username is: "+username);
							taken = true;
							}
						}
							while(!exit) {
								i++;
								
							System.out.println("Please enter your password: ");
							String password = sc.nextLine();
							
							System.out.println("Please re-enter your password: ");
							String test = sc.nextLine();
							if(test.equals(password)) {
								System.out.println("Passwords match.");
								//take them to accounts to enter in more info or something i dnno
								System.exit(0);
							}
							else {
								if (i>3) {
									System.out.println("Your passwords still do not match, program ending.");
									System.exit(0);
								}
								System.out.println("Passwords do not match. Please try again.");
								
							}
							}
					}
					
					
					
					
					
					

					
	}