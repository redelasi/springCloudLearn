package com.springcloudBus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: mingxing gong
 * @since: 2019/9/1 16:17
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class SpringCloudBus {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudBus.class, args);
    }

}
