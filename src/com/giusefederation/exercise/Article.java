package com.giusefederation.exercise;

public class Article {
	
	private int id;
	private String subject;
	private String description;
	private String author;
	
	
	
	public Article(int id, String subject, String description, String author) {
		this.id = id;
		this.subject = subject;
		this.description = description;
		this.author = author;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "\nArticle [id=" + id + ", subject=" + subject + ", description=" + description + ", author=" + author
				+ "]";
	}
	
	
	
}
