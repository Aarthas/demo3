package com.example.demo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookService {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List findAll() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM book1");
        return maps;
    }
}
