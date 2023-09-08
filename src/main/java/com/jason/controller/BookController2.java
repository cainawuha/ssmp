package com.jason.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jason.domain.Book;
import com.jason.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author:Jason
 * Date: 2023-09-07-11:39 a.m.
 * Description:
 */
//@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }


    @PutMapping
    public Boolean update(@RequestBody Book book) {
        return bookService.update(book, null);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return bookService.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return bookService.getPage(currentPage, pageSize);
    }
}
