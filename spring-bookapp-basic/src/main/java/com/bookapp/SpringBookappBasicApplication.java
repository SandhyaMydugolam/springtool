package com.bookapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}
	@Autowired
	private IBookService bookService;

	@Override
	public void run(String... args) throws Exception {
		List<Book> booksByCategory;
		 booksByCategory = bookService.getByCategory("games");
         for (Book book : booksByCategory){
             System.out.println(book);
         }
		
	}

}
