package com.jason.domain;


import lombok.Data;
import lombok.experimental.Accessors;


/**
 * Author:Jason
 * Date: 2023-09-07-9:35 a.m.
 * Description:
 */
@Data
@Accessors(chain = true)
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
