package com.study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    @Test
    public void testGetAge() {
        UserService userService = new UserService();
        Integer age = userService.getAge("100000200010011011");
        System.out.println(age);
    }

    @Test
    public void testGetGender() {
        UserService userService = new UserService();
        String sex = userService.getGender("100000200010011011");
        System.out.println(sex);
        Assertions.assertEquals("男", sex, "性别测试失败");
    }
}
