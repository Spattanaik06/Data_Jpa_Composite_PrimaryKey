package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bean.Book;
import com.springboot.primarykey.BookPrimaryKey;
@Repository
public interface BookRepo extends JpaRepository<Book, BookPrimaryKey>
{
	
}
