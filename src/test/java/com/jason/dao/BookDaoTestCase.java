package com.jason.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jason.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Author:Jason
 * Date: 2023-09-07-9:50 a.m.
 * Description:
 */
@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        bookDao.selectById(1);
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试添加功能").setName("测试数据").setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setType("测试添加功能abc").setName("测试数据").setDescription("测试数据123").setId(15);
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(15);
    }

    @Test
    void testGetAll() {
        bookDao.selectList(null);
    }

    @Test
    void testGetPage() {
        IPage page = new Page(2, 5);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.like("name", "Spring");
        bookDao.selectList(wrapper);
    }


    @Test
    void testGetByLambda() {
        String name = "Spring";
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Book::getName, name);
        bookDao.selectList(wrapper);
    }
}
