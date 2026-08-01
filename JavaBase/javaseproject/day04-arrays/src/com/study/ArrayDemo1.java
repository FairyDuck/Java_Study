package com.study;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class ArrayDemo1 {
    static void main(String[] args) {
        // 静态数组的创建
        // 创建一维数组
        int[] b = {1, 2, 3, 4, 5}; // 中括号放在变量名前面
//        int b[] = {1, 2, 3, 4, 5}; // 中括号放在变量名后面 C语言风格
//        int[] b = new int[]{1,2,3,4,5};
        System.out.println(b[0]);

        // 获取数组的长度
        System.out.println(b.length);

        // -----------------------------------------------------------------------


        // 动态初始化数组
        double[] scores = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+ (i + 1) + "个学生的成绩：" );
            scores[i] = sc.nextDouble();
        }
        sort(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个学生的成绩是：" + scores[i]);
        }

        // -----------------------------------------------------------------------


        // 二维数组
        int[][] aa = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        for (int i = 0; i < aa.length; i++) {
//            for (int j = 0; j < aa[i].length; j++) {
//                System.out.print(aa[i][j] + " ");
//            }
//        }
        // 增强for循环写法
        for (int[] row : aa) {        // 遍历每一行
            for (int num : row) {      // 遍历行中的每个元素
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
