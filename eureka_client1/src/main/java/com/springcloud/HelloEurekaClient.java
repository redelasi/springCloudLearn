package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 15:12
 */


@SpringBootApplication
@EnableEurekaClient
public class HelloEurekaClient {

    public static void main(String[] args) {
        SpringApplication.run(HelloEurekaClient.class,args);
    }

}
