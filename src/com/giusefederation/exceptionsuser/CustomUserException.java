package com.giusefederation.exceptionsuser;

public class CustomUserException extends RuntimeException {
	
	public CustomUserException() {
		super();
	}
	
	public CustomUserException(String errorMessage) {
		super(errorMessage);
	}
	
	public CustomUserException(Throwable err) {
		super(err);
	}
	
	public CustomUserException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
	
	
	
}
