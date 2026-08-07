package com.study.demo5Proxy2;

public class Test {
    static void main(String[] args) throws Exception {
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());
        userService.login("admin", "123456");
        userService.deleteUsers();
        String[] names = userService.selectUsers();
        System.out.println(names);
    }
}
