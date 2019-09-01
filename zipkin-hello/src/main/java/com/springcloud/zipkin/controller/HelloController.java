package com.springcloud.zipkin.controller;


import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: mingxing gong
 * @since: 2019/9/1 17:53
 */
@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String callHome(){
        logger.info("calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8813/hello", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        logger.info("i'm service-hi");
        return "i'm service-hi";

    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
