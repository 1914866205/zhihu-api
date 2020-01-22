package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface FavoriteMapper {
    /**
     *收藏
     * @return List<Favorite>
     */
    @Select("select * from t_favorite order by voteup_count desc limit 0,4")
    List<Favorite> selectRecentFavorite();

    /**
     *
     * 查询所有收藏
     */
    @Select("select * from t_favorite")
    @Results({
            @Result(id=true,property="id",column ="id",javaType=Integer.class),
            @Result(property="title",column ="title",javaType=String.class),
            @Result(property="creator_name",column ="creator_name",javaType=String.class),
            @Result(property="creator_avatar",column ="creator_avatar",javaType=String.class),
            @Result(property="followers",column ="followers",javaType= Integer.class),
            @Result(property="total_count",column ="total_count",javaType=Integer.class),
            @Result(property="question_title",column ="question_title",javaType=String.class),
            @Result(property="answer_author_name",column ="answer_author_name",javaType=String.class),
            @Result(property="answer_content",column ="answer_content",javaType=String.class),
            @Result(property="voteup_count",column ="voteup_count",javaType=Integer.class),
            @Result(property="comment_count",column ="comment_count",javaType=Integer.class)})
    List<Map> selectAllFavorite();
}
