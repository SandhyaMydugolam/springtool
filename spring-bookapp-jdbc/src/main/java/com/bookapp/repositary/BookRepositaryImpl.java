package com.bookapp.repositary;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;
@Repository
public class BookRepositaryImpl implements IBookRepositary {
private JdbcTemplate jdbcTemplate;//responsible for db operations
	
	
	
    public BookRepositaryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public void addBook(Book book) {
		Object[] bookArray = {book.getTitle(),book.getAuthor(),book.getPrice(),book.getCategory()};
		jdbcTemplate.update(Queries.INSERTQUERY,bookArray);
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY,price,bookId);
		
	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY,bookId);
	}

	

	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return books;
	}



	@Override
	public List<Book> findByLessPrice(double price) throws BookNotFoundException {
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYPRICEQUERY,new BookMapper(), price);
		return books;
	}

	

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		Book book = jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY,Book.class,bookId);
		return book;
	}


	@Override
	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY, (rs, rowNum)->{
			Book book = new Book();
			book.setAuthor(rs.getString("author"));
			book.setBookId(rs.getInt("book_id"));
			book.setTitle(rs.getString("title"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
			
		},author);
		
	}


	

	@Override
	public List<Book> findByAuthorContainsAndcategory(String author, String category) throws BookNotFoundException {
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYAUTHCATQUERY,new BookMapper(),author,category);
		return books;
	}


	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		Book book = jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY,new BookMapper(),bookId);
		return book;
	}


	

	


}
