package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.springboot.service.BookService;

@SpringBootApplication
public class BookDataJpaCompositePriKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BookDataJpaCompositePriKeyApplication.class, args);
		BookService service = context.getBean(BookService.class);
		service.saveBook();
	}

}
