package com.study.service;

import com.study.pojo.Emp;
import com.study.pojo.EmpQueryParam;
import com.study.pojo.LoginInfo;
import com.study.pojo.PageResult;

import java.util.List;


public interface EmpService {
    // 条件分页查询
    PageResult page(EmpQueryParam empQueryParam);

    // 新增员工
    void save(Emp emp);

    // 批量删除员工
    void deleteByIds(List<Integer> ids);

    // 根据ID查询员工
    Emp getInfo(Integer id);

    // 更新员工
    void update(Emp emp);

    // 员工登录
    LoginInfo login(Emp emp);
}
