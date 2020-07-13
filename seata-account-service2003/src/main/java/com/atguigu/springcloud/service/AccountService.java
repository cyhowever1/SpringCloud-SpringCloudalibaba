package com.atguigu.springcloud.service;

import java.math.BigDecimal;

/**
 * author:cy
 * Date:2020/6/11 9:28
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}


