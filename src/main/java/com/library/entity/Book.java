package com.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	@Column(name = "BOOK_ID", nullable = false)
	public int bookId;

	@Column(name = "BOOK_NAME", nullable = false)
	public String bookName;

	@Column(name = "BOOK_AUTHOR", nullable = false)
	public String bookAuthor;

	@Column(name = "BOOK_COST", nullable = false)
	public String bookCost;

	@Column(name = "STATUS", nullable = false)
	private String status;

	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String bookAuthor,
			String bookCost, String status) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
		this.status = status;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookCost() {
		return bookCost;
	}

	public void setBookCost(String bookCost) {
		this.bookCost = bookCost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookAuthor=" + bookAuthor + ", bookCost=" + bookCost
				+ ", status=" + status + "]";
	}

}
