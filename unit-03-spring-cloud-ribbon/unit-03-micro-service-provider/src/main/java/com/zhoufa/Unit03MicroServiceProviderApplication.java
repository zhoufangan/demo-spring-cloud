package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan 生产者
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Unit03MicroServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit03MicroServiceProviderApplication.class, args);
    }

    // http://localhost:9090/unit-03-micro-service-provider/win/index
    @RequestMapping("/index")
    public String index() {
        return "I am Unit03MicroServiceProviderApplication producer!";
    }
}
