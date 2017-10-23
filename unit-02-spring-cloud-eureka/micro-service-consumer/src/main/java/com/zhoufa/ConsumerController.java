package com.zhoufa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Created by zhoufangan on 2017/10/23.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    // http://localhost:8080/micro-service-consumer/index
    @RequestMapping("/index")
    public String index() {
        // 项目名 + 路径 + 接口
        String url = "http://MICRO-SERVICE-PROVIDER/micro-service-provider/index";
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        String ret = entity.getBody();
        System.out.println(ret);
        return ret;
    }

}
