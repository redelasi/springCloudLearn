package com.eureka.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 15:53
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaConsumer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }



}
