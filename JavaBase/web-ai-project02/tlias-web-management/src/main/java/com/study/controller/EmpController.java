package com.study.controller;

import com.study.pojo.Emp;
import com.study.pojo.EmpQueryParam;
import com.study.pojo.PageResult;
import com.study.pojo.Result;
import com.study.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    // 条件分页查询
    @GetMapping
    public Result page(EmpQueryParam empQueryParam) {
        log.info("分页查询员工, {}", empQueryParam);
        PageResult pageResult = empService.page(empQueryParam);
        return Result.success(pageResult);
    }

    // 新增员工
    @PostMapping
    public Result save(@RequestBody Emp emp) {
        log.info("新增员工, {}", emp);
        empService.save(emp);
        return Result.success();
    }

    // 批量删除员工
    @DeleteMapping
    public Result delete(@RequestParam List<Integer> ids){
        log.info("批量删除员工: ids={} ", ids);
        empService.deleteByIds(ids);
        return Result.success();
    }

    // 根据ID查询员工
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id){
        log.info("根据id查询员工的详细信息");
        Emp emp  = empService.getInfo(id);
        return Result.success(emp);
    }

    // 更新员工信息
    @PutMapping
    public Result update(@RequestBody Emp emp){
        log.info("修改员工信息, {}", emp);
        empService.update(emp);
        return Result.success();
    }
}
