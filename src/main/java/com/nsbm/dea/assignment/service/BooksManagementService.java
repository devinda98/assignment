package com.nsbm.dea.assignment.service;

import com.nsbm.dea.assignment.model.Book;
import javassist.NotFoundException;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksManagementService {



    public List<Book> findAllBooks();

    public List<Book> searchBooks(String keyword);

    public Book findBookById(Long id) throws NotFoundException;

    public Book createBook(Book book);

    public Book updateBook(Book book);

    public Book deleteBook(Long id) throws NotFoundException;
}
