package com.zhoufa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Created by zhoufangan on 2017/10/30.
 */
@Service
public class IndexRemoteService {

    @Autowired
    private RestTemplate restTemplate;

    public String index() {
        return restTemplate.getForObject("", String.class);
    }

}
