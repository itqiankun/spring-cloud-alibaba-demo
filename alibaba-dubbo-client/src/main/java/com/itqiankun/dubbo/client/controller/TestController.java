package com.itqiankun.dubbo.client.controller;

import com.itqiankun.dubbo.api.TestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @DubboReference // dubbo注入接口 从nacos注册中心获取服务器地址
    private TestService testService;

    @GetMapping("/test")
    public String test(String name) {
        return testService.test(name);
    }
}
