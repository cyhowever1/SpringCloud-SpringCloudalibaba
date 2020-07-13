package com.atguigu.springcloud.service;

/**
 * author:cy
 * Date:2020/6/11 9:15
 */
public interface StorageService {

    void decrease(Long productId, Integer count);
}
