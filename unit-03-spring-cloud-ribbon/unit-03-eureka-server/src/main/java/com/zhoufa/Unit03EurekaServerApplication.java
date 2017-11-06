package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoufangan 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class Unit03EurekaServerApplication {

    // http://localhost:1111/eureka/
    public static void main(String[] args) {
        SpringApplication.run(Unit03EurekaServerApplication.class, args);
    }
}
