package com.zhoufa.ribbon;

import com.zhoufa.common.ResultModel;
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

    @Autowired
    private UserRibbonClient userRibbonClient;

    // http://localhost:8080/unit-05-micro-service-consumer-ribbon-hystrix/win/user/add?name=张三&gender=1&age=100
    @RequestMapping("/add")
    public ResultModel add(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) int gender,
            @RequestParam(required = false) int age) {
        User user = new User(name, gender, age);
        return userRibbonClient.add(user);
    }
}
