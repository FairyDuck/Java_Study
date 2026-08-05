package com.study.demo1hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    static void main(String[] args) {
        // TreeSet集合对于自定义对象的排序
        Set<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        set.add(new Teacher("小王", 18, 1234.2));
        set.add(new Teacher("小张", 22, 1235.4));
        set.add(new Teacher("小李", 19, 1236.3));
        set.add(new Teacher("小胡", 20, 1237.7));
        System.out.println(set);

        // TreeSet集合默认不能给自定义对象排序
        // 1、对象类实现一个Comparable接口，重写compare方法，指定比较规则
        // 2、public TreeSet(Comparator c)集合自带比较器Comparator对象，指定比较规则
    }
}
