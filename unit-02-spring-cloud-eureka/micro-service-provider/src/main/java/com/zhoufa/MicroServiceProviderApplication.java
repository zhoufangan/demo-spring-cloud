package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhoufangan 服务生产者
 */
@SpringBootApplication
@ServletComponentScan(
        basePackages = {"com.zhoufa.controller"}
)
@EnableEurekaClient
public class MicroServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceProviderApplication.class, args);
    }
}
