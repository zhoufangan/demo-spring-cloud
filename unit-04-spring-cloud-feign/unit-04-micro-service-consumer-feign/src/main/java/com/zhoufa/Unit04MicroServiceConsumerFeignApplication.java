package com.zhoufa;

import com.zhoufa.ribbon.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufangan Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class Unit04MicroServiceConsumerFeignApplication {

    public static void main(String[] args) {

        SpringApplication.run(Unit04MicroServiceConsumerFeignApplication.class, args);
    }

    @Autowired
    private IndexFeignService indexFeignService;

    // http://localhost:8080/unit-04-micro-service-consumer-feign/win/index/
    @RequestMapping("/index")
    public String index() {
        return indexFeignService.index();
    }

    // http://localhost:8080/unit-04-micro-service-consumer-feign/win/login?phone=13500001111&safecode=666666
    @RequestMapping("/login")
    public String login(
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String safecode) {
        return indexFeignService.login(phone, safecode);
    }

    // http://localhost:8080/unit-04-micro-service-consumer-feign/win/add?name=张三&gender=1&age=100
    @RequestMapping("/add")
    public String add(@RequestParam String name,
                      @RequestParam int gender,
                      @RequestParam int age) {
        Person person = new Person();
        person.setName(name);
        person.setGender(gender);
        person.setAge(age);
        String ret = indexFeignService.add(person);
        return ret;
    }
}
