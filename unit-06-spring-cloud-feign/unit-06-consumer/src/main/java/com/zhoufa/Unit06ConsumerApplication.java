package com.zhoufa;

import com.zhoufa.service.IndexFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
@ComponentScan(basePackages = {"com.zhoufa"})
public class Unit06ConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(Unit06ConsumerApplication.class, args);
    }

    @Autowired
    private IndexFeignService indexFeignService;

    // http://localhost:8081/consumer/index/
    @RequestMapping("/index")
    public String index() {
        return indexFeignService.index();
    }

    // http://localhost:8081/consumer/login?phone=13500001111&safecode=666666
    @RequestMapping("/login")
    public String login(
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String safecode) {
        return indexFeignService.login(phone, safecode);
    }
}
