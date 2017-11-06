package com.zhoufa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoufangan 服务消费者
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
@RestController
public class Unit02MicroServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit02MicroServiceConsumerApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    // http://localhost:8080/unit-02-micro-service-consumer/win/index
    @RequestMapping("/index")
    public String index() {
        // 项目名 + 路径 + 接口
        String url = "http://UNIT-02-MICRO-SERVICE-PROVIDER/unit-02-micro-service-provider/win/index";
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        String ret = entity.getBody();
        System.out.println(ret);
        return ret;
    }
}
