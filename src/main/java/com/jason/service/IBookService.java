package com.jason.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jason.domain.Book;

/**
 * Author:Jason
 * Date: 2023-09-07-11:28 a.m.
 * Description:
 */
public interface IBookService extends IService<Book> {
    IPage<Book> getPage(int currentPage, int pageSize);

}
