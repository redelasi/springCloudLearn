package com.eureka.hystrix.controller;

import com.eureka.hystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 21:09
 */

@RestController
public class HiHystrixController {

    @Autowired
    HelloService helloServicel;


    @RequestMapping("/hello")
    public String hello(){
        return helloServicel.hiService("gongmingxing");
    }
}
