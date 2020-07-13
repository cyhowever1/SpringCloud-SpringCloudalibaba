package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * author:cy
 * Date:2020/6/3 14:32
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentFeginService paymentFeginService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")long id){
        CommonResult<Payment> payment = paymentFeginService.getPaymentById(id);
        return  new CommonResult(200,"操作成功",payment);

    }
}
