package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Override
    public List<Map> selectAllRound() {
        return roundTableMapper.selectAllRound();
    }

    @Override
    public List<RoundTable> selectRecentRound() {
        return roundTableMapper.selectRecentRound();
    }
}
