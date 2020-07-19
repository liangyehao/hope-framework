package com.liang.service.solo;

import com.liang.entity.bo.HeadLine;
import com.liang.entity.dto.Result;

import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 18:03
 * @content
 */
public interface HeadLineService {

    Result<Boolean> addHeadLineService(HeadLine headLine);

    Result<Boolean> modifyHeadLineService(HeadLine headLine);

    Result<Boolean> removeHeadLineService(int id);

    Result<HeadLine> queryHeadLineById(int id);

    Result<List<HeadLine>> queryHeadLine(HeadLine condition, int page, int pageSize);


}
