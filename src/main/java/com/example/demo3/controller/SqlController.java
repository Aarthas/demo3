package com.example.demo3.controller;


import com.example.demo3.model.Book;
import com.example.demo3.model.BookCategory;
import com.example.demo3.repository.BookCategoryRepository;
import com.example.demo3.repository.BookRepository;
import com.example.demo3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class SqlController {
    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    @Autowired
    BookService bookService;
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/sql/add")
    public String index() {
        Book book_a1 = new Book();
        book_a1.setBooknName("AAA");
//        book_a1.s
        bookRepository.save(book_a1);

        BookCategory bookCategory = new BookCategory();
        bookCategory.setName("renwen");
        bookCategoryRepository.save(bookCategory);
        return "add success";
    }

    @RequestMapping("/sql/delete")
    public String delete() {
//        Book book_a1 = new Book("BookA1");
//        bookRepository.save(book_a1);
        bookRepository.delete(2);
//        BookCategory bookCategory = new BookCategory("BookCategory1");
//        bookCategoryRepository.save(bookCategory);
        return "delete success";
    }


    @RequestMapping("/sql/update")
    public String update() {
        Book one = bookRepository.findOne(3);
        one.setBooknName("qqq");

        bookRepository.save(one);
        return "update success";
    }

    @RequestMapping("/sql/query")
    public Object query() {
//        List<Book> all = bookRepository.findAll();
        List<Book> all =  bookService.findAll();
        return all;
    }
//    @Transactional
//    public void run(String... strings) throws Exception {
    // save a couple of categories
//        BookCategory categoryA = new BookCategory("Category A");
//        Set bookAs = new HashSet<Book>(){{
//            add(new Book("Book A1", categoryA));
//            add(new Book("Book A2", categoryA));
//            add(new Book("Book A3", categoryA));
//        }};
//        categoryA.setBooks(bookAs);
//
//        BookCategory categoryB = new BookCategory("Category B");
//        Set bookBs = new HashSet<Book>(){{
//            add(new Book("Book B1", categoryB));
//            add(new Book("Book B2", categoryB));
//            add(new Book("Book B3", categoryB));
//        }};
//        categoryB.setBooks(bookBs);
//
//        bookCategoryRepository.save(new HashSet<BookCategory>() {{
//            add(categoryA);
//            add(categoryB);
//        }});
//
//        // fetch all categories
//        for (BookCategory bookCategory : bookCategoryRepository.findAll()) {
//            logger.info(bookCategory.toString());
//        }
//    }

    @RequestMapping("/aa")
    public HashMap aa() {
        HashMap hashMap = new HashMap();
        hashMap.put("aaa", "asf");
        hashMap.put("ccc", "ccc");
        return hashMap;
    }
}
