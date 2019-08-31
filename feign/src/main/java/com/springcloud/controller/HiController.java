package com.springcloud.controller;

import com.springcloud.service.HiServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 20:16
 */


@RestController
public class HiController {

    @Autowired
    HiServcie hiServcie;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return hiServcie.sayHi(name);
    }


}
