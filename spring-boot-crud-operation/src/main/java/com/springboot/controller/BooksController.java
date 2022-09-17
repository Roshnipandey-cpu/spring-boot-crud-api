package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.springboot.model.Books;
import com.springboot.service.BooksService;


@RestController
@RequestMapping("/")
public class BooksController {
	@Autowired
	private BooksService bookService;
	
	 @PostMapping("/books")
	    public Books saveBooks(@Validated @RequestBody Books books)
	    {
	        return bookService.saveBook(books);
	    }
	 
	 @PostMapping("/allbooks")
	    public String saveAllBooks(@Validated @RequestBody List<Books> books)
	    {
	        bookService.saveAllBook(books);
	        return "All List of Books get Saved";
	    }
	 
	 
	 
	 
	 
	 @GetMapping("/books/{bid}")
	 public Books getBooks(@PathVariable("id") int bid){
		 return bookService.getBooks(bid);
	 }


}