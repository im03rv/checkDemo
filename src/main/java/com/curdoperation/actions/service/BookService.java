package com.curdoperation.actions.service;

import java.util.List;

import com.curdoperation.actions.model.Book;

public interface BookService {
	List<Book> getAllBooks();// get

	Book createBook(Book book);// post

	Book getBookById(Integer id); // get by id

	void deleteAllBooks(); // delete all

	Book updateBook(Book book); // update

	Book deleteBookById(Integer id); // delete particular id

	Book addBook(Book book);

	List<Book> bookAllBooksRepo();

	Book getBookByIdRepo(Integer bookId);

	Book updateBookRepo(Integer bookId, Book book);

	void deleteAllBooksRepo();

	void deleteBookByIdRepo(Integer bookId);

}
