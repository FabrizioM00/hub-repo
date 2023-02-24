package com.giusefederation.readwritecsv;

public class User {
	
	private String firstname;
	private String lastname;
	private int age;
	
	public User(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String toCSVString() {
		return firstname + "," + lastname + "," + age;
	}

	@Override
	public String toString() {
		return "\nUser [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
	
}
