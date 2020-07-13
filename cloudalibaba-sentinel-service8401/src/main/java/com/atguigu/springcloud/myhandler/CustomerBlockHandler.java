package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * author:cy
 * Date:2020/6/10 16:15
 */


public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){

        return  new CommonResult(4444,"客户自定义de 异常处理1111");

    }
    public static CommonResult handlerException2(BlockException exception){

        return  new CommonResult(4444,"客户自定义de 异常处理22222");

    }
}
