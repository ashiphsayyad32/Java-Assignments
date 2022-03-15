package com.bms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bms.model.Book;


@Service
public class BookService {

	List<Book> booklist = new ArrayList<Book>();
	
	public BookService() {
		booklist.add(new Book(100,"Maths","ashiph", "nahid s"));
		booklist.add(new Book(101,"Physics","ankit c", "ashiph"));
		booklist.add(new Book(102,"Chemistry","arib k", "ankit"));
		booklist.add(new Book(103,"Bio","aniket", "arib"));
	}
	
	public List<Book> getAllBooks(){
		return booklist;
	}
	
	public void addBook(Book book) {
		booklist.add(book);
	}
	
	public void deleteBook(int id) {
		booklist.removeIf(book->book.getId()==id);
	}
	
	public Book getEmployeeById(int id) {
		Book book1 = booklist.stream().filter(book->book.getId()==id).findFirst().get();
		return book1;
	}
	
	public void updateBook(Book book) {
		Book book1 = booklist.stream().filter(book2 -> book2.getId()==book.getId()).findFirst().get();
		int index = booklist.indexOf(book1);
		booklist.set(index, book);
	}
}
