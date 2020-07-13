package com.atguigu.springcloud.servcie;

import org.springframework.stereotype.Component;

/**
 * author:cy
 * Date:2020/6/3 21:18
 */
@Component
public class PaymentFallbackService implements HystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService paymentInfo_OK fall back";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
         return "PaymentFallbackService paymentInfo_Timeout fall back";
    }
}
