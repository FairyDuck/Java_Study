package com.study.service.impl;

import com.study.mapper.DeptMapper;
import com.study.pojo.Dept;
import com.study.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    // 查询所有部门
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    // 根据id删除部门
    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }

    // 新增部门
    @Override
    public void save(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    // 根据id查询部门
    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    // 修改部门
    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }
}
