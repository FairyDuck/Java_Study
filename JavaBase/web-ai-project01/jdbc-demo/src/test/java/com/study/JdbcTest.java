package com.study;

import com.study.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class JdbcTest {
    // JDBC入门程序
    @Test
    public void testUpdate() throws Exception {
        // 1、注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2、获取数据库连接
        String url = "jdbc:mysql://localhost:3306/web01";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url,username,password);
        // 3、获取SQL语句执行对象
        Statement statement = connection.createStatement();

        // 4、执行SQL语句  -- 只需要修改这部分内容
        int i = statement.executeUpdate("update user set age = 30 where id = 1");
        System.out.println("当前操作影响了" + i + "行");

        // 5、释放资源
        statement.close();
        connection.close();
    }

    @Test
    public void testSelect() throws Exception {
        // 1、注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2、获取数据库连接
        String url = "jdbc:mysql://localhost:3306/web01";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url,username,password);
        // 3、执行SQL
        String sql = "select * from user where username = ? and password = ?"; // 预编译SQL
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "daqiao");
        preparedStatement.setString(2, "123456");
        ResultSet resultSet = preparedStatement.executeQuery(); // 封装返回的查询结果
        // 4、处理结果
        while(resultSet.next()) {
            User user = new User(
                    resultSet.getInt("id"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("name"),
                    resultSet.getInt("age")
            );
            System.out.println(user);
        }
        // 5、释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
