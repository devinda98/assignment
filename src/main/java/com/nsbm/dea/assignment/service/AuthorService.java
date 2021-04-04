package com.nsbm.dea.assignment.service;

import com.nsbm.dea.assignment.model.Author;
import javassist.NotFoundException;

import java.util.List;

public interface AuthorService {

	public List<Author> findAllAuthors();

	public Author findAuthorById(Long id) throws NotFoundException;

	public void createAuthor(Author author);

	public void updateAuthor(Author author);

	public void deleteAuthor(Long id) throws NotFoundException;

}
