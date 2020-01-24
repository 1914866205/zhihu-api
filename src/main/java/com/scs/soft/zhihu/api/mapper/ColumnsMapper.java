package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ColumnsMapper {
    /**
     * 专栏
     * @return
     */
    @Select("select * from t_columns order by followers desc limit 0,4")
    List<Columns> selectRecentColumns();


    /**
     *
     * 查询所有专栏
     */
    @Select("select * from t_columns")
    @Results({
            @Result(id=true,property="id",column ="id",javaType=Integer.class),
            @Result(property="title",column ="title",javaType=String.class),
            @Result(property="description",column ="description",javaType=String.class),
            @Result(property="url",column ="url",javaType=String.class),
            @Result(property="image_url",column ="image_url",javaType=String.class),
            @Result(property="followers",column ="followers",javaType=Integer.class),
            @Result(property="articles_count",column ="articles_count",javaType=Integer.class)})
    List<Map> selectAllColumns();
}
