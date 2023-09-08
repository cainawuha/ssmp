package com.jason.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Author:Jason
 * Date: 2023-09-07-11:20 a.m.
 * Description:
 */
@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private IBookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(4));
    }
}
