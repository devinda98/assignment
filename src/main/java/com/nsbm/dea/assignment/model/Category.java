package com.nsbm.dea.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@ToString
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cNumber" ,unique = true, nullable = false, updatable = false)
    private Long cNumber;
    @Column(name = "category")
    private String category;

    public Category(Long cNumber, String category) {
        this.category = category;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "categories")
    private List<Book> books ;

    public Long getcNumber() {
        return cNumber;
    }

    public void setcNumber(Long cNumber) {
        this.cNumber = cNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
