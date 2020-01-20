package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoriteService;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;

    @GetMapping
    public Result getResult(){
        return Result.success(favoriteService.selectRecentFavorite());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(favoriteService.selectAllFavorite());
    }
}