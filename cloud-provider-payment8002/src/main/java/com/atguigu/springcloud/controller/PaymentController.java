package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;

    @PostMapping(value = "/payment/create",produces = "application/json; charset=utf-8")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("***插入结果"+result);
        if(result>0){
            return  new CommonResult(200,"插入数据成功,端口为："+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }

    }
    @GetMapping (value = "/payment/get/{id}",produces = "application/json; charset=utf-8")
    public CommonResult<Payment> create(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("***插入结果"+payment+"hahahahahahhahah");
        if(payment != null){
            return  new CommonResult(200,"查询成功，端口为："+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询的id="+id,null);
        }

    }

}
