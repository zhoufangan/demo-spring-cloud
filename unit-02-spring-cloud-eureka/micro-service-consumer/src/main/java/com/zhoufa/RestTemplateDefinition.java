package com.zhoufa;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Created by zhoufangan on 2017/10/23.
 */
@Configuration
public class RestTemplateDefinition {

    // 并且注册了一个bean: restTemplate;
    // 通过@LoadBalanced注册表明，这个restRemplate是负载均衡的。
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
