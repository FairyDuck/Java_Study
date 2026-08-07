package com.study.demo5Proxy2;

public interface UserService {
    // 登录
    void login(String username, String password) throws Exception;
    // 删除
    void deleteUsers() throws Exception;
    // 查询用户，返回数组
    String[] selectUsers() throws Exception;
}
