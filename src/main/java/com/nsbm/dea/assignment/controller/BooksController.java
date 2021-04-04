package com.nsbm.dea.assignment.controller;

import com.nsbm.dea.assignment.model.Book;
import com.nsbm.dea.assignment.service.AuthorService;
import com.nsbm.dea.assignment.service.BooksManagementService;
import com.nsbm.dea.assignment.service.CategoryService;
import com.nsbm.dea.assignment.service.PublisherService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksController {

    @Autowired
    BooksManagementService booksManagementService;
    @Autowired
    AuthorService authorService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    PublisherService publisherService;
    @GetMapping("/books")
    public List<Book> findAllBooks(){
        return booksManagementService.findAllBooks();
    }

    @PostMapping("/addbooks")
    public Book addSong(@RequestBody Book book){
        return booksManagementService.createBook(book);
    }
    @GetMapping("/searchBook")
    public List searchBook(@Param("keyword") String keyword) {
        List<Book> books = booksManagementService.searchBooks(keyword);
        return books;
    }
    @GetMapping("/book/{id}")
    public Book findBookById(@PathVariable("id") Long id) throws NotFoundException {
        final Book book = booksManagementService.findBookById(id);
        return book;
    }

}


