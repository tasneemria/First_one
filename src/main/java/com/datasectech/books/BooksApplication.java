package com.datasectech.books;

import com.datasectech.books.entity.AuthorEntity;
import com.datasectech.books.entity.BookEntity;
import com.datasectech.books.repository.AuthorRepository;
import com.datasectech.books.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BooksApplication {

	public static void main(String[] args) {

		SpringApplication.run(BooksApplication.class, args);

	}

	@Bean
	public CommandLineRunner demo(BookRepository bookRepository){
		return (args) ->{

			//bookRepository.save(new BookEntity("abc", "me") );
			//bookRepository.save(new BookEntity("b1", "a1" ));

		};
	}

	@Bean
	public CommandLineRunner demo2(AuthorRepository authorRepository){
		return (args) ->{
			//authorRepository.save(new AuthorEntity("a1", "b1"));
		};
	}



}
