package com.bookapp.repositary;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookRepositary {
    void addBook(Book book);
    void updateBook(int bookId,double price);
    void deleteBook(int bookId);
    Book getById(int bookId) throws IdNotFoundException;

    List<Book> findAll();
    List<Book> findByAuthorContains(String author) throws BookNotFoundException;
    List<Book> findByLessPrice(double price) throws BookNotFoundException;
    List<Book> findByAuthorContainsAndcategory (String author,String category) throws BookNotFoundException;
	Book findById(int bookId) throws IdNotFoundException;
}
