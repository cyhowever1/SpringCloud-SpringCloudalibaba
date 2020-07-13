package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * author:cy
 * Date:2020/6/11 9:10
 */
@Mapper
public interface StorageDao {

    // 扣减库存
    void decrease(@Param("productId")Long productId,@Param("count")Integer count);
}
