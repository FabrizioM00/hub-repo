package com.giusefederation.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App {

//	public static void main(String[] args) throws IOException {
//		File documentiDir = new File("C:\\Users\\username\\Desktop\\docs");
//		if(!documentiDir.exists()) {
//		documentiDir.mkdirs(); // make directoriefl
//		}
//		
//		File readme = new File(documentiDir, "readme.txt");
//		if(!readme.exists()) {
//
//		readme.createNewFile();
//		}
//		String absolutePath = readme.getAbsolutePath();
//		System.out.println(absolutePath);
//		
//	
//		FileOutputStream outputStream = new FileOutputStream(readme);
//		outputStream.write((byte) 99);
//		outputStream.write((byte) 98);
//		outputStream.write((byte) 97);
//		outputStream.flush();
//		outputStream.close();
//		
//		
//		
//		byte[] datas = new byte[2];
//
//		InputStream inputStream = new FileInputStream(readme);
//
//		int readed = 0;
//
//		while((readed = inputStream.read(datas)) != -1) {
//		System.out.println("dati validi: " + readed + "bytes");
//		System.out.println(Arrays.toString(datas));
//
//		}
//
//		inputStream.close();
//
//	}
	public static void main(String[] args) throws IOException {
		String firstname = "eric";

		byte[] firstnameBytes = firstname.getBytes();
		System.out.println(firstnameBytes.length);
		System.out.println(Arrays.toString(firstnameBytes));
	}

}
