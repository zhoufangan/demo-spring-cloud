package com.zhoufa.feign;

import com.zhoufa.common.ResultModel;
import com.zhoufa.ribbon.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Created by zhoufangan on 2017/10/31.
 */
@FeignClient(value = "UNIT-05-MICRO-SERVICE-PROVIDER", fallback = UserFeignClientHystrix.class)
public interface UserFeignClient {

    @RequestMapping(value = "/unit-05-micro-service-provider/win/user/add", method = RequestMethod.POST)
    ResultModel add(@RequestBody(required = false) User user);
}
