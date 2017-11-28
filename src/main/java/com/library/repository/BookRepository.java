package com.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	public Book findByBookIdAndStatus(Integer bookId, boolean status);
	
	public Book findByBookNameAndStatus(String bookName,boolean status);
}
