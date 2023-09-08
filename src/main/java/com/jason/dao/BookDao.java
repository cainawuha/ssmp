package com.jason.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jason.domain.Book;
import org.apache.ibatis.annotations.Mapper;


/**
 * Author:Jason
 * Date: 2023-09-07-9:48 a.m.
 * Description:
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
//    @Select("select * from tbl_book where id = #{id}")
//    Book getById(Integer id);

}
