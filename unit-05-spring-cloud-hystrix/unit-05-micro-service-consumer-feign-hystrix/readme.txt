feign增加断路器hystrix
1.修改配置
# feign断路器配置,默认关闭
feign:
  hystrix:
    enabled: true

2.实现接口
............. UserFeignClientHystrix implements UserFeignClient