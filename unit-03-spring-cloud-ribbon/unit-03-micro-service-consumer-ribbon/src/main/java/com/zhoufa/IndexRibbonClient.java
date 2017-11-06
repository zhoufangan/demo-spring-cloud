package com.zhoufa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Created by zhoufangan on 2017/10/30.
 */
@Service
public class IndexRibbonClient {

    @Autowired
    private RestTemplate restTemplate;

    public String index() {
        String url = "http://UNIT-03-MICRO-SERVICE-PROVIDER/unit-03-micro-service-provider/win/index";
        return restTemplate.getForObject(url, String.class);
    }

}
