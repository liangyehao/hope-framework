package com.liang.entity.dto;

import com.liang.entity.bo.HeadLine;
import com.liang.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 18:17
 * @content
 */
@Data
public class MainPageInfoDTO {

    private List<HeadLine> headLineList;

    private List<ShopCategory> shopCategoryList;

}
