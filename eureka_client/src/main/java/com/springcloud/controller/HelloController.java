package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 15:14
 */

@RestController
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    String port;

    @Value("${foo}")
    private String name;



    @RequestMapping(value = "/hello")
    public String hello(){
        return "i am eureka client, my port is " + port;
    }


    @RequestMapping(value = "/getFoo")
    public String getFoo(){
        return "i am " + name;
    }
}
