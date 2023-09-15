package com.curdoperation.actions.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdoperation.actions.model.Book;
import com.curdoperation.actions.repository.ActionsRepository;
import com.curdoperation.actions.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private ActionsRepository actionsRepository;

	List<Book> list;
	public BookServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public List<Book> getAllBooks() {
		
		return list;
	}

	@Override
	public Book createBook(Book book) {
		list.add(book);
		return book;
	}

	@Override
	public Book getBookById(Integer id) {
		Book b = null;
		for (Book book : list) {
			if (book.getBookId() == id) {
				b = book;
				break;
			}
		}
		return b;
	}

	@Override
	public void deleteAllBooks() {
		list.removeAll(list);

	}

	@Override
	public Book updateBook(Book book) {
		Book c = null;
		for (Book b : list) {
			if (book.getBookId() == b.getBookId()) {
				b.setAuthor(book.getAuthor());
				b.setBookName(book.getBookName());
				b.setPrice(book.getPrice());
				c = b;
				break;
			}
		}
		return c;
	}

	@Override
	public Book deleteBookById(Integer id) {
		Book b = null;
		for (Book book : list) {
			if (book.getBookId() == id) {
				b = book;
				list.remove(b);
			}
		}
		return b;
	}

	@Override
	public Book addBook(Book book) {
		return actionsRepository.save(book);
	}

	@Override
	public List<Book> bookAllBooksRepo() {

		return actionsRepository.findAll();
	}

	@Override
	public Book getBookByIdRepo(Integer bookId) {

		return actionsRepository.findById(bookId).get();
	}

	@Override
	public Book updateBookRepo(Integer bookId, Book book) {

		Book b = actionsRepository.findById(bookId).get();
		b.setAuthor(book.getAuthor());
		b.setPrice(book.getPrice());
		b.setBookName(book.getBookName());

		return actionsRepository.save(b);

	}

	@Override
	public void deleteAllBooksRepo() {
		 actionsRepository.deleteAll();
	
	}

	@Override
	public void deleteBookByIdRepo(Integer bookId) {
		 actionsRepository.deleteById(bookId);
	}
}
