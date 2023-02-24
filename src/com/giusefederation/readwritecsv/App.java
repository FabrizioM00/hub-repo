package com.giusefederation.readwritecsv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		UserWriterReader UreadWrite1 = new UserWriterReader();
		
		UreadWrite1.addUser(new User("pippo", "franca", 24));
		UreadWrite1.addUser(new User("luca", "ferraro", 63));
		
		try {
			UreadWrite1.writeUsers(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(Arrays.asList(UreadWrite1.readUsers()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
