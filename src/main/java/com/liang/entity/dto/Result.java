package com.liang.entity.dto;

import lombok.Data;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 17:08
 * @content
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
}
