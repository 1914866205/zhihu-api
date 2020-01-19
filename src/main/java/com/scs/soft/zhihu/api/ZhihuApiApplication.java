package com.scs.soft.zhihu.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.scs.soft.zhihu.api.mapper")
public class ZhihuApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuApiApplication.class, args);
    }

}
