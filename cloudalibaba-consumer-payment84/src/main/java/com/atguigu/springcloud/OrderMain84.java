package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * author:cy
 * Date:2020/6/10 16:46
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain84.class,args);
    }
}

