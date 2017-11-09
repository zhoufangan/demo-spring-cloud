package com.zhoufa;

import com.alibaba.fastjson.JSON;
import com.zhoufa.ribbon.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Unit04MicroServiceProviderApplication {

    private static Logger logger = LoggerFactory.getLogger(Unit04MicroServiceProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Unit04MicroServiceProviderApplication.class, args);
    }

    @RequestMapping("/index")
    public String index() {
        return "Unit04MicroServiceProviderApplication index welcome!";
    }

    @RequestMapping("/login")
    public String login(
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String safecode) {
        return "手机号=[" + phone + "], 验证码=[" + safecode + "]";
    }

    @RequestMapping("/add")
    public String add(@RequestBody(required = false) Person person) {
        logger.info(JSON.toJSONString(person));
        return "person add success!";
    }
}
