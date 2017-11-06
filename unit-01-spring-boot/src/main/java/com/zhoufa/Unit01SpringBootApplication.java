package com.zhoufa;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author zhoufangan spring-boot
 */
@SpringBootApplication
@RestController
public class Unit01SpringBootApplication {

    private static Logger log = LoggerFactory.getLogger(Unit01SpringBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Unit01SpringBootApplication.class, args);
    }

    // http://localhost:8080/unit-01-spring-boot/win/index
    @RequestMapping("/index")
    public Map<String, Object> index() {
        Map<String, Object> ret = Maps.newHashMap();
        ret.put("code", 0);
        ret.put("message", "success");
        ret.put("data", "welcome to you!");

        log.info("请求成功!");
        return ret;
    }
}
