package com.test.users;

public class Employee extends User{
	String userType = "Employee";
	boolean isAdmin;
	
	public Employee(String username, String password, boolean isAdmin) {
		this.username=username;
		this.password=password;
		this.isAdmin=isAdmin;	
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	@Override
	public String toString() {
		return "Employee [userType=" + userType + ", isAdmin=" + isAdmin + ", username=" + username + ", password="
				+ password + "]";
	}
}
