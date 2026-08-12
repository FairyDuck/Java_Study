package com.study.mapper;

import com.study.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 员工工作经理
@Mapper
public interface EmpExprMapper {
    // 批量插入员工工作经历 XML实现
    void insertBatch(List<EmpExpr> exprList);
}
