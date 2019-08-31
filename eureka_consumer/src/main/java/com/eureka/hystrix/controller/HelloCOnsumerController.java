package com.eureka.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 15:56
 */


@RestController
public class HelloCOnsumerController {

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/hello")
    public String hello(){
        return restTemplate.getForObject("http://SERVICE-HI/hello", String.class);
    }


}
