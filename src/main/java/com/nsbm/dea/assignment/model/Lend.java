package com.nsbm.dea.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "lend")
public class Lend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",unique = true, nullable = false, updatable = false)
    private Long id;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "uid")
    private String uid;
    @Column(name = "borrowDate")
    private String borrowDate;
    @Column(name = "returnDate")
    private String returnDate;


    public Lend(Long id, String isbn, String uid, String borrowDate, String returnDate) {
        this.id = id;
        this.isbn = isbn;
        this.uid = uid;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
}
