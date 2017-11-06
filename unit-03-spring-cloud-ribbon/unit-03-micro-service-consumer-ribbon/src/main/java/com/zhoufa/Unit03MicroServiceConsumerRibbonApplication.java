package com.zhoufa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan 消费者
 */
@SpringBootApplication
@ComponentScan
@RestController
@EnableDiscoveryClient
@EnableEurekaClient
public class Unit03MicroServiceConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit03MicroServiceConsumerRibbonApplication.class, args);
    }

    @Autowired
    private IndexRibbonClient indexRibbonClient;

    // http://localhost:8080/unit-03-micro-service-consumer-ribbon/win/index
    @RequestMapping("/index")
    public String index() {
        return indexRibbonClient.index();
    }
}
