package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoriteService;
import com.scs.soft.zhihu.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/favorite")
public class UserController {
    @Resource
    private UserService userService;

//    @GetMapping(value = "/#id")
//    public Result getAll(){
//        return Result.success(userService.selectAllUser());
//    }
    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(userService.selectAllUser());
    }
}