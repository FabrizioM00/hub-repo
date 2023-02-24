package com.giusefederation.readwritecsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserWriterReader {
	
	List<User> users;
	
	
	
	public UserWriterReader() {
		this.users = new ArrayList<User>();
	}

	public void addUser(User user) {
		users.add(user);
	}
	
	/**
	 * metodo che scrive gli utenti su file csv
	 * @param append true aggiungi utenti a quelli già esistenti nel file, false se voglio sovrascriverli
	 * @throws IOException
	 */
	public void writeUsers(boolean append) throws IOException {
		File folder = new File("C:\\Users\\username\\Desktop\\docs");
		if(!folder.exists())
			folder.mkdirs();
		
		File csv = new File(folder, "users.csv");
		if(!csv.exists())
			csv.createNewFile();
		
		PrintWriter writer = new PrintWriter(new FileWriter(csv, append));
		for (User user : users) {
			writer.println(user.toCSVString());
		}
		writer.flush();
		writer.close();
	}
	
	/**
	 * metodo che legge gli utenti da file csv
	 * @return la lista degli utenti letti da csv
	 * @throws FileNotFoundException
	 */
	public List<User> readUsers() throws FileNotFoundException {
		File csv = new File("C:\\Users\\username\\Desktop\\docs\\users.csv");
		List<User> readedUsers = new ArrayList<User>();
		
		Scanner myReader = new Scanner(csv);
		while (myReader.hasNextLine()) {
	        String[] data = myReader.nextLine().split(",");
	        readedUsers.add(new User(data[0], data[1], Integer.parseInt(data[2])));
	      }
		myReader.close();
		return readedUsers;
	}
	

	
}
