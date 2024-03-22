package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repositary.IBookRepositary;
@Service
public  class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookRepositary bookRepositary;
	
	

	@Override
	public void addBook(Book book) {
		bookRepositary.addBook(book);		
	}

	@Override
	public void updateBook(int bookId, double price) {
		bookRepositary.updateBook(bookId, price);
		
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepositary.deleteBook(bookId);
		
	}

	@Override
	public List<Book> getAll() {
		List<Book> books = bookRepositary.findAll();
		return books;
	}

	@Override
	public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
		List<Book> books =bookRepositary.findByAuthorContains(author);
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books =bookRepositary.findByAuthorContains(author);
		return books;
	}

	@Override
	public List<Book> getByCategory(String Category) throws BookNotFoundException {
		List<Book> books = bookRepositary.findByAuthorContains(Category);
		return books;
	}

	@Override
	public List<Book> getBypriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = bookRepositary.findByLessPrice(price);
		return books;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = bookRepositary.findByAuthorContainsAndcategory(author, category);
		return books;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		Book books = bookRepositary.findById(bookId);
		return books;
	}


	

}