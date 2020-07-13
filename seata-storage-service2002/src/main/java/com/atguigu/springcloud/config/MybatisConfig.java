package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * author:cy
 * Date:2020/6/10 22:03
 */
@Configuration
@MapperScan("com.atguigu.springcloud.dao")
public class MybatisConfig {
}
