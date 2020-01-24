package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnsService;
import com.scs.soft.zhihu.api.service.FavoriteService;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.apache.catalina.servlets.CGIServlet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.*;

@RestController
@RequestMapping(value = "/api/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    @Resource
    private FavoriteService favoriteService;

    @Resource
    private ColumnsService columnsService;
    @GetMapping
    public Result getResult(){
        Map<String,List> map= new HashMap<>() ;
        map.put("special",specialService.selectRecent());
        map.put("favorite",favoriteService.selectRecentFavorite());
        map.put("columns",columnsService.selectRecentColumns());
        return Result.success(map);
    }
    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(specialService.selectAll());
    }
}