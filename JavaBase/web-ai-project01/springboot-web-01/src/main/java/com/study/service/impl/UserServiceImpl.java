package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

//@Component // 将当前类交给IOC容器管理
@Service
public class UserServiceImpl implements UserService {
    @Autowired // 程序运行时，会自动查询该类型的bean对象，并注入到当前类中
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        List<String> lists = userDao.findAll();
        List<User> users = lists.stream().map(
                list -> {
                    String[] split = list.split(",");
                    LocalDateTime updateTime = LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    User user = new User(Integer.parseInt(split[0]), split[1], split[2], split[3], Integer.parseInt(split[4]), updateTime);
                    return user;
                }
        ).toList();
        return users;
    }
}
