package com.zhoufa.user;

import com.zhoufa.model.User;
import com.zhoufa.response.ResultModel;
import com.zhoufa.response.ReturnCode;
import org.springframework.stereotype.Component;

/**
 * Hystrix断路器处理类
 *
 * @author Created by zhoufangan on 2017/11/9.
 */
@Component
public class UserFeignClientHystrix implements UserFeignClient {

    @Override
    public ResultModel add(User user) {
        return new ResultModel(ReturnCode.ERROR.getCode(), "我艹,服务异常了");
    }
}
