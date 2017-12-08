package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.library.entity.Book;
import com.library.enums.LoginType;
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

	public String addBooks(Book book, LoginType loginType) {

		String response="Please verify your";
		if (!StringUtils.isEmpty(book) && !StringUtils.isEmpty(loginType)) {
			if ((loginType == LoginType.LIBRARIAN || loginType == LoginType.ADMIN)
					&& !isExists(book)) {

			}
		}else{
			
		}
		return null;

	}
}
