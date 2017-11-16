package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhoufangan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Unit05MicroServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit05MicroServiceProviderApplication.class, args);
    }
}
