package com.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 当前类是一个请求处理类
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello " + name + "~";
    }
}
