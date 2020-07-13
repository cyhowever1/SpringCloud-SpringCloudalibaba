package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * author:cy
 * Date:2020/6/10 21:54
 */
@Mapper
public interface OrderDao {
    /**
     * 1 新建订单
     * @param order
     * @return
     */
    void create(Order order);

    /**
     * 2 修改订单状态,从0改为1
     * @param userId
     * @param status
     * @return
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}



