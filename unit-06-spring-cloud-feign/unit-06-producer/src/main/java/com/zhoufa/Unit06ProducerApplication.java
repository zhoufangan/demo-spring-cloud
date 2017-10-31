package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Unit06ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit06ProducerApplication.class, args);
    }

    @RequestMapping("/index")
    public String index() {
        return "Unit06ProducerApplication index welcome!";
    }

    @RequestMapping("/login")
    public String login(
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String safecode) {
        return "手机号=[" + phone + "], 验证码=[" + safecode + "]";
    }
}
