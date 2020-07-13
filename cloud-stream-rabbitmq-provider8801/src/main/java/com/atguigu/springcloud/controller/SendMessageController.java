package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * author:cy
 * Date:2020/6/5 14:03
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;


    @GetMapping(value = "/sendMessage")
    private String  sendMessage(){
        return  messageProvider.send();
    }
}
