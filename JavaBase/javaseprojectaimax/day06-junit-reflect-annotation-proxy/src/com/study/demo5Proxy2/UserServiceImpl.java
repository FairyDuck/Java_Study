package com.study.demo5Proxy2;

public class UserServiceImpl implements UserService{
    @Override
    public void login(String username, String password) throws Exception {
        if("admin".equals(username) && "123456".equals(password)) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
        Thread.sleep(1000);
    }

    @Override
    public void deleteUsers() throws Exception {
        System.out.println("删除了1万个用户");
        Thread.sleep(1500);
    }

    @Override
    public String[] selectUsers() throws Exception {
        System.out.println("查询了3个用户");
        String[] names = {"张三", "李四", "王五"};
        Thread.sleep(500);
        return names;
    }
}
