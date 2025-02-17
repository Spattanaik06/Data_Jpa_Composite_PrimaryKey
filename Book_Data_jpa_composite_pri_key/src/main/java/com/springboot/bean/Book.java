package com.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.primarykey.BookPrimaryKey;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "book_details")
public class Book 

{
	private Double bookPrice;
	private String bookAuthor;
	
	@EmbeddedId
	public BookPrimaryKey primaryKey;

	public Book(Double bookPrice, String bookAuthor, BookPrimaryKey primaryKey) {
		super();
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
		this.primaryKey = primaryKey;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public BookPrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(BookPrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
