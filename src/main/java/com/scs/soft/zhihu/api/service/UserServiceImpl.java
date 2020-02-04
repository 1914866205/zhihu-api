package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.User;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.mapper.UsersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UsersMapper usersMapper;
    @Override
    public List<User> selectAllUser() {
        return usersMapper.selectAllUser();
    }

    @Override
    public User selectUserById(String id) {
        return usersMapper.selectUserById(id);
    }
}
