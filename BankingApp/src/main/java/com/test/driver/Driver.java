package com.test.driver;

import java.util.ArrayList;

import com.test.bank.UserServices;
import com.test.users.CustomerOne;

public class Driver {
	public static void main(String[] args) {
		CustomerOne u = new CustomerOne("mark","brad");
		System.out.println(UserServices.getWorkingList());
		UserServices.writeFileContents(u);
	}
}
