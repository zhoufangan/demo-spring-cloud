package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhoufangan
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@ServletComponentScan(basePackages = "com.zhoufa.ribbon.UserController")
@ComponentScan
public class Unit05MicroServiceConsumerRibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit05MicroServiceConsumerRibbonHystrixApplication.class, args);
    }
}
