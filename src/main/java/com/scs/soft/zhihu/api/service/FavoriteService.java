package com.scs.soft.zhihu.api.service;
import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

public interface FavoriteService {

    /**
     * 查询所有专题
     */
    List<Map> selectAllFavorite();

    /**
     * 查询最新专题
     */
    List<Favorite> selectRecentFavorite();


}
