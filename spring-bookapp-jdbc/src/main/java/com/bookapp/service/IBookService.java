package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {
    void addBook(Book book);

    void updateBook(int bookId, double price);

    void deleteBook(int bookId);

    List<Book> getAll();

    List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException;

    List<Book> getByAuthorContains(String author) throws BookNotFoundException;

    List<Book> getByCategory(String Category) throws BookNotFoundException;

    List<Book> getBypriceLessThan(double price) throws BookNotFoundException;

    List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;

    Book getById(int bookId) throws IdNotFoundException;

}


