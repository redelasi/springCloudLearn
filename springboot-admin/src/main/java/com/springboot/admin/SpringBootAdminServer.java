package com.springboot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: mingxing gong
 * @since: 2019/9/1 23:32
 */

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServer.class, args);
    }

}
