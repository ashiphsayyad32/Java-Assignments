package com.bms.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Book {
	
	@Min(3)
	@NonNull
	private int id;
	
	@NotEmpty(message = "Title Cannot be Blank")
	@Size(min=3)
	private String title;
	
	@NotEmpty(message = "Author Cannot be Blank")
	@Size(min=3, max=10)
	private String author;
	
	@NotEmpty(message = "Publisher Cannot be Blank")
	@Size(min=3, max=10)
	private String publisher;
	
	public Book() {}

	public Book(int id, String title, String author, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
	

}
