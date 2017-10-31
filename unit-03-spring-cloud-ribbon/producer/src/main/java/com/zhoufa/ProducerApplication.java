package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhoufangan 生产者
 */
@SpringBootApplication
@EnableEurekaClient
@ServletComponentScan(basePackages = {"com.zhoufa.controller"})
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
