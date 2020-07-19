package com.liang.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * 头线
 *
 * @author liangyehao
 * @date 2020/07/19
 */
@Data
public class HeadLine {
    private Long lineId;
    private String lineName;
    private  String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;
}
