package com.giusefederation.exercise;

import java.util.Arrays;

public class App {
	
	public static String capitalizeFirstChars(String src) {
		String[] splittedString = src.trim().split(" ");
		String newstr = "";
		for (String str : splittedString) {
			if(Character.isDigit(str.charAt(0))) {
				for (int i = 0; i < str.length(); i++) {
					if(Character.isLetter(str.charAt(i))) {
						newstr = newstr + " " + str.replace(str.charAt(i), Character.toUpperCase(str.charAt(i)));
						i = str.length();
					}
				}
			} else {
				newstr = 
						newstr + " " + str.substring(0, 1).toUpperCase() 
						+ str.substring(1).toLowerCase();
			}
		}
		
		newstr = newstr.substring(1);
		return newstr;
	}

	public static void main(String[] args) {
		
		System.out.println(capitalizeFirstChars("eric cartman"));
        System.out.println(capitalizeFirstChars("ERIC CARTMAN"));
        System.out.println(capitalizeFirstChars("eric 90cartman"));
        System.out.println(capitalizeFirstChars(" eric 90cartman"));
		
		
		
		
		
		
//		Blog b1 = new Blog();
//		b1.addArticle(new Article(1, "il mio titolo", "la mia descrizione", "-pippo franco"));
//		b1.addArticle(new Article(2, "abc", "qwe", "-maria"));
//		b1.addArticle(new Article(3, "asdasd", "ewqewq", "-carletto"));
//		b1.addArticle(new Article(4, "altro titolo", "description", "-basso ma bello"));
//		b1.addArticle(new Article(5, "i draghi", "i draghi sono bellissimi", "-targaryen"));
//		b1.addArticle(new Article(6, "titolona", "descriziona", "-filippa francesca"));
//		System.out.println(Arrays.toString(b1.getArticles()));

	}

}
