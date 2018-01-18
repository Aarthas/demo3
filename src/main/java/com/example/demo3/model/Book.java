package com.example.demo3.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Book{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String booknName;
//    private BookCategory bookCategory;


//    @ManyToOne
//    @JoinColumn(name = "book_category_id")
//    public BookCategory getBookCategory() {
//        return bookCategory;
//    }
//
//    public void setBookCategory(BookCategory bookCategory) {
//        this.bookCategory = bookCategory;
//    }
}
