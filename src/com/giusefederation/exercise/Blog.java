package com.giusefederation.exercise;

public class Blog {
	
	
	private Article[] articles;
	
	public Blog() {
		this.articles = new Article[2];
	}
	
	public Blog(Article article) {
		this.articles = new Article[2];
		addArticle(article);
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}
	
	public void addArticle(Article article) {
		if(!(articles[articles.length - 1] == null)) {
			Article[] newArticles = new Article[articles.length * 2];
			for (int i = 0; i < articles.length; i++) {
				newArticles[i] = articles[i];
			}
			articles = newArticles;
		}
		
		for (int i = 0; i < articles.length; i++)
			if(articles[i] == null) {
				articles[i] = article;
				return;
			}
		
	}
	
}
