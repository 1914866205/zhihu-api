package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public interface UsersMapper {

    /**
     * 根据id查询用户
     */
    @Select("select * from t_user where id=")
    @Results({
            @Result(id=true,property="id",column ="id",javaType=String.class),
            @Result(property="mobile",column ="mobile",javaType=String.class),
            @Result(property="email",column ="email",javaType=String.class),
            @Result(property="password",column ="password",javaType=String.class),
            @Result(property="name",column ="name",javaType=String.class),
            @Result(property="url_token",column ="url_token",javaType=String.class),
            @Result(property="avatar_url",column ="avatar_url",javaType=String.class),
            @Result(property="url",column ="url",javaType=String.class),
            @Result(property="headline",column ="headline",javaType=String.class),
            @Result(property="description",column ="description",javaType=String.class),
            @Result(property="gender",column ="gender",javaType=Integer.class),
            @Result(property="location",column ="location",javaType=String.class),
            @Result(property="business",column ="business",javaType=String.class),
            @Result(property="employment",column ="employment",javaType=String.class),
            @Result(property="education",column ="education",javaType=String.class),
            @Result(property="user_cover",column ="user_cover",javaType=String.class),
            @Result(property="created",column ="created",javaType= Data.class),
    })
   User selectUserById(String id);
    /**
     * 查询所有用户
     */
    @Select("select * from t_user")
    @Results({
            @Result(id=true,property="id",column ="id",javaType=String.class),
            @Result(property="mobile",column ="mobile",javaType=String.class),
            @Result(property="email",column ="email",javaType=String.class),
            @Result(property="password",column ="password",javaType=String.class),
            @Result(property="name",column ="name",javaType=String.class),
            @Result(property="url_token",column ="url_token",javaType=String.class),
            @Result(property="avatar_url",column ="avatar_url",javaType=String.class),
            @Result(property="url",column ="url",javaType=String.class),
            @Result(property="headline",column ="headline",javaType=String.class),
            @Result(property="description",column ="description",javaType=String.class),
            @Result(property="gender",column ="gender",javaType=Integer.class),
            @Result(property="location",column ="location",javaType=String.class),
            @Result(property="business",column ="business",javaType=String.class),
            @Result(property="employment",column ="employment",javaType=String.class),
            @Result(property="education",column ="education",javaType=String.class),
            @Result(property="user_cover",column ="user_cover",javaType=String.class),
            @Result(property="created",column ="created",javaType= Data.class),
    })
    List<User> selectAllUser();
}
