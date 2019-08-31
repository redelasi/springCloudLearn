package com.eureka.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 21:01
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        String result = restTemplate.getForObject("http://SERVICE-HI/hello?name=" + name, String.class);
        return result;
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }

}

