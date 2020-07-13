package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * author:cy
 * Date:2020/6/10 21:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;
    private Long userId;
    private Long  productId;
    private Integer count;
    private BigDecimal money;
    /*
    订单信息，0 创建中，1完结
     */
    private  Integer status;
}
