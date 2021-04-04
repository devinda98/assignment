package com.nsbm.dea.assignment.persitence;

import com.nsbm.dea.assignment.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE b.bookTitle LIKE %?1%" + " OR b.isbn LIKE %?1%")
    public List<Book> search(String keyword);
}
