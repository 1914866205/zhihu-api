package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 查询所有用户    */
    List<User> selectAllUser();

    /**
     * 根据id查用户
     */
    User selectUserById(String id);
}
