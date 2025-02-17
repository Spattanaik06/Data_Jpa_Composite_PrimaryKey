package com.springboot.primarykey;

import org.springframework.stereotype.Component;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookPrimaryKey 
{
	
	private Integer bookId;
	private String bookName;
	
	public BookPrimaryKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookPrimaryKey(Integer bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
	
}
