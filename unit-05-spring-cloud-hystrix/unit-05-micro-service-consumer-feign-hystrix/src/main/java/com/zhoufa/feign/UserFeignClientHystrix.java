package com.zhoufa.feign;

import com.zhoufa.common.ResultModel;
import com.zhoufa.common.ReturnCode;
import com.zhoufa.ribbon.User;
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
