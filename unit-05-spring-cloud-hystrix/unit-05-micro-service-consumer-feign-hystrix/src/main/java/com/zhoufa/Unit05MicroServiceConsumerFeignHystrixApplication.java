package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zhoufangan
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Unit05MicroServiceConsumerFeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(Unit05MicroServiceConsumerFeignHystrixApplication.class, args);
    }
}
