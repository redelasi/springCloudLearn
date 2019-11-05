package com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: mingxing gong
 * @since: 2019/11/5 17:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZookeeperApplication.class, args);
    }

}
