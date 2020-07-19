package com.liang.service.combine.impl;

import com.liang.entity.bo.HeadLine;
import com.liang.entity.bo.ShopCategory;
import com.liang.entity.dto.MainPageInfoDTO;
import com.liang.entity.dto.Result;
import com.liang.service.combine.HeadLineShopCategoryCombineService;
import com.liang.service.solo.HeadLineService;
import com.liang.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 18:20
 * @content
 */
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

    private HeadLineService headLineService;

    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        // 1.获取头条列表
        HeadLine headLine = new HeadLine();
        headLine.setEnableStatus(1);
        Result<List<HeadLine>> headLineList = headLineService.queryHeadLine(headLine, 1, 4);
        // 2.获取店铺列表
        ShopCategory shopCategory = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryList = shopCategoryService.queryShopCategory(shopCategory, 1, 100);
        // 3.合并两者返回
        return mergeMainPageInfoResult(headLineList,shopCategoryList);
    }


    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineList, Result<List<ShopCategory>> shopCategoryList) {
        // TODO 合并信息返回
        return null;
    }
}
