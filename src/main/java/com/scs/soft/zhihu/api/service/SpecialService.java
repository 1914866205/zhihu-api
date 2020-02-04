package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;
public interface SpecialService {
    /**
     * 查询所有专题
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     */
    List<Special> selectRecent();


}
