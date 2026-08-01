package com.study.abstract3;

// 模板方法设计模式 --抽象类实现
public class Test {
    static void main(String[] args) {
        // 老师学生都需要完成类似的步骤，其中只有部分步骤不同
        // 抽出一个父类，父类中实现一个模板方法可以直接使用

        Student s = new Student();
        s.write();
    }
}
