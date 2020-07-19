package com.liang.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * 商店类别
 *
 * @author liangyehao
 * @date 2020/07/19
 */
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
