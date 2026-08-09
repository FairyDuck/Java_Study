package com.study.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.study.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//@Component
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public List<String> findAll() {
        // 1、加载并读取user.txt，获取用户数据
        InputStream in = this.getClass().getResourceAsStream("/user.txt");
        List<String> lists = IoUtil.readLines(in, StandardCharsets.UTF_8,new ArrayList<>());
        return lists;
    }
}
