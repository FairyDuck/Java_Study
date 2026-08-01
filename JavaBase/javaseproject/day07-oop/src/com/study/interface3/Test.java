package com.study.interface3;

public class Test {
    static void main(String[] args) {
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 18);
        allStudents[1] = new Student("李四", '男', 20);
        allStudents[2] = new Student("王五", '男', 19);
        allStudents[3] = new Student("赵六", '男', 17);
        allStudents[4] = new Student("孙七", '男', 16);
        allStudents[5] = new Student("周八", '男', 15);
        allStudents[6] = new Student("吴九", '男', 14);
        allStudents[7] = new Student("郑十", '男', 13);
        allStudents[8] = new Student("王十一", '男', 12);
        allStudents[9] = new Student("张十二", '男', 11);

        ClassDataInter classDataInter1 = new ClassDataInterImpl1(allStudents);
        classDataInter1.printAllStudentInfo();
        classDataInter1.printAverageScore();

        ClassDataInter classDataInter2 = new ClassDataInterImpl2(allStudents);
        classDataInter2.printAllStudentInfo();
        classDataInter2.printAverageScore();
    }
}
