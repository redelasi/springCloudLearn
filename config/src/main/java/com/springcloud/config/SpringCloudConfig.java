package com.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: mingxing gong
 * @since: 2019/8/31 23:55
 */

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfig {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig.class, args);
    }

}
