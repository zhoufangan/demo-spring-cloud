package com.zhoufa.ribbon;

import com.zhoufa.common.ResultModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by zhoufangan on 2017/11/9.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/add")
    public ResultModel add(@RequestBody(required = false) User user) {
        throw new RuntimeException("艹，给我传空值!");
//        if (null == ribbon) {
//            return new ResultModel(ReturnCode.ERROR.getCode(), ReturnCode.ERROR.getDesc());
//        } else {
//            return new ResultModel(ReturnCode.SUCCESS.getCode(), ReturnCode.SUCCESS.getDesc(), ribbon);
//        }
    }

}
