package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * author:cy
 * Date:2020/6/1 22:19
 */
@RestController
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return  restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id")Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment1(@PathVariable("id")Long id) {
        ResponseEntity<CommonResult> result = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if (result.getStatusCode().is2xxSuccessful()){
            return  result.getBody();
        }else {
            return  new CommonResult<>(444,"操作失败");
        }
    }

    @GetMapping(value="/consumer/payment/zipkin")
    public String paymentZipkin() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zipkin/",String.class);
    }



}
