package com.study.lambda;

import com.study.innerclass3.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

// 简化lambda表达式
// 1、参数类型全部可以不写
// 2、参数列表只有一个参数时，参数列表可以不写括号
// 3、如果lambda表达式只有一行，方法体可以不写大括号和return，也要去掉分号，并且需要放到同一行

public class LambdaDemo2 {
    static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, '男', 180);
        students[1] = new Student("李四", 19, '女', 170);
        students[2] = new Student("王五", 20, '男', 190);

        // 对学生按年龄升序排序

        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
    }

    public static void test1() {
        JFrame win = new JFrame("登录窗口");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        // java要求必须给按钮添加一个时间监听器对象，就可以反应用户操作
        btn.addActionListener(e -> System.out.println("登录成功") );

        win.setSize(400, 300);
        win.setLocationRelativeTo( null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
