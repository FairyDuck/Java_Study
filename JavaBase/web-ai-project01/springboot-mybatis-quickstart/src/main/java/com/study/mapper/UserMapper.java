package com.study.mapper;

import com.study.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 运行时会自动创建一个实现类对象，并且会自动存入IOC容器，成为bean对象
public interface UserMapper {
//    @Select("select * from user")
    // 使用XML配置文件
    public List<User> findAll();

    @Select("select * from user where username = #{username} and password = #{password}")
    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Delete("delete from user where id = #{id}")
    public void deleteById(Integer id);

    @Insert("insert into user(username, password, name, age) values(#{username}, #{password}, #{name}, #{age})")
    public void insertUser(User user);

    @Update("update user set username = #{username}, password = #{password}, name = #{name}, age = #{age} where id = #{id}")
    public void updateUser(User user);
}
