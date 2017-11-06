package com.zhoufa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan 服务生产者
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Unit02MicroServiceProviderApplication {

    private static Logger logger = LoggerFactory.getLogger(Unit02MicroServiceProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Unit02MicroServiceProviderApplication.class, args);
    }

    // http://localhost:9090/unit-02-micro-service-provider/index
    @RequestMapping("/index")
    public String index() {
        logger.info("/index, host:");
        return "welcome to index!";
    }
}
