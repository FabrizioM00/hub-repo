package com.giusefederation.exercise;

import java.util.Arrays;

public class App {
	
	public static String capitalizeFirstChars(String src) {
		String[] splittedString = src.trim().split("\\s+");
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
	
	
//	public static String capitalize(String src) {
//		src = src.toLowerCase();
//		char[] chars = src.toCharArray();
//		
//		chars[0] = Character.toUpperCase(chars[0]);
//		
//		for (int i = 0; i < chars.length - 1; i++) { //confrontare carattere successivo con quello precedente
//			if(!Character.isLetter(chars[i]) && Character.isLetter(chars[i+1])) {
//				chars[i + 1] = Character.toUpperCase(chars[i + 1]);
//			}
//		}
//		return new String(chars);
//	}
    
	
	public static String capitalize(String src) {
		src = src.toLowerCase();
		char[] chars = src.toCharArray();
		chars[0] = Character.toUpperCase(chars[0]);
		boolean flag = false;
		
		for (int i = 0; i < chars.length - 1; i++) //confrontare carattere successivo con quello precedente
			if(!Character.isLetter(chars[i]) && Character.isLetter(chars[i+1])) {
				for(int k = i; k >= 0 && !Character.valueOf(chars[k]).equals(' ') ; k--) 
					if(Character.isUpperCase(chars[k]))
						flag = true;
				if(!flag)
					chars[i + 1] = Character.toUpperCase(chars[i + 1]);
				flag = false;
			}
		return new String(chars);
	}

	public static void main(String[] args) {
		
		System.out.println(capitalize("eric cartman"));
        System.out.println(capitalize("ERIC CARTMAN"));
        System.out.println(capitalize("eric 90cartman"));
        System.out.println(capitalize(" eric 90cartman"));
        System.out.println(capitalize("eric cart90man"));
        System.out.println(capitalize("1a b1 b/a|a/s/as23d!a/   9a0 1a  eric  90car90tman 90ciao90  3ne!  n3e  90ciaona   1a 1b 2b 1b1b b1 b b1"));
        
        
        
		
		
		
		
		
		
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
