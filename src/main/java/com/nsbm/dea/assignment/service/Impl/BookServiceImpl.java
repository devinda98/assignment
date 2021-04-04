package com.nsbm.dea.assignment.service.Impl;


import com.nsbm.dea.assignment.model.Book;
import com.nsbm.dea.assignment.persitence.BooksRepository;
import com.nsbm.dea.assignment.service.BooksManagementService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BookServiceImpl implements BooksManagementService {

    @Autowired
	private final BooksRepository bookRepository;

	public BookServiceImpl(BooksRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> searchBooks(String keyword) {
		if (keyword != null) {
			return bookRepository.search(keyword);
		}
		return bookRepository.findAll();
	}

	@Override
	public Book findBookById(Long id) throws NotFoundException {
		return bookRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Book not found with ID %d", id)));
	}

	@Override
	public Book createBook(Book book) {
		bookRepository.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		bookRepository.save(book);
		return book;
	}

	@Override
	public Book deleteBook(Long isbn) throws NotFoundException {
		final Book book = bookRepository.findById(isbn)
				.orElseThrow(() -> new NotFoundException(String.format("Book not found with ID %d", isbn)));

		//bookRepository.deleteById();
		return book;
	}

}
