package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author:cy
 * Date:2020/6/4 17:46
 */
@Configuration
public class GatewayConfig {

    // RouteLocatorBuilder 路由构建器
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 访问 9527网关下的/guonei，将会转发到"http://news.baidu.com/guonei"这个地址
        routes.route("payment_route",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return  routes.build();
        }
    @Bean
    public RouteLocator routeLocator2(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 访问 9527网关下的/guonei，将会转发到"http://news.baidu.com/guonei"这个地址
        routes.route("payment_route2",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
        return  routes.build();
        }
    }
