package com.nsbm.dea.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@ToString
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",unique = true, nullable = false, updatable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private  String type;
    @Column(name = "referenceCount")
    private String referenceCount;
    @Column(name = "borrowCount")
    private String borrowCount;

    public User(Long id, String name, String type, String referenceCount, String borrowCount) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.referenceCount = referenceCount;
        this.borrowCount = borrowCount;
    }
}
