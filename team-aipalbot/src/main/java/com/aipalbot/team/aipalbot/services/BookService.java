package com.aipalbot.team.aipalbot.services;

import com.aipalbot.team.aipalbot.models.Book;

public class BookService {
	
	public String read(Book book) {
		
		String response = "I read a Book:" + book.getName()+ " " + book.getAuthor();
		
		return response;
	}
  public Book prepareBook(String author, String name) {
	  
	  Book book = new Book();
	  
	 book.setAuthor(author);
	 book.setName(name);
	 
	 return book;
  }
}
