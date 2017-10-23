package com.zhoufa.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Created by zhoufangan on 2017/10/21.
 */
@RestController
public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(IndexController.class);

//    @SuppressWarnings("ALL")
//    @Autowired
//    private DiscoveryClient client;

    // http://localhost:7070/micro-service-provider/index
    @RequestMapping("/index")
    public String index() {

//        List<InstanceInfo> infos = client.getInstancesById("micro-service-provider");
//        if (null != infos) {
//            for (InstanceInfo info : infos) {
//                logger.info(info.getIPAddr() + ":" + info.getId());
//            }
//        }

        logger.info("/index, host:");

        return "welcome to index!";
    }

}
