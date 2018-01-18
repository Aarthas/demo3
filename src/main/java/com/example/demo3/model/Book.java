package com.example.demo3.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "book1")
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
