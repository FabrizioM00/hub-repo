package com.giusefederation.exercise;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Blog b1 = new Blog();
		b1.addArticle(new Article(1, "il mio titolo", "la mia descrizione", "-pippo franco"));
		b1.addArticle(new Article(2, "abc", "qwe", "-maria"));
		b1.addArticle(new Article(3, "asdasd", "ewqewq", "-carletto"));
		b1.addArticle(new Article(4, "altro titolo", "description", "-basso ma bello"));
		b1.addArticle(new Article(5, "i draghi", "i draghi sono bellissimi", "-targaryen"));
		b1.addArticle(new Article(6, "titolona", "descriziona", "-filippa francesca"));
		System.out.println(Arrays.toString(b1.getArticles()));
		
	}

}
