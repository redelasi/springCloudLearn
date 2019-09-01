package com.springcloudBus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mingxing gong
 * @since: 2019/9/1 16:19
 */

@RestController
public class HelloController {
    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hello")
    public String hi(){
        return foo;
    }
}
