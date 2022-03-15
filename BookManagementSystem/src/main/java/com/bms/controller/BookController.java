package com.bms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bms.model.Book;
import com.bms.service.BookService;


@Controller
public class BookController {

	@Autowired
	private BookService bookservice;
	
	@GetMapping("/getAllBooks")
	public ModelAndView getAllBooks() {
		List<Book> booklist = bookservice.getAllBooks();
		return new ModelAndView("displayAllBook","bookList", booklist);
	}
	
	@GetMapping("/addBook")
	public String showForm(Model model) {
		model.addAttribute("book", new Book());
		return "addBookPage";
	}
	
	@PostMapping("/addBook")
	public ModelAndView addBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("addBookPage","book",book);
		}
		bookservice.addBook(book);
		return new ModelAndView("displayAllBook","bookList",bookservice.getAllBooks());
	}
	
	@GetMapping("/deleteBook/{id}")
	public ModelAndView deleteBook(@PathVariable int id) {
		bookservice.deleteBook(id);
		return new ModelAndView("displayAllBook","bookList", bookservice.getAllBooks());
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView showBook(@PathVariable int id) {
		Book book = bookservice.getEmployeeById(id);
		return new ModelAndView("updateBook","book",book);
	}
	
	@PostMapping("/updateBook")
	public ModelAndView updateBook(@ModelAttribute("book") Book book ) {
		bookservice.updateBook(book);
		return new ModelAndView("displayAllBook","bookList", bookservice.getAllBooks());
	}
	
	@GetMapping("/getBookById")
	public String showFormId() {
		return "displayAllBook";
	}
	
	@PostMapping("/getBook")
	public ModelAndView getBookById(@RequestParam("id") int id) {
		Book book = bookservice.getEmployeeById(id);
		return new ModelAndView("bookbyid", "bookInfo", book);

	}
	
}
