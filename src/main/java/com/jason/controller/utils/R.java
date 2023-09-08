package com.jason.controller.utils;

import lombok.Data;

/**
 * Author:Jason
 * Date: 2023-09-07-12:51 p.m.
 * Description:
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R() {
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

}
