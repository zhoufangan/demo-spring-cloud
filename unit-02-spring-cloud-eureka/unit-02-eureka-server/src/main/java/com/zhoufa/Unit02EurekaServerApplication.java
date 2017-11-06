package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoufangan 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class Unit02EurekaServerApplication {

    // eureka地址
    // http://localhost:1111/
    public static void main(String[] args) {
        SpringApplication.run(Unit02EurekaServerApplication.class, args);
    }
}
