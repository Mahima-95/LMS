package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.library.entity.Book;
import com.library.repository.BookRepository;

public class BookService {

	@Autowired
	BookRepository bookRepository;

	public boolean isExists(Book book) {
		boolean isExists = false;
		if (!StringUtils.isEmpty(book)
				&& !StringUtils.isEmpty(book.getBookId())) {
			bookRepository.findOne(book.getBookId());
		}
		return isExists;
	}

	public String addBooks() {
		return null;

	}
}
