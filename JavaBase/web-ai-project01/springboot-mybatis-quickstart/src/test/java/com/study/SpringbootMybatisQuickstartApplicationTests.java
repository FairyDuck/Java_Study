package com.study;

import com.study.mapper.UserMapper;
import com.study.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // Springboot单元测试的注解，测试时会自动加载Springboot项目
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll(){
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);
    }

    @Test
    public void testFindById(){
        User user = userMapper.findByUsernameAndPassword("zhaoyun", "123456");
        System.out.println(user);
    }

    @Test
    public void testDeleteById(){
        userMapper.deleteById(1);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        user.setName("张三");
        user.setAge(18);
        userMapper.insertUser(user);
    }

    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(2);
        user.setUsername("lisi");
        user.setPassword("123456");
        user.setName("李四");
        user.setAge(18);
        userMapper.updateUser(user);
    }
}
