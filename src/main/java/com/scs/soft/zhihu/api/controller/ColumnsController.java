package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(columnsService.selectAllColumns());
    }
}
