package com.mose.bookApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long authorId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "author")
    @JsonIgnore
    private List <Book> bookList;
}
