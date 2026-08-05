package com.study.demo1hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    public double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // t2.compareTo(t1)
    // t2 == this
    // t1 == o
    // 规定: 升序左减右，降序右减左
    @Override
    public int compareTo(Teacher o) {
        return this.getAge() - o.getAge();
    }
}
