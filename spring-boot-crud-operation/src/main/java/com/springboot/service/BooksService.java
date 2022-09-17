package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.model.Books;
import com.springboot.repo.BookRepository;


public class BooksService {
	
	  @Autowired
	    private BookRepository bookRepository;
	  
	  //save
	  public Books saveBook(Books book) {
		
		return bookRepository.save(book);
		  
	  }
	//saveAll
	  public List<Books> saveAllBook(List<Books> books) {
		
		return bookRepository.saveAll(books);
		  
	  }

	public Books getBooks(int bid) {
		
		return bookRepository.getById(bid);
	}
	  
	  //read

	  
	  //update
	  
	  
	  //delete
}
