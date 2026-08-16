package com.study.mapper;

import com.study.pojo.Emp;
import com.study.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

// 员工信息
@Mapper
public interface EmpMapper {
//    // 查询符合条件的总记录数
//    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id")
//    public Long count();
//
//    // 分页查询
//    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id" +
//            " order by e.update_time desc limit #{start}, #{pageSize}")
//    public List<Emp> list(int start, int pageSize);

//    // 查询所有的员工及其对应的部门名称  使用pageHelper可以直接查询员工信息，其已封装分页参数
//    @Select("select e.*, d.name deptName from emp as e left join dept as d on e.dept_id = d.id" +
//            " order by e.update_time desc")
//    public List<Emp> list();

    // 条件分页查询  XML实现
    List<Emp> list(EmpQueryParam empQueryParam);

    // 新增员工
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);

    // 批量删除员工
    void deleteByIds(List<Integer> ids);

    // 根据ID查询员工
    Emp getById(Integer id);

    // 更新员工
    void updateById(Emp emp);

    // 统计各个职位的员工人数
    @MapKey("pos")
    List<Map<String, Object>> countEmpJobData();

    // 统计员工性别信息
    @MapKey("name")
    List<Map> countEmpGenderData();

    // 根据用户名和密码查询员工
    @Select("select * from emp where username = #{username} and password = #{password}")
    Emp getUsernameAndPassword(Emp emp);
}
