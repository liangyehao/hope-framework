package com.liang.service.combine;

import com.liang.entity.dto.MainPageInfoDTO;
import com.liang.entity.dto.Result;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 18:16
 * @content
 */
public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
