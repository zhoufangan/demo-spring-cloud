package com.zhoufa;

import com.zhoufa.ribbon.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Created by zhoufangan on 2017/10/31.
 */
@FeignClient(value = "UNIT-04-MICRO-SERVICE-PROVIDER")
public interface IndexFeignService {

    @RequestMapping(value = "/unit-04-micro-service-provider/win/index", method = RequestMethod.GET)
    String index();

    /**
     * 默认参数当成body来解析 String login(String phone)
     * 当成参数解析,必须写好映射 String login(@RequestParam(value = "phone", required = false) String phone)
     *
     * @param phone    手机号
     * @param safecode 验证码
     * @return 字符串
     */
    @RequestMapping(value = "/unit-04-micro-service-provider/win/login")
    String login(@RequestParam(value = "phone", required = false) String phone,
                 @RequestParam(value = "safecode", required = false) String safecode);

    @RequestMapping(value = "/unit-04-micro-service-provider/win/add")
    String add(@RequestBody(required = false) Person person);
}
