ribbon断路器配置

1.在调用方法出增加注解
@HystrixCommand(fallbackMethod = "add_fallbackMethod")

2.指定方法
这个方法必须和接口定义(参数和返回值一致)
@HystrixCommand(fallbackMethod = "add_fallbackMethod")
public ResultModel add(User user) {
    .......
}

public ResultModel add_fallbackMethod(User user) {
    .......
}