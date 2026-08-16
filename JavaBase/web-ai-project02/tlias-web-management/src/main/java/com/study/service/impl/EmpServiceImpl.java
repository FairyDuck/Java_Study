package com.study.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.study.mapper.EmpExprMapper;
import com.study.mapper.EmpMapper;
import com.study.pojo.*;
import com.study.service.EmpLogService;
import com.study.service.EmpService;
import com.study.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;
    @Autowired
    private EmpLogService empLogService;

    // 条件分页查询
//    @Override
//    public PageResult page(Integer page, Integer pageSize) {
//        Long total = empMapper.count();
//        List<Emp> rows = empMapper.list((page - 1) * pageSize, pageSize);
//        PageResult pageResult = new PageResult(total, rows);
//        return pageResult;
//    }
    @Override
    public PageResult page(EmpQueryParam empQueryParam) {
        //1. 设置分页参数
        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());
        //2. 执行查询
        List<Emp> empList = empMapper.list(empQueryParam);
        Page<Emp> p = (Page<Emp>) empList;
        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }

    // 新增员工
    // spring事务注解，rollbackFor = Exception.class 表示对所有异常进行回滚(默认回滚运行时异常)
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void save(Emp emp) {
        try {
            //1.补全基础属性
            emp.setCreateTime(LocalDateTime.now());
            emp.setUpdateTime(LocalDateTime.now());
            //2.保存员工基本信息
            empMapper.insert(emp);
            //3. 保存员工的工作经历信息 - 批量
            Integer empId = emp.getId();
            List<EmpExpr> exprList = emp.getExprList();
            if(!CollectionUtils.isEmpty(exprList)){
                exprList.forEach(empExpr -> empExpr.setEmpId(empId));
                empExprMapper.insertBatch(exprList);
            }
        } finally {
            //记录操作日志
            // 设置事务类型为每次创建新事务，避免当前事务回滚后影响日志记录
            EmpLog empLog = new EmpLog(null, LocalDateTime.now(), emp.toString());
            empLogService.insertLog(empLog);
        }
    }

    // 批量删除员工
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteByIds(List<Integer> ids) {
        empMapper.deleteByIds(ids);
        empExprMapper.deleteByEmpIds(ids);
    }

    // 根据ID查询员工
    @Override
    public Emp getInfo(Integer id) {
        return empMapper.getById(id);
    }

    // 更新员工
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.updateById(emp);
        // 根据员工ID删除员工的工作经历信息 【删除老的】
        empExprMapper.deleteByEmpIds(Arrays.asList(emp.getId()));
        // 新增员工的工作经历数据 【新增新的】
        Integer empId = emp.getId();
        List<EmpExpr> exprList = emp.getExprList();
        if(!CollectionUtils.isEmpty(exprList)){
            exprList.forEach(empExpr -> empExpr.setEmpId(empId));
            empExprMapper.insertBatch(exprList);
        }
    }

    // 员工登录
    @Override
    public LoginInfo login(Emp emp) {
        Emp empLogin = empMapper.getUsernameAndPassword(emp);
        if(empLogin != null) {
            log.info("员工登录成功, {}", empLogin);
            // 生成JWT令牌
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", empLogin.getId());
            claims.put("username", empLogin.getUsername());
            String token = JwtUtils.generateJwt(claims);
            return new LoginInfo(empLogin.getId(), empLogin.getUsername(), empLogin.getName(), token);
        }
        return null;
    }
}
