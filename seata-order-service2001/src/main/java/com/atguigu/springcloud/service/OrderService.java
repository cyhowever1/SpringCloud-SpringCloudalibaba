package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * author:cy
 * Date:2020/6/10 21:58
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}

