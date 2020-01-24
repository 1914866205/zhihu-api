package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;
    @Override
    public List<Map> selectAllColumns() {
        return columnsMapper.selectAllColumns();
    }

    @Override
    public List<Columns> selectRecentColumns() {
        return columnsMapper.selectRecentColumns();
    }
}
