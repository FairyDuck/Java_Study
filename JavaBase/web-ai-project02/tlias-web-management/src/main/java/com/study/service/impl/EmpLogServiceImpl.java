package com.study.service.impl;

import com.study.mapper.EmpLogMapper;
import com.study.pojo.EmpLog;
import com.study.service.EmpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpLogServiceImpl implements EmpLogService {

    @Autowired
    private EmpLogMapper empLogMapper;

    // 即使当前已经有事务，也在新事务中运行  -- 不管旧事务成功/失败，都可以执行到当前事务
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void insertLog(EmpLog empLog) {
        empLogMapper.insert(empLog);
    }
}