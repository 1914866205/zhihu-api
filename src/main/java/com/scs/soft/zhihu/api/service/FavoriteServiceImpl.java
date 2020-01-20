package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.entity.Special;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoritemapper;
    @Override
    public List<Map> selectAllFavorite() {
        return favoritemapper.selectAllFavorite();
    }

    @Override
    public List<Favorite> selectRecentFavorite() {
        return favoritemapper.selectRecentFavorite();
    }
}
