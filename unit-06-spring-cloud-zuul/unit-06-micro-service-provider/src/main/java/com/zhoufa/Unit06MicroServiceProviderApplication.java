package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Unit06MicroServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit06MicroServiceProviderApplication.class, args);
    }

}
