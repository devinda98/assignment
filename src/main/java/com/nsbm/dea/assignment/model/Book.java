package com.nsbm.dea.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;



@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isbn")
    private Long isbn;

    @Column(name = "bookTitle")
    private String bookTitle;

    @Column(name = "status")
    private String status;

    public Book(Long id, Long isbn, String bookTitle, String status) {
        this.id = id;
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.status = status;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "books_authors", joinColumns = { @JoinColumn(name = "isbn") }, inverseJoinColumns = {
            @JoinColumn(name = "authorId") })
    private List<Author> authors;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "books_categories", joinColumns = { @JoinColumn(name = "isbn") }, inverseJoinColumns = {
            @JoinColumn(name = "cNumber") })
    private List<Category> categories;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "books_publisher", joinColumns = { @JoinColumn(name = "isbn") }, inverseJoinColumns = {
            @JoinColumn(name = "publisherId") })
    private List<Publisher> publishers;

}
