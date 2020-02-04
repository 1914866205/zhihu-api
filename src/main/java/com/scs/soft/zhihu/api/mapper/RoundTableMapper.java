package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface RoundTableMapper {
    /**
     * 圆桌
     * @return
     */
    @Select("select * from t_round_table order by visits_count desc limit 0,4")
    List<RoundTable> selectRecentRound();


    /**
     *
     * 查询所有圆桌
     */
    @Select("select * from t_round_table")
    @Results({
            @Result(id=true,property="id",column ="id",javaType=Integer.class),
            @Result(property="name",column ="name",javaType=String.class),
            @Result(property="banner",column ="banner",javaType=String.class),
            @Result(property="tiny_banner",column ="tiny_banner",javaType=String.class),
            @Result(property="url_token",column ="url_token",javaType=String.class),
            @Result(property="visits_count",column ="visits_count",javaType=Integer.class),
            @Result(property="include_count",column ="include_count",javaType=Integer.class)})
    List<Map> selectAllRound();
}
