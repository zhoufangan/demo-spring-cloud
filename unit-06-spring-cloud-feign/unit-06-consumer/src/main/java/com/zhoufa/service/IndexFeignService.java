package com.zhoufa.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Created by zhoufangan on 2017/10/31.
 */
@FeignClient(value = "UNIT-06-PRODUCER:8080")
public interface IndexFeignService {

    @RequestMapping(value = "/unit-06-producer/index", method = RequestMethod.GET)
    String index();

    /**
     * 默认参数当成body来解析 String login(String phone)
     * 当成参数解析,必须写好映射 String login(@RequestParam(value = "phone", required = false) String phone)
     *
     * @param phone    手机号
     * @param safecode 验证码
     * @return 字符串
     */
    // @RequestParam(required = false)
    @RequestMapping(value = "/unit-06-producer/login")
    String login(@RequestParam(value = "phone", required = false) String phone, @RequestParam(value = "safecode", required = false) String safecode);
}
