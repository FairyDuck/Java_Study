package com.study.service;

import com.study.pojo.Emp;
import com.study.pojo.EmpQueryParam;
import com.study.pojo.PageResult;


public interface EmpService {
    // 条件分页查询
    PageResult page(EmpQueryParam empQueryParam);

    // 新增员工
    void save(Emp emp);
}
