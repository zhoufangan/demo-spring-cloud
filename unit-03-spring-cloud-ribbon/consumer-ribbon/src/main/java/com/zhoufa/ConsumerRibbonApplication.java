package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhoufangan 消费者
 */
@SpringBootApplication
public class ConsumerRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbonApplication.class, args);
    }
}
