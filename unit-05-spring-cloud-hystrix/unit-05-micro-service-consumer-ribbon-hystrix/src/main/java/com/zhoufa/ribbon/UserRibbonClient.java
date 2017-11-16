package com.zhoufa.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhoufa.model.User;
import com.zhoufa.response.ResultModel;
import com.zhoufa.response.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Created by zhoufangan on 2017/10/31.
 */
@Service
public class UserRibbonClient {

    // 服务名
    private final String MICRO_SERVICE_PROVIDER_USER = "http://UNIT-05-MICRO-SERVICE-PROVIDER/unit-05-micro-service-provider/";

    @Autowired
    private RestTemplate restTemplate;

    // 断路器注解
    @HystrixCommand(fallbackMethod = "add_fallbackMethod")
    public ResultModel add(User user) {
        // TODO 注意两种方式区别
        // 1.post user当成请求体传入
        // 2.get  user当成请求参数传入

        // return restTemplate.getForObject(MICRO_SERVICE_PROVIDER_USER + "/win/ribbon/add", ResultModel.class, ribbon);

        return restTemplate.postForObject(MICRO_SERVICE_PROVIDER_USER + "/win/ribbon/add", user, ResultModel.class);
    }

    /**
     * 注意参数必须一样,才能被找到哦
     *
     * @param user 参数
     * @return 返回
     */
    public ResultModel add_fallbackMethod(User user) {
        return new ResultModel(ReturnCode.ERROR.getCode(), "我艹服务异常了");
    }
}
