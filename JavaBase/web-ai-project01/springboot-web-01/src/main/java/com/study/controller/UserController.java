package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    // 方式一 属性注入
    @Autowired
    @Qualifier("userServiceImpl") // 指定注入bean对象
    private UserService userService;

//    // 方式二 构造器注入
//    private final UserService userService;
//    // @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

//    // 方式三 setter注入
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping("/user/list")
    public List<User> findAll() {// 2、解析用户数据，封装成对象到list集合中
        List<User> users = userService.findAll();
        // 3、返回json数据
        return users;
    }

}
