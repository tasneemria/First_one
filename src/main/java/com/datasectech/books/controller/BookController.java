package com.datasectech.books.controller;

import com.datasectech.books.entity.AuthorEntity;
import com.datasectech.books.entity.BookEntity;
import com.datasectech.books.repository.AuthorRepository;
import com.datasectech.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/book")
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping("/author")
    public List<AuthorEntity> findAth(){
        return authorRepository.findAll();
    }

    @RequestMapping("/test")
    public String testMap(){
        return bookRepository.findAll().toString();
    }

    @PostMapping("/add_user")
    BookEntity bookEntity(@RequestBody BookEntity bookEntity){
        return bookRepository.save(bookEntity);
    }

    @PostMapping("/add_author")
    AuthorEntity authorEntity (@RequestBody AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }

    @DeleteMapping("/del_book/{id}")
    void deleteEmployee(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }


//    @RequestMapping("/{id}")
//    public String find(@PathVariable Long id){
//        BookEntity bookEntity = bookRepository.findById(id);
//        return  bookEntity.;
//    }

    @RequestMapping("/")
    public String index(){
        return "home";
    }
}

