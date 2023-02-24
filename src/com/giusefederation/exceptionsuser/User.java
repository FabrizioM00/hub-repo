package com.giusefederation.exceptionsuser;
/*
 * Modellizzare la classe User avente campi firstname, lastname, email, password, age.

Validare i campi nei metodi setter e nel costruttore lanciando eventualmente una RuntimeException.

Come step successivo definire delle eccezioni custom specifiche per ogni situazione (ereditando da RuntimeException).

 */
public class User {
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private int age;
	
	public User(String firstname, String lastname, String email, String password, int age) {
		setFirstname(firstname);
		setLastname(lastname);
		setEmail(email);
		setPassword(password);
		setAge(age);
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		if(firstname == null || firstname.isBlank()) {
			throw new CustomUserException("Nome non inserito o vuoto");
		}
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		if(lastname == null || lastname.isBlank()) {
			throw new CustomUserException("Cognome non inserito o vuoto");
		}
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email == null || email.isBlank()) {
			throw new CustomUserException("Email non inserita o vuota");
		}
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		if(password == null || password.isBlank()) {
			throw new CustomUserException("Password non inserita o vuota");
		}
		if(password.length() < 8) {
			throw new CustomUserException("Password troppo corta (almeno 8 caratteri)");
		}
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 18) {
			throw new CustomUserException("Sei minorenne, cresci.");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password=" + password
				+ ", age=" + age + "]";
	}
	
	
	
}
