package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoufangan
 */
@SpringBootApplication
@EnableEurekaServer
public class Unit06EurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(Unit06EurekaServerApplication.class, args);
    }
}
