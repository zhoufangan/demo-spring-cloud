package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan 其实是第二单元
 */
@SpringBootApplication
@RestController
public class Unit01SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unit01SpringBootApplication.class, args);
    }

    // http://localhost:8080/unit-01-spring-boot/win/home
    @RequestMapping("/home")
    public String home() {
        return "welcome to you!";
    }
}
