package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bean.Book;
import com.springboot.primarykey.BookPrimaryKey;
import com.springboot.repo.BookRepo;
@Service
public class BookService 
{
	@Autowired
	private BookRepo bookRepo;
	
	BookPrimaryKey pBookPrimaryKey=new BookPrimaryKey(1234, "The Half Baked Love Story");
	Book book =new Book(1245.00, "Gunjan Narang & Anurag Garg", pBookPrimaryKey);
	
	
	public void saveBook()
	{
		bookRepo.save(book);
		System.out.println("Book Saved Successfully....");
	}
}
