package com.zhoufa.user;

import com.zhoufa.model.User;
import com.zhoufa.response.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by zhoufangan on 2017/11/9.
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @SuppressWarnings("ALL")
    @Autowired
    private UserFeignClient userFeignClient;
    @Autowired
    private UserRibbonClient userRibbonClient;

    // http://localhost:8764/hystrix 断路器：Hystrix 仪表盘

    // http://localhost:8082/unit-05-micro-service-consumer-hystrix-dashboard/win/user/addFeign?name=张三&gender=1&age=100
    @RequestMapping("/addFeign")
    public ResultModel addFeign(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) int gender,
            @RequestParam(required = false) int age) {
        User user = new User(name, gender, age);
        return userFeignClient.add(user);
    }

    // http://localhost:8082/unit-05-micro-service-consumer-hystrix-dashboard/win/user/addRibbon?name=张三&gender=1&age=100
    @RequestMapping("/addRibbon")
    public ResultModel addRibbon(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) int gender,
            @RequestParam(required = false) int age) {
        User user = new User(name, gender, age);
        return userRibbonClient.add(user);
    }
}
