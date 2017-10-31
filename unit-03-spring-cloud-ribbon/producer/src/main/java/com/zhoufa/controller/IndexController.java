package com.zhoufa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by zhoufangan on 2017/10/30.
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "I am producer!";
    }

}
