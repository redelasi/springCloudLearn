package com.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 20:13
 */

@FeignClient(value = "SERVICE-HI")
public interface HiServcie {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
