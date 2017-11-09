package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoufangan
 */
@SpringBootApplication
@EnableEurekaServer
public class Unit05MicroServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit05MicroServiceProviderApplication.class, args);
    }
}
