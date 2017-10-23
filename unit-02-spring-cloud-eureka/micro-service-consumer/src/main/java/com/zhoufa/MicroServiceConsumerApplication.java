package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhoufangan 服务消费者
 */
@SpringBootApplication
@ServletComponentScan(basePackages = {"com.zhoufa"})
@ComponentScan(basePackages = {"com.zhoufa"})
@EnableDiscoveryClient
public class MicroServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceConsumerApplication.class, args);
    }
}
