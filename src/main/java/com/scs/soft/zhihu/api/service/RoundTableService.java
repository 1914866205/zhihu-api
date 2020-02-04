package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;

public interface RoundTableService {
    //查询所有圆桌
    List<Map> selectAllRound();
    //查询热门圆桌
    List<RoundTable> selectRecentRound();
}
