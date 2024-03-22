package com.bookapp.util;

public class Queries {
    public static final String INSERTQUERY = "INSERT INTO BOOk(title,author,price,category";
    public static final String UPDATEQUERY = "UPDATE BOOK SET price=? where book_Id = ?";
    public static final String DELETEQUERY = "DELETE FROM BOOK where book_Id = ?";

    public static final String SELECTQUERY = "Select * FROM BOOK";
    public static final String SELECTBYAUTHORQUERY ="Select * FROM BOOK WHERE author=?";
    public static final String SELECTBYPRICEQUERY ="Select * FROM BOOK WHERE price<?";
    public static final String SELECTBYAUTHCATQUERY ="Select * FROM BOOK WHERE AUTHOR=?";
    public static final String SELECTBYIDQUERY ="Select * FROM BOOK WHERE book_id=?";
    
}
