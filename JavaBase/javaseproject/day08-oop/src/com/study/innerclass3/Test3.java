package com.study.innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    static void main(String[] args) {
        // 匿名内部类的使用场景
        JFrame win = new JFrame("登录窗口");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        // java要求必须给按钮添加一个时间监听器对象，就可以反应用户操作
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录成功");
            }
        });

        win.setSize(400, 300);
        win.setLocationRelativeTo( null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
