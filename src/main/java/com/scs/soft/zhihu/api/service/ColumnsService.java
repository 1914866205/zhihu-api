package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;

import java.util.List;
import java.util.Map;

public interface ColumnsService {

    /**
     * 查询所有专栏    */
    List<Map> selectAllColumns();

    /**
     * 查询热门专栏专题
     */
    List<Columns> selectRecentColumns();

}
