package com.liang.service.solo;

import com.liang.entity.bo.ShopCategory;
import com.liang.entity.dto.Result;

import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 18:04
 * @content
 */
public interface ShopCategoryService {

    Result<Boolean> addShopCategoryService(ShopCategory shopCategory);

    Result<Boolean> modifyShopCategoryService(ShopCategory shopCategory);

    Result<Boolean> removeShopCategoryService(int id);

    Result<ShopCategory> queryShopCategoryById(int id);

    Result<List<ShopCategory>> queryShopCategory(ShopCategory condition, int page, int pageSize);
    
}
